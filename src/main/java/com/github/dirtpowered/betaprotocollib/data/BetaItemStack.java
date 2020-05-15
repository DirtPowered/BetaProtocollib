package com.github.dirtpowered.betaprotocollib.data;

public class BetaItemStack {

    private int blockId;
    private int amount;
    private int data;

    public BetaItemStack() {
        this.blockId = 0;
        this.amount = 0;
        this.data = 0;
    }

    public BetaItemStack(int blockId) {
        this.blockId = blockId;
        this.amount = 0;
        this.data = 0;
    }

    public BetaItemStack(int blockId, int amount, int data) {
        this.blockId = blockId;
        this.amount = amount;
        this.data = data;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
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

    @Override
    public String toString() {
        return "BetaItemStack{"
                + "blockId=" + blockId
                + ", amount=" + amount
                + ", data=" + data
                + '}';
    }
}
