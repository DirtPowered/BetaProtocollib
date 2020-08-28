package com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_B1_7.UpdateProgressPacket;

public class V1_7_3UpdateProgressPacketData extends Packet<UpdateProgressPacket> {

    private int windowId;
    private int progressBar;
    private int progressBarValue;

    public V1_7_3UpdateProgressPacketData(int windowId, int progressBar, int progressBarValue) {
        this.windowId = windowId;
        this.progressBar = progressBar;
        this.progressBarValue = progressBarValue;
    }

    public int getWindowId() {
        return windowId;
    }

    public int getProgressBar() {
        return progressBar;
    }

    public int getProgressBarValue() {
        return progressBarValue;
    }

    @Override
    public Class<UpdateProgressPacket> getPacketClass() {
        return UpdateProgressPacket.class;
    }

    @Override
    public String toString() {
        return "V1_7_3UpdateProgressPacketData{"
                + "windowId=" + windowId
                + ", progressBar=" + progressBar
                + ", progressBarValue=" + progressBarValue
                + '}';
    }
}
