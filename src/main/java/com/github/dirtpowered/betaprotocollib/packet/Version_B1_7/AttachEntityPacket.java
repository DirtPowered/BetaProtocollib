package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.AttachEntityPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class AttachEntityPacket extends AbstractPacket<AttachEntityPacketData> {

    public AttachEntityPacket() {
        super(0x27);
    }

    @Override
    public ByteBuf writePacketData(AttachEntityPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeInt(packet.getVehicleEntityId());
        return buffer;
    }

    @Override
    public AttachEntityPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int vehicleEntityId = buffer.readInt();
        return new AttachEntityPacketData(entityId, vehicleEntityId);
    }
}
