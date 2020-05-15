package com.github.dirtpowered.betaprotocollib.data.version;

public enum MinecraftVersion {
    B_1_6_6(13),
    B_1_7_3(14),
    B_1_8_1(17),
    B_1_9(22);

    private int protocolVersion;

    MinecraftVersion(int protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public int getProtocolVersion() {
        return protocolVersion;
    }
}
