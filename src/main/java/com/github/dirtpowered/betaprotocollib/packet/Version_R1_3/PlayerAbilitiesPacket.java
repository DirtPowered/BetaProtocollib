package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3;

import com.github.dirtpowered.betaprotocollib.model.AbstractPacket;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data.V1_3PlayerAbilitiesPacketData;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PlayerAbilitiesPacket extends AbstractPacket<V1_3PlayerAbilitiesPacketData> {

    public PlayerAbilitiesPacket() {
        super(0XCA);
    }

    @Override
    public ByteBuf writePacketData(V1_3PlayerAbilitiesPacketData packet) {
        ByteBuf buffer = Unpooled.buffer();
        byte flag = 0;

        if (packet.isDamageDisabled()) {
            flag = (byte) (flag | 1);
        }

        if (packet.isFlying()) {
            flag = (byte) (flag | 2);
        }

        if (packet.isFlyingAllowed()) {
            flag = (byte) (flag | 4);
        }

        if (packet.isCreativeMode()) {
            flag = (byte) (flag | 8);
        }

        buffer.writeByte(flag);
        buffer.writeByte((int) (packet.getFlyingSpeed() * 255.0F));
        buffer.writeByte((int) (packet.getWalkingSpeed() * 255.0F));
        return buffer;
    }

    @Override
    public V1_3PlayerAbilitiesPacketData readPacketData(ByteBuf buffer) {
        byte flags = buffer.readByte();
        boolean disableDamage = ((flags & 1) > 0);
        boolean flying = ((flags & 2) > 0);
        boolean allowFlying = ((flags & 4) > 0);
        boolean creativeMode = ((flags & 8) > 0);
        float flySpeed = ((float) buffer.readByte() / 255.0F);
        float walkSpeed = ((float) buffer.readByte() / 255.0F);
        return new V1_3PlayerAbilitiesPacketData(disableDamage, flying, allowFlying, creativeMode, flySpeed, walkSpeed);
    }
}
