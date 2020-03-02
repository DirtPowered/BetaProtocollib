package com.github.dirtpowered.betaprotocollib.packet;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.data.BlockItemSwitchPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class BlockItemSwitchPacket extends AbstractPacket<BlockItemSwitchPacketData> {

    public BlockItemSwitchPacket() {
        super(0x10);
    }

    @Override
    public ByteBuf writePacketData(BlockItemSwitchPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShort(packet.getSlot());
        return buffer;
    }

    @Override
    public BlockItemSwitchPacketData readPacketData(ByteBuf buffer) {
        int slot = buffer.readShort();
        return new BlockItemSwitchPacketData(slot);
    }
}
