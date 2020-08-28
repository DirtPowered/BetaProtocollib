package com.github.dirtpowered.betaprotocollib.data;

import com.mojang.nbt.CompoundTag;

public class BetaItemStack {
    private int blockId;
    private int amount;
    private int data;
    private CompoundTag nbt;
    private boolean overrideDefault;

    public BetaItemStack() {
        this.blockId = 0;
        this.amount = 0;
        this.data = 0;
        this.overrideDefault = false;
    }

    public BetaItemStack(int blockId) {
        this.blockId = blockId;
        this.amount = 0;
        this.data = 0;
        this.overrideDefault = false;
    }

    public BetaItemStack(int blockId, int amount, int data) {
        this.blockId = blockId;
        this.amount = amount;
        this.data = data;
        this.overrideDefault = false;
    }

    public BetaItemStack(int blockId, int amount, int data, CompoundTag nbtTags) {
        this.blockId = blockId;
        this.amount = amount;
        this.data = data;
        this.nbt = nbtTags;
        this.overrideDefault = false;
    }

    public int getBlockId() {
        return blockId;
    }

    public int getAmount() {
        return amount;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CompoundTag getNbt() {
        return nbt;
    }

    public void setNbt(CompoundTag nbt) {
        this.nbt = nbt;
    }

    public boolean hasNbt() {
        return nbt != null;
    }

    public boolean isOverrideDefault() {
        return overrideDefault;
    }

    public void setOverrideDefault(boolean overrideDefault) {
        this.overrideDefault = overrideDefault;
    }

    @Override
    public String toString() {
        return "BetaItemStack{"
                + "blockId=" + blockId
                + ", amount=" + amount
                + ", data=" + data
                + ", nbt=" + nbt
                + ", overrideDefault=" + overrideDefault
                + '}';
    }
}
