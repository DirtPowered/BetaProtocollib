package com.github.dirtpowered.betaprotocollib.model;

import com.github.dirtpowered.betaprotocollib.BetaLib;
import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.data.version.MinecraftVersion;
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

    protected static BetaItemStack readItemStack(ByteBuf buffer, int itemId) {
        BetaItemStack itemStack = null;
        if (itemId >= 0) {
            int stackSize = buffer.readByte();
            int itemData = buffer.readShort();

            itemStack = new BetaItemStack(itemId, stackSize, itemData);

            if (MinecraftVersion.B_1_9.isNewerOrEqual(BetaLib.getVersion())) {
                return readNBT(buffer, itemStack);
            }
        }

        return itemStack;
    }

    private static BetaItemStack readNBT(ByteBuf buffer, BetaItemStack itemStack) {
        if (!ItemUtil.isEnchantable(itemStack.getBlockId()))
            return itemStack;

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

    public static void writeItemStack(ByteBuf buffer, BetaItemStack item) {
        if (item == null || item.getBlockId() == 0) {
            buffer.writeShort(-1);
        } else {
            buffer.writeShort(item.getBlockId());
            buffer.writeByte(item.getAmount());
            buffer.writeShort(item.getData());

            if (MinecraftVersion.B_1_9.isNewerOrEqual(BetaLib.getVersion())) {
                writeNBT(buffer, item);
            }
        }
    }

    private static void writeNBT(ByteBuf buffer, BetaItemStack itemStack) {
        if (!ItemUtil.isEnchantable(itemStack.getBlockId())) {
            return;
        }

        buffer.writeShort(-1); //TODO: send correct NBT Data
    }

    public final int getPacketId() {
        return this.packetId;
    }

    public abstract ByteBuf writePacketData(T packet) throws IOException;

    public abstract T readPacketData(ByteBuf buffer) throws IOException;
}
