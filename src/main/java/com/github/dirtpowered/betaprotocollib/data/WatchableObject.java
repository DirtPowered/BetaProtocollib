package com.github.dirtpowered.betaprotocollib.data;

public class WatchableObject {
    private int type;
    private int index;
    private Object value;

    WatchableObject(int type, int index, Object value) {
        this.type = type;
        this.index = index;
        this.value = value;
    }

    int getType() {
        return type;
    }

    int getIndex() {
        return index;
    }

    Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "WatchableObject [type=" + type + ", index=" + index + ", value=" + value + "]";
    }
}
