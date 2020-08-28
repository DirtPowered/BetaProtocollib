package com.github.dirtpowered.betaprotocollib.model;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.type.ItemStackType;
import com.github.dirtpowered.betaprotocollib.utils.ItemUtil;
import com.mojang.nbt.CompoundTag;
import com.mojang.nbt.NbtIo;
import io.netty.buffer.ByteBuf;

import java.io.IOException;

public abstract class AbstractPacket<T extends Packet> {
    private int packetId;

    public AbstractPacket(final int packetId) {
        this.packetId = packetId;
    }

    protected static void writeByteArray(ByteBuf buffer, byte[] data) {
        buffer.writeShort(data.length);
        buffer.writeBytes(data);
    }

    protected static byte[] readByteArray(ByteBuf buffer) throws IOException {
        short size = buffer.readShort();

        if (size < 0) {
            throw new IOException("Byte array with 0 length!");
        } else {
            byte[] data = new byte[size];
            buffer.readBytes(data);
            return data;
        }
    }

    public static void writeString(String string, ByteBuf buffer) {
        if (string.length() > 32767) {
            System.out.println("String too big");
        } else {
            buffer.writeShort(string.length());
            for (char c : string.toCharArray()) buffer.writeChar(c);
        }
    }

    public static String readString(ByteBuf buffer, int maxcap) {
        short size = buffer.readShort();
        if (size > maxcap) {
            System.out.println("Received string length longer than maximum allowed (" + size + " > " + /*27070*/maxcap + ")");
        } else if (size < 0) {
            System.out.println("Received string length is less than zero! Weird string!");
        } else {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < size; ++i) {
                builder.append(buffer.readChar());
            }

            return builder.toString();
        }

        return null;
    }

    protected static BetaItemStack readItemStack(ByteBuf buffer, int itemId, ItemStackType type) {
        BetaItemStack itemStack = null;

        if (itemId >= 0) {
            int stackSize = buffer.readByte();
            int itemData = buffer.readShort();

            itemStack = new BetaItemStack(itemId, stackSize, itemData);

            if (type == ItemStackType.ITEM_B1_9 || type == ItemStackType.ITEM_R1_3) {
                return readNBT(buffer, itemStack, type);
            }
        }

        return itemStack;
    }

    private static BetaItemStack readNBT(ByteBuf buffer, BetaItemStack itemStack, ItemStackType type) {
        if (type == ItemStackType.ITEM_B1_9 && !ItemUtil.isDamageable(itemStack.getBlockId())) {
            return itemStack;
        }

        short size = buffer.readShort();

        if (size < 0) {
            return itemStack;
        } else {
            byte[] compressedNBT = new byte[size];
            buffer.readBytes(compressedNBT);
            try {
                CompoundTag tag = NbtIo.decompress(compressedNBT);
                itemStack.setNbt(tag);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return itemStack;
        }
    }

    private static void writeNBT(ByteBuf buffer, BetaItemStack itemStack) {
        if (!ItemUtil.isDamageable(itemStack.getBlockId()) && !itemStack.isOverrideDefault())
            return;

        try {
            if (itemStack.hasNbt()) {
                byte[] data = NbtIo.compress(itemStack.getNbt());
                buffer.writeShort((short) data.length);
                buffer.writeBytes(data);
            } else {
                buffer.writeShort(-1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeItemStack(ByteBuf buffer, BetaItemStack item, ItemStackType type) {
        if (item == null || item.getBlockId() == 0) {
            buffer.writeShort(-1);
        } else {
            buffer.writeShort(item.getBlockId());
            buffer.writeByte(item.getAmount());
            buffer.writeShort(item.getData());

            if (type == ItemStackType.ITEM_B1_9 || type == ItemStackType.ITEM_R1_3) {
                writeNBT(buffer, item);
            }
        }
    }

    public final int getPacketId() {
        return this.packetId;
    }

    public abstract ByteBuf writePacketData(T packet) throws IOException;

    public abstract T readPacketData(ByteBuf buffer) throws IOException;
}
