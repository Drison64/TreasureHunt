package me.drison64.treasurehunt.objects;

import java.util.Random;

public enum TreasureType {

    ONE,
    TWO;

    public static TreasureType generateRandomColor() {
        TreasureType[] values = TreasureType.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }

}
