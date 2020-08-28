package com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.data;

import com.github.dirtpowered.betaprotocollib.data.BetaItemStack;
import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_9.WindowClickPacket;

public class V1_9WindowClickPacketData extends Packet<WindowClickPacket> {
    private int windowId;
    private int inventorySlot;
    private int mouseClick;
    private short action;
    private BetaItemStack itemStack;
    private boolean shiftPressed;

    public V1_9WindowClickPacketData(int windowId, int inventorySlot, int mouseClick, short action, BetaItemStack betaItemStack, boolean shiftPressed) {
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

    public short getAction() {
        return action;
    }

    public BetaItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public Class<WindowClickPacket> getPacketClass() {
        return WindowClickPacket.class;
    }

    @Override
    public String toString() {
        return "V1_9WindowClickPacketData{"
                + "windowId=" + windowId
                + ", inventorySlot=" + inventorySlot
                + ", mouseClick=" + mouseClick
                + ", action=" + action
                + ", itemStack=" + itemStack
                + ", shiftPressed=" + shiftPressed
                + '}';
    }
}
