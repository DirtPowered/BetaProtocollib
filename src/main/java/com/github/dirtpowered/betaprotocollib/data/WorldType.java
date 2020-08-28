package com.github.dirtpowered.betaprotocollib.data;

public enum WorldType {
    NORMAL, FLAT;

    public static WorldType fromString(String worldType) {
        for (WorldType type : WorldType.values()) {
            if (type.name().equalsIgnoreCase(worldType)) {
                return type;
            }
        }

        return WorldType.NORMAL;
    }
}
