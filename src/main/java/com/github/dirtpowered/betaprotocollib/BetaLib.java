package com.github.dirtpowered.betaprotocollib;

import com.github.dirtpowered.betaprotocollib.data.version.MinecraftVersion;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_B1_7;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_B1_8;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_B1_9;
import com.github.dirtpowered.betaprotocollib.registry.PacketRegistry;

public class BetaLib {
    private static PacketRegistry registry;

    public static void inject(MinecraftVersion version) {
        registry = new PacketRegistry();

        //register packets
        switch (version) {
            case B_1_6_6:
                new Protocol_B1_7(registry);
                break;
            case B_1_7_3:
                new Protocol_B1_7(registry);
                break;
            case B_1_8_1:
                new Protocol_B1_8(registry);
                break;
            case B_1_9:
                new Protocol_B1_9(registry);
                break;
        }
    }

    public static PacketRegistry getRegistry() {
        return registry;
    }
}
