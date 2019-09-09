package com.github.alexthe666.rats.server.recipes;

import com.github.alexthe666.rats.server.blocks.RatsBlockRegistry;
import com.github.alexthe666.rats.server.items.RatsItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.BannerPattern;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.List;

public class RatsRecipeRegistry {

    public static List<SharedRecipe> CAULDRON_RECIPES = new ArrayList<>();
    public static List<SharedRecipe> RAT_CHEF_RECIPES = new ArrayList<>();

    public static void preRegister(){
        RAT_CHEF_RECIPES.add(new SharedRecipe(new ItemStack(RatsItemRegistry.ASSORTED_VEGETABLES), new ItemStack(RatsItemRegistry.CONFIT_BYALDI)));
        RAT_CHEF_RECIPES.add(new SharedRecipe(new ItemStack(RatsItemRegistry.CHEESE), new ItemStack(RatsItemRegistry.STRING_CHEESE, 4)));
    }

    public static void register(){
        CAULDRON_RECIPES.add(new SharedRecipe(new ItemStack(Items.MILK_BUCKET), new ItemStack(RatsBlockRegistry.BLOCK_OF_CHEESE)));
        OreDictionary.registerOre("foodCheese", RatsItemRegistry.CHEESE);
        OreDictionary.registerOre("listAllmeatraw", RatsItemRegistry.RAW_RAT);
        OreDictionary.registerOre("foodRatraw", RatsItemRegistry.RAW_RAT);
        OreDictionary.registerOre("listAllmeatcooked", RatsItemRegistry.COOKED_RAT);
        OreDictionary.registerOre("foodRatcooked", RatsItemRegistry.COOKED_RAT);
        OreDictionary.registerOre("blockCheese", RatsBlockRegistry.BLOCK_OF_CHEESE);
        OreDictionary.registerOre("foodVegetable", Items.POTATO);
        OreDictionary.registerOre("foodVegetable", Items.CARROT);
        OreDictionary.registerOre("foodVegetable", Items.BEETROOT);
        OreDictionary.registerOre("foodVegetable", Blocks.PUMPKIN);
        OreDictionary.registerOre("plastic", RatsItemRegistry.RAW_PLASTIC);
        OreDictionary.registerOre("ingotPlastic", RatsItemRegistry.RAW_PLASTIC);
        OreDictionary.registerOre("listAllwater", Items.WATER_BUCKET);
        OreDictionary.registerOre("listAllseed", Items.WHEAT_SEEDS);
        OreDictionary.registerOre("listAllseed", Items.PUMPKIN_SEEDS);
        OreDictionary.registerOre("listAllseed", Items.BEETROOT_SEEDS);
        OreDictionary.registerOre("listAllseed", Items.MELON_SEEDS);
        for(Block block : RatsBlockRegistry.RAT_TUBE_COLOR){
            OreDictionary.registerOre("ratTube", block);
        }
        for(Item item : RatsItemRegistry.RAT_IGLOOS){
            OreDictionary.registerOre("ratIgloo", item);
        }
        for(Item item : RatsItemRegistry.RAT_HAMMOCKS){
            OreDictionary.registerOre("ratHammock", item);
        }
        for(EnumDyeColor color : EnumDyeColor.values()){
            String woolColor =  color.getTranslationKey();
            woolColor = woolColor.substring(0,1).toUpperCase() + woolColor.substring(1).toLowerCase();
            OreDictionary.registerOre("wool" + woolColor, new ItemStack(Blocks.WOOL, 1, color.getMetadata()));
        }
        OreDictionary.registerOre("woolLightBlue", new ItemStack(Blocks.WOOL, 1, 3));

        GameRegistry.addSmelting(RatsItemRegistry.RAW_RAT, new ItemStack(RatsItemRegistry.COOKED_RAT), 0.4F);
        GameRegistry.addSmelting(RatsBlockRegistry.MARBLED_CHEESE_RAW, new ItemStack(RatsBlockRegistry.MARBLED_CHEESE), 0.1F);
        GameRegistry.addSmelting(RatsBlockRegistry.MARBLED_CHEESE_BRICK, new ItemStack(RatsBlockRegistry.MARBLED_CHEESE_BRICK_CRACKED), 0.1F);
        GameRegistry.addSmelting(RatsItemRegistry.PLASTIC_WASTE, new ItemStack(RatsItemRegistry.RAW_PLASTIC), 0.5F);
        addBanner("rat", new ItemStack(RatsItemRegistry.RAT_PELT));
        addBanner("cheese", new ItemStack(RatsItemRegistry.CHEESE));
        addBanner("rat_and_crossbones", new ItemStack(RatsItemRegistry.PIRAT_HAT));
    }


    public static BannerPattern addBanner(String name, ItemStack craftingStack) {
        Class<?>[] classes = {String.class, String.class, ItemStack.class};
        Object[] names = {name, "rats." + name, craftingStack};
        return EnumHelper.addEnum(BannerPattern.class, name.toUpperCase(), classes, names);
    }

    public static SharedRecipe getRatChefRecipe(ItemStack stack) {
        for (SharedRecipe recipe : RAT_CHEF_RECIPES) {
            if (OreDictionary.itemMatches(recipe.getInput(), stack, false)) {
                return recipe;
            }
        }
        return null;
    }
}
