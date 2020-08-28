package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data.V1_7_3AttachEntityPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class AttachEntityPacket extends AbstractPacket<V1_7_3AttachEntityPacketData> {

    public AttachEntityPacket() {
        super(0x27);
    }

    @Override
    public ByteBuf writePacketData(V1_7_3AttachEntityPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeInt(packet.getEntityId());
        buffer.writeInt(packet.getVehicleEntityId());
        return buffer;
    }

    @Override
    public V1_7_3AttachEntityPacketData readPacketData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        int vehicleEntityId = buffer.readInt();
        return new V1_7_3AttachEntityPacketData(entityId, vehicleEntityId);
    }
}
