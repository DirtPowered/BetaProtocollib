package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.UpdateProgressPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class UpdateProgressPacket extends AbstractPacket<UpdateProgressPacketData> {

    public UpdateProgressPacket() {
        super(0x69);
    }

    @Override
    public ByteBuf writePacketData(UpdateProgressPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(packet.getWindowId());
        buffer.writeShort(packet.getProgressBar());
        buffer.writeShort(packet.getProgressBarValue());
        return buffer;
    }

    @Override
    public UpdateProgressPacketData readPacketData(ByteBuf buffer) {
        int windowId = buffer.readByte();
        int progressBar = buffer.readShort();
        int progressBarValue = buffer.readShort();
        return new UpdateProgressPacketData(windowId, progressBar, progressBarValue);
    }
}
