package com.github.dirtpowered.betaprotocollib.utils;

import java.util.Arrays;

public class ItemUtil {
    private static int[] damageableItems;

    static {
        damageableItems = new int[]{
                259, 261, 346, 359, 268, 269, 270, 271,
                290, 291, 292, 293, 314, 315, 316, 317,
                272, 273, 274, 275, 267, 256, 257, 258,
                276, 277, 278, 279, 283, 284, 285, 286,
                298, 299, 300, 301, 302, 303, 304, 305,
                306, 307, 308, 309, 310, 311, 312, 313, 294
        };
    }

    public static boolean isDamageable(int itemId) {
        return Arrays.stream(damageableItems).anyMatch(i -> i == itemId);
    }
}
