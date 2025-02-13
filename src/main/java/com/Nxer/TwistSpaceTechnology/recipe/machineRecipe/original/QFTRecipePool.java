package com.Nxer.TwistSpaceTechnology.recipe.machineRecipe.original;

import static com.Nxer.TwistSpaceTechnology.util.enums.TierEU.RECIPE_UHV;
import static com.Nxer.TwistSpaceTechnology.util.enums.TierEU.RECIPE_UV;
import static gregtech.api.util.GTRecipeConstants.QFT_CATALYST;
import static gregtech.api.util.GTRecipeConstants.QFT_FOCUS_TIER;

import com.Nxer.TwistSpaceTechnology.recipe.IRecipePool;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.interfaces.IRecipeMap;
import gtPlusPlus.api.recipe.GTPPRecipeMaps;
import gtPlusPlus.core.item.chemistry.GenericChem;
import gtPlusPlus.core.util.minecraft.ItemUtils;
import gtnhlanth.common.register.WerkstoffMaterialPool;

public class QFTRecipePool implements IRecipePool {

    @Override
    public void loadRecipes() {
        final IRecipeMap QFT = GTPPRecipeMaps.quantumForceTransformerRecipes;

        // Palladium
        // GTValues.RA.stdBuilder()
        // .itemInputs(
        // WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 64),
        // WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 64),
        // ItemUtils.getSimpleStack(GenericChem.mPlatinumGroupCatalyst, 0))
        // .itemOutputs(
        // Materials.Palladium.getDust(64),
        // Materials.Palladium.getDust(64),
        // Materials.Palladium.getDust(64),
        // Materials.Palladium.getDust(64),
        // Materials.Palladium.getDust(64),
        // Materials.Palladium.getDust(64))
        // .outputChances(1667, 1667, 1667, 1667, 1667, 1667)
        // .noOptimize()
        // .specialValue(1)
        // .eut(RECIPE_UV)
        // .duration(400)
        // .addTo(QFT);

        // Osmium
        // GTValues.RA.stdBuilder()
        // .itemInputs(
        // WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 32),
        // ItemUtils.getSimpleStack(GenericChem.mPlatinumGroupCatalyst, 0))
        // .itemOutputs(
        // Materials.Osmium.getDust(64),
        // Materials.Iridium.getDust(64),
        // Materials.Nickel.getDust(64),
        // Materials.Copper.getDust(64),
        // Materials.Gold.getDust(64),
        // Materials.Silicon.getDust(64))
        // .outputChances(1667, 1667, 1667, 1667, 1667, 1667)
        // .noOptimize()
        // .specialValue(1)
        // .eut(RECIPE_UV)
        // .duration(400)
        // .addTo(QFT);

        // Iridium
        // GTValues.RA.stdBuilder()
        // .itemInputs(
        // WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 8),
        // ItemUtils.getSimpleStack(GenericChem.mPlatinumGroupCatalyst, 0))
        // .itemOutputs(
        // Materials.Iridium.getDust(64),
        // Materials.Nickel.getDust(64),
        // Materials.Copper.getDust(64),
        // Materials.Gold.getDust(64),
        // Materials.Silicon.getDust(64))
        // .outputChances(2000, 2000, 2000, 2000, 2000)
        // .noOptimize()
        // .specialValue(1)
        // .eut(RECIPE_UV)
        // .duration(400)
        // .addTo(QFT);

        // Rh? Ru?
        // GTValues.RA.stdBuilder()
        // .itemInputs(
        // WerkstoffLoader.LeachResidue.get(OrePrefixes.dust, 16),
        // WerkstoffLoader.CrudeRhMetall.get(OrePrefixes.dust, 16),
        // ItemUtils.getSimpleStack(GenericChem.mPlatinumGroupCatalyst, 0))
        // .itemOutputs(
        // WerkstoffLoader.Ruthenium.get(OrePrefixes.dust, 64),
        // WerkstoffLoader.Rhodium.get(OrePrefixes.dust, 64),
        // Materials.Iridium.getDust(64),
        // Materials.Osmium.getDust(64))
        // .outputChances(2000, 2000, 2000, 2000)
        // .noOptimize()
        // .specialValue(1)
        // .eut(RECIPE_UV)
        // .duration(400)
        // .addTo(QFT);

        // FeTiO3
        GTValues.RA.stdBuilder()
            .itemInputs(Materials.Ilmenite.getDust(32))
            .itemOutputs(
                Materials.Iron.getDust(64),
                Materials.Titanium.getDust(64),
                Materials.Niobium.getDust(64),
                Materials.Tantalum.getDust(64),
                Materials.Manganese.getDust(64),
                Materials.Magnesium.getDust(64))
            .outputChances(1667, 1667, 1667, 1667, 1667, 1667)
            .noOptimize()
            .metadata(QFT_CATALYST, ItemUtils.getSimpleStack(GenericChem.mTitaTungstenIndiumCatalyst, 0))
            .metadata(QFT_FOCUS_TIER, 1)
            .eut(RECIPE_UV)
            .duration(400)
            .addTo(QFT);

        // Samarium
        GTValues.RA.stdBuilder()
            .itemInputs(WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 32))
            .itemOutputs(
                Materials.Samarium.getDust(64),
                Materials.Gadolinium.getDust(64),
                Materials.Phosphorus.getDust(64),
                Materials.Thorium.getDust(64),
                WerkstoffLoader.Thorium232.get(OrePrefixes.dust, 64))
            .outputChances(2000, 2000, 2000, 2000, 2000)
            .noOptimize()
            .metadata(QFT_CATALYST, ItemUtils.getSimpleStack(GenericChem.mRareEarthGroupCatalyst, 0))
            .metadata(QFT_FOCUS_TIER, 2)
            .eut(RECIPE_UHV)
            .duration(400)
            .addTo(QFT);

        // Cerium
        GTValues.RA.stdBuilder()
            .itemInputs(WerkstoffMaterialPool.CeriumRichMixture.get(OrePrefixes.dust, 32))
            .itemOutputs(
                Materials.Cerium.getDust(64),
                Materials.Lanthanum.getDust(64),
                Materials.Neodymium.getDust(64),
                Materials.Europium.getDust(64),
                Materials.Uranium.getDust(64),
                Materials.Uranium235.getDust(64))
            .outputChances(1667, 1667, 1667, 1667, 1667, 1667)
            .noOptimize()
            .metadata(QFT_CATALYST, ItemUtils.getSimpleStack(GenericChem.mRareEarthGroupCatalyst, 0))
            .metadata(QFT_FOCUS_TIER, 2)
            .eut(RECIPE_UHV)
            .duration(400)
            .addTo(QFT);
    }
}
