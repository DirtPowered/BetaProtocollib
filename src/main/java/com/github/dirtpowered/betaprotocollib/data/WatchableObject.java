package com.github.dirtpowered.betaprotocollib.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WatchableObject {
    private int type;
    private int index;
    private Object value;
}
