package com.Nxer.TwistSpaceTechnology.common.machine.singleBlock.hatch;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;

import com.Nxer.TwistSpaceTechnology.util.TextEnums;
import com.Nxer.TwistSpaceTechnology.util.TextLocalization;
import com.gtnewhorizons.modularui.api.screen.ModularWindow;
import com.gtnewhorizons.modularui.api.screen.UIBuildContext;

import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import tectech.thing.metaTileEntity.hatch.MTEHatchUncertainty;
import tectech.util.CommonValues;

public class GT_MetaTileEntity_Hatch_UncertaintyDebug extends MTEHatchUncertainty {

    public GT_MetaTileEntity_Hatch_UncertaintyDebug(int aID, String aName, String aNameRegional, int aTier) {
        super(aID, aName, aNameRegional, aTier);
    }

    public GT_MetaTileEntity_Hatch_UncertaintyDebug(String aName, int aTier, String[] aDescription,
        ITexture[][][] aTextures) {
        super(aName, aTier, aDescription, aTextures);
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new GT_MetaTileEntity_Hatch_UncertaintyDebug(mName, mTier, mDescriptionArray, mTextures);
    }

    @Override
    public String[] getDescription() {
        return new String[] { CommonValues.TEC_MARK_EM,
            // #tr DebugUncertaintyHatch.getDescription.02
            // # Solve the impossible.
            // #zh_CN 解决不可能解决的问题.
            TextEnums.tr("DebugUncertaintyHatch.getDescription.02"),
            "" + EnumChatFormatting.AQUA + EnumChatFormatting.BOLD
            // #tr DebugUncertaintyHatch.getDescription.01
            // # The quantum world collapses.
            // #zh_CN 量子世界坍塌.
                + TextEnums.tr("DebugUncertaintyHatch.getDescription.01"),
            TextLocalization.ModNameDesc };
    }

    @Override
    public boolean onRightclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        return false;
    }

    @Override
    public byte compute() {
        return 0;
    }

    /**
     * Return 0 means no uncertainty.
     */
    @Override
    public byte update(int newMode) {
        return 0;
    }

    @Override
    public void regenerate() {}

    @Override
    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {}

    @Override
    public void addUIWidgets(ModularWindow.Builder builder, UIBuildContext buildContext) {}
}
