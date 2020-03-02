package com.github.dirtpowered.betaprotocollib.utils;

public class BetaItemStack {

    private int blockId;
    private int amount;
    private int data;

    public BetaItemStack(int blockId, int amount, int data) {
        this.blockId = blockId;
        this.amount = amount;
        this.data = data;
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
}
