package me.drison64.treasurehunt.objects;

import java.util.Random;

enum ColorEnum {
    GREEN,
    BLUE,
    RED,
    YELLOW;

    public static ColorEnum generateRandomColor() {
        ColorEnum[] values = ColorEnum.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}