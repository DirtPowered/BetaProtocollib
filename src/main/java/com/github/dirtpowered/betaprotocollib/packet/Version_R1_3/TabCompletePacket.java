package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3TabCompletePacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class TabCompletePacket extends AbstractPacket<V1_3TabCompletePacketData> {

    public TabCompletePacket() {
        super(0xCB);
    }

    @Override
    public ByteBuf writePacketData(V1_3TabCompletePacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        writeString(packet.getText(), buffer);
        return buffer;
    }

    @Override
    public V1_3TabCompletePacketData readPacketData(ByteBuf buffer) {
        String text = readString(buffer, 119);
        return new V1_3TabCompletePacketData(text);
    }
}
