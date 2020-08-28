package com.github.dirtpowered.betaprotocollib.data.version;

public enum MinecraftVersion {
    B_1_6_6(13),
    B_1_7_3(14),
    B_1_8_1(17),
    B_1_9(22),
    R1_1(23),
    R1_2_2(28),
    R1_2_4(29),
    R1_3_1(39);

    private int protocolVersion;

    MinecraftVersion(int protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public static MinecraftVersion fromProtocolVersion(int protocolVersion) {
        for (MinecraftVersion version : MinecraftVersion.values()) {
            if (version.protocolVersion == protocolVersion) {
                return version;
            }
        }

        return null;
    }

    public int getProtocolVersion() {
        return protocolVersion;
    }

    public boolean isNewerOrEqual(MinecraftVersion version) {
        return version.getProtocolVersion() >= getProtocolVersion();
    }
}
