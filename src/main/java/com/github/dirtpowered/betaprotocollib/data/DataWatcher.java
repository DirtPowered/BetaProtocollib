package com.github.dirtpowered.betaprotocollib.data;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.utils.BlockLocation;
import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.List;

public class DataWatcher {

    public static void writeMetadata(ByteBuf buffer, List<WatchableObject> watchableObjects) {
        for (WatchableObject watchableObject : watchableObjects) {
            int header = (watchableObject.getType() << 5 | watchableObject.getIndex() & 31) & 255;
            buffer.writeByte(header);
            switch (watchableObject.getType()) {
                case 0:
                    buffer.writeByte((Byte) watchableObject.getValue());
                    break;
                case 1:
                    buffer.writeShort((Short) watchableObject.getValue());
                    break;
                case 2:
                    buffer.writeInt((Integer) watchableObject.getValue());
                    break;
                case 3:
                    buffer.writeFloat((Float) watchableObject.getValue());
                    break;
                case 4:
                    AbstractPacket.writeString((String) watchableObject.getValue(), buffer);
                    break;
                case 5:
                    BetaItemStack itemStack = (BetaItemStack) watchableObject.getValue();
                    AbstractPacket.writeItemStack(buffer, itemStack);
                    break;
                case 6:
                    BlockLocation location = (BlockLocation) watchableObject.getValue();
                    buffer.writeInt(location.getX());
                    buffer.writeInt(location.getY());
                    buffer.writeInt(location.getZ());
            }
        }
    }

    public static List<WatchableObject> readMetadata(ByteBuf buffer) {
        ArrayList<WatchableObject> dataMap = null;

        for (byte var2 = buffer.readByte(); var2 != 127; var2 = buffer.readByte()) {
            if (dataMap == null) {
                dataMap = new ArrayList<>();
            }

            int type = (var2 & 224) >> 5;
            int index = var2 & 0x1f;
            WatchableObject value = null;
            switch (type) {
                case 0:
                    value = new WatchableObject(type, index, buffer.readByte());
                    break;
                case 1:
                    value = new WatchableObject(type, index, buffer.readShort());
                    break;
                case 2:
                    value = new WatchableObject(type, index, buffer.readInt());
                    break;
                case 3:
                    value = new WatchableObject(type, index, buffer.readFloat());
                    break;
                case 4:
                    value = new WatchableObject(type, index, AbstractPacket.readString(buffer, 64));
                    break;
                case 5:
                    short blockId = buffer.readShort();
                    byte amount = buffer.readByte();
                    short blockData = buffer.readShort();
                    value = new WatchableObject(type, index, new BetaItemStack(blockId, amount, blockData));
                    break;
                case 6:
                    int x = buffer.readInt();
                    int y = buffer.readInt();
                    int z = buffer.readInt();
                    value = new WatchableObject(type, index, new BlockLocation(x, y, z));
            }

            dataMap.add(value);
        }

        return dataMap;
    }
}
