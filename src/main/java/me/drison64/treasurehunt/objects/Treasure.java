package me.drison64.treasurehunt.objects;

import org.bukkit.block.Block;

public class Treasure {

    private Block block;
    private TreasureType treasureType;

    public Treasure(Block block) {
        this.block = block;
        this.treasureType = TreasureType.generateRandomColor();
    }
}
