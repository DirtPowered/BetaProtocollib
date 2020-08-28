package com.github.dirtpowered.betaprotocollib.data;

public class WatchableObject {
    private int type;
    private int index;
    private Object value;

    public WatchableObject(int type, int index, Object value) {
        this.type = type;
        this.index = index;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "WatchableObject{"
                + "type=" + type
                + ", index=" + index
                + ", value=" + value
                + '}';
    }
}
