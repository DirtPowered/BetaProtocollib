package com.github.dirtpowered.betaprotocollib.packet.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.WindowClickPacket;

public class WindowClickPacketData extends Packet {
    private int windowId;
    private int inventorySlot;
    private int mouseClick;
    private int action;
    private BetaItemStack itemStack;
    private boolean shiftPressed;

    public WindowClickPacketData(int windowId, int inventorySlot, int mouseClick, short action, BetaItemStack betaItemStack, boolean shiftPressed) {
        this.windowId = windowId;
        this.inventorySlot = inventorySlot;
        this.mouseClick = mouseClick;
        this.action = action;
        this.itemStack = betaItemStack;
        this.shiftPressed = shiftPressed;
    }

    public boolean isShiftPressed() {
        return shiftPressed;
    }

    public int getWindowId() {
        return windowId;
    }

    public int getInventorySlot() {
        return inventorySlot;
    }

    public int getMouseClick() {
        return mouseClick;
    }

    public int getAction() {
        return action;
    }

    public BetaItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public <T> Class<T> getPacketClass() {
        return (Class<T>) WindowClickPacket.class;
    }
}
