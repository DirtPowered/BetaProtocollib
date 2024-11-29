package com.github.dirtpowered.betaprotocollib;

import com.github.dirtpowered.betaprotocollib.data.version.MinecraftVersion;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_B1_7;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_B1_8;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_B1_9;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_R_1_1;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_R_1_2;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_R_1_3;
import com.github.dirtpowered.betaprotocollib.packet.protocol.Protocol_R_1_4;
import com.github.dirtpowered.betaprotocollib.registry.PacketRegistry;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class BetaLib {

    @Getter
    private static PacketRegistry registry;

    @Getter
    private static MinecraftVersion version;

    private static final Map<MinecraftVersion, PacketRegistry> registeredProtocols = new HashMap<>();

    public static void inject(MinecraftVersion _version) {
        version = _version;

        //register packets
        registry = getPacketsForVersion(_version);
        registry.populateCache();
    }

    private static PacketRegistry getPacketsForVersion(MinecraftVersion version) {
        PacketRegistry registry = new Protocol_B1_7();

        switch (version) {
            case B_1_6_6:
            case B_1_7_3:
                registry = new Protocol_B1_7();
                break;
            case B_1_8_1:
                registry = new Protocol_B1_8();
                break;
            case B_1_9:
                registry = new Protocol_B1_9();
                break;
            case R1_1:
                registry = new Protocol_R_1_1();
                break;
            case R1_2_2:
            case R1_2_4:
                registry = new Protocol_R_1_2();
                break;
            case R1_3_1:
                registry = new Protocol_R_1_3();
                break;
            case R1_4_1:
                registry = new Protocol_R_1_4();
                break;
        }

        return registry;
    }

    public static void injectAll() {
        for (MinecraftVersion version : MinecraftVersion.values()) {
            registeredProtocols.put(version, getPacketsForVersion(version));
        }
    }

    public static PacketRegistry getRegistryFor(MinecraftVersion version) {
        return registeredProtocols.get(version);
    }

    public static void setDefaultVersion(MinecraftVersion ver) {
        BetaLib.version = ver;
    }
}