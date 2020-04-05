package com.github.dirtpowered.betaprotocollib.data.version;

public enum MinecraftVersion {
    B1_7_3(14),
    B_1_8_1(17);

    private int protocolVersion;

    MinecraftVersion(int protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public int getProtocolVersion() {
        return protocolVersion;
    }
}
