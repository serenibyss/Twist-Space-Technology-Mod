package com.Nxer.TwistSpaceTechnology.recipe.machineRecipe.original;

import static gregtech.api.enums.TierEU.RECIPE_IV;

import com.Nxer.TwistSpaceTechnology.common.init.GTCMItemList;
import com.Nxer.TwistSpaceTechnology.common.material.MaterialPool;
import com.Nxer.TwistSpaceTechnology.recipe.IRecipePool;

import gregtech.api.enums.GTValues;
import gregtech.api.interfaces.IRecipeMap;
import gregtech.api.recipe.RecipeMaps;

public class DistillationRecipePool implements IRecipePool {

    @Override
    public void loadRecipes() {

        final IRecipeMap DT = RecipeMaps.distillationTowerRecipes;

        GTValues.RA.stdBuilder()
            .fluidInputs(MaterialPool.LiquidMana.getFluidOrGas(1000))
            .itemOutputs(GTCMItemList.VoidPollen.get(1))
            .fluidOutputs(MaterialPool.PurifiedMana.getFluidOrGas(800))
            .outputChances(100)
            .noOptimize()
            .eut(RECIPE_IV)
            .duration(200)
            .addTo(DT);
    }
}
