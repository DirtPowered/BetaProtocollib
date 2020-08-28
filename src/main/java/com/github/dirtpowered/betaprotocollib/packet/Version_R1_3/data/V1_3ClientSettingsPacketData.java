package com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.data;

import com.github.dirtpowered.betaprotocollib.model.Packet;
import com.github.dirtpowered.betaprotocollib.packet.Version_R1_3.ClientSettingsPacket;

public class V1_3ClientSettingsPacketData extends Packet<ClientSettingsPacket> {
    private String locale;
    private int viewDistance;
    private int chatFlags;
    private int difficulty;
    private boolean colors;

    public V1_3ClientSettingsPacketData(String locale, int viewDistance, int chatFlags, int difficulty, boolean colors) {
        this.locale = locale;
        this.viewDistance = viewDistance;
        this.chatFlags = chatFlags;
        this.difficulty = difficulty;
        this.colors = colors;
    }

    public String getLocale() {
        return locale;
    }

    public int getViewDistance() {
        return viewDistance;
    }

    public int getChatFlags() {
        return chatFlags;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public boolean areColorsEnabled() {
        return colors;
    }

    @Override
    public Class<ClientSettingsPacket> getPacketClass() {
        return ClientSettingsPacket.class;
    }

    @Override
    public String toString() {
        return "V1_3ClientSettingsPacketData{"
                + "locale='" + locale + '\''
                + ", viewDistance=" + viewDistance
                + ", chatFlags=" + chatFlags
                + ", difficulty=" + difficulty
                + ", colors=" + colors
                + '}';
    }
}
