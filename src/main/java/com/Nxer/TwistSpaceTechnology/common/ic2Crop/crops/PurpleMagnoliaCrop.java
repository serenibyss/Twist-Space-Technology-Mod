package com.Nxer.TwistSpaceTechnology.common.ic2Crop.crops;

import net.minecraft.item.ItemStack;

import com.Nxer.TwistSpaceTechnology.common.ic2Crop.AbstractTstCrop;
import com.Nxer.TwistSpaceTechnology.common.init.GTCMItemList;

import ic2.api.crops.ICropTile;

public class PurpleMagnoliaCrop extends AbstractTstCrop {

    public PurpleMagnoliaCrop() {
        super();
    }

    @Override
    public int tier() {
        return 5;
    }

    @Override
    public boolean canGrow(ICropTile crop) {
        return crop.getSize() < 5;
    }

    @Override
    public int getEmittedLight(ICropTile crop) {
        if (crop.getSize() >= 3) return 2;
        else return 0;
    }

    @Override
    public int stat(int n) {
        switch (n) {
            case 0:
                return 2; // chemical usages
            case 1:
                return 0; // not edible
            case 2:
                return 0; // no defensive properties
            case 3:
                return 4; // quite colorful
            case 4:
                return 0; // not particularly weed-like
            default:
                return 0;
        }
    }

    @Override
    public int maxSize() {
        return 5;
    }

    @Override
    public ItemStack getDisplayItem() {
        return GTCMItemList.PurpleMagnoliaPetal.get(1);
    }

    @Override
    public String name() {
        return "Purple Magnolia";
    }

    @Override
    public String[] attributes() {
        return new String[] { "Purple", "Flower", "Magic" };
    }

    @Override
    public ItemStack getGain(ICropTile crop) {
        return GTCMItemList.PurpleMagnoliaPetal.get(1);
    }

}
