package tweaks.wurm.crafting.shaped;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import tweaks.wurm.utils.ItemNBT;
import tweaks.wurm.utils.RecipeHelper;
import tweaks.wurm.utils.tfc.TFCFood;

import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class VinillaRecipes {
	
	
	public static void addRecipes() {
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.dispenser), true, new Object[]{"CCC","CBC","CRC", Character.valueOf('C'), "wurmcobble", Character.valueOf('B'), "wurmbow", Character.valueOf('R'), "wurmredstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.piston), true, new Object[]{"CCC","PIP","PRP", Character.valueOf('C'), "wurmcobble", Character.valueOf('P'), "wurmplanks", Character.valueOf('R'), "wurmredstone", Character.valueOf('I'), "wurmiron"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.wool,4,0), true, new Object[]{"WW","WW", Character.valueOf('W'), new ItemStack(TFCItems.WoolCloth)}));
		RecipeHelper.addSlabRecipe(new ItemStack(Blocks.stone_slab,12,0), new ItemStack(Blocks.stone));
		RecipeHelper.addSlabRecipe(new ItemStack(Blocks.stone_slab,12,1), new ItemStack(Blocks.sandstone));
		RecipeHelper.addSlabRecipe(new ItemStack(Blocks.stone_slab,12,3), new ItemStack(Blocks.cobblestone));
		RecipeHelper.addSlabRecipe(new ItemStack(Blocks.stone_slab,12,4), new ItemStack(Blocks.brick_block));
		RecipeHelper.addSlabRecipe(new ItemStack(Blocks.stone_slab,12,5), new ItemStack(Blocks.stonebrick));
		RecipeHelper.addSlabRecipe(new ItemStack(Blocks.stone_slab,12,6), new ItemStack(Blocks.nether_brick));
		RecipeHelper.addSlabRecipe(new ItemStack(Blocks.stone_slab,12,7), new ItemStack(Blocks.quartz_block));
		RecipeHelper.addCrossRecipe(new ItemStack(Blocks.tnt), new ItemStack(Blocks.sand), new ItemStack(Items.gunpowder));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.bookshelf,1,0), true, new Object[]{"WWW","BBB","WWW", Character.valueOf('W'), "wurmplanks", Character.valueOf('B'), new ItemStack(Items.book)}));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.oak_stairs), new ItemStack(Blocks.planks,1,0));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.chest,1,0), true, new Object[]{"WWW","WCW","WWW", Character.valueOf('W'), "wurmplanks", Character.valueOf('C'), TFCItems.BismuthBronzeSheet}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.ladder,8,0), true, new Object[]{"SSS"," S ","SSS", Character.valueOf('S'), "wurmstick"}));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.stone_stairs,4,0), new ItemStack(Blocks.cobblestone,1,0));
		RecipeHelper.addPresssurePlateRecipe(new ItemStack(Blocks.wooden_pressure_plate,1,0), "wurmplanks");
		RecipeHelper.addPresssurePlateRecipe(new ItemStack(Blocks.stone_pressure_plate,1,0), "wurmsstone");
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.stone_button,1,0), true, new Object[]{"W", Character.valueOf('W'), "wurmsstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.redstone_torch,1,0), true, new Object[]{"R","S", Character.valueOf('R'), "wurmredstone", Character.valueOf('S'), "wurmstick"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.snow,1,0), true, new Object[]{"SS","SS", Character.valueOf('S'), new ItemStack(Items.snowball)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.fence,3,0), true, new Object[]{"SSS","SSS", Character.valueOf('S'), "wurmstick"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.trapdoor,2,0), true, new Object[]{"SSS","SSS", Character.valueOf('S'), "wurmplanks"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.iron_bars,24,0), true, new Object[]{"III","III", Character.valueOf('I'), "wurmiron"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.fence_gate,1,0), true, new Object[]{"SPS","SPS", Character.valueOf('S'), "wurmstick", Character.valueOf('P'), "wurmplanks"}));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.brick_stairs,4,0), new ItemStack(Blocks.brick_block));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.stone_brick_stairs,4,0), new ItemStack(Blocks.stonebrick));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.spruce_stairs,4,0), new ItemStack(Blocks.planks,1,1));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.spruce_stairs,4,0), new ItemStack(Blocks.planks,1,2));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.jungle_stairs,4,0), new ItemStack(Blocks.planks,1,3));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.sandstone_stairs,4,0), new ItemStack(Blocks.sandstone,1,0));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.acacia_stairs,4,0), new ItemStack(Blocks.planks,1,4));
		RecipeHelper.addStairsRecipe(new ItemStack(Blocks.dark_oak_stairs,4,0), new ItemStack(Blocks.planks,1,5));
		for(int b = 1; b < 5; b++) {
			RecipeHelper.addSlabRecipe(new ItemStack(Blocks.wooden_slab,6,b), new ItemStack(Blocks.planks,1,b));
		}
		RecipeHelper.addPresssurePlateRecipe(new ItemStack(Blocks.heavy_weighted_pressure_plate,1,0), "wurmiron");
		RecipeHelper.addPresssurePlateRecipe(new ItemStack(Blocks.light_weighted_pressure_plate,1,0), "wurmgold");
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.daylight_detector,1,0), true , new Object[]{"GGG","IGI","BBB", Character.valueOf('G'), new ItemStack(Blocks.glass), Character.valueOf('I'), "wurmiron", Character.valueOf('B'), new ItemStack(TFCItems.BismuthIngot)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.cobblestone_wall,3,0),true, new Object[]{"CCC","CCC",Character.valueOf('C'), "wurmcobble"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.cobblestone_wall,3,1),true, new Object[]{"CCC","CCC",Character.valueOf('C'), new ItemStack(Blocks.mossy_cobblestone)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.wooden_button,2,0), true, new Object[]{"W","W", Character.valueOf('W'), "wurmplanks"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.dropper,1,0), true, new Object[]{"CCC","C C","CRC", Character.valueOf('C'), "wurmcobble",Character.valueOf('R'), "wurmredstone"}));
		for (int b = 0; b < 15; b++) {
			System.out.println("Carpet: " + b);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.carpet,12,b), true, new Object[]{"WWW", Character.valueOf('W'), new ItemStack(Blocks.wool,1,b)}));
		}
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.painting,4,0), true, new Object[]{"WWW","WPW","WWW", Character.valueOf('W'), new ItemStack(TFCItems.WoolCloth,1,0),Character.valueOf('P'), new ItemStack(Items.paper,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.sign,3,0), true, new Object[]{"WWW","WWW"," S ", Character.valueOf('W'), "wurmlumber", Character.valueOf('S'), "wurmstick"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_door,1,0), true, new Object[]{"II","II","II", Character.valueOf('I'), new ItemStack(TFCItems.WroughtIronSheet,1,0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.boat,1,0), true, new Object[]{"WKW","WWW", Character.valueOf('W'), "wurmlumber",Character.valueOf('K'), "wurmknife"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bowl,3,0), true, new Object[]{"WKW"," W ", Character.valueOf('W'), "wurmlumber",Character.valueOf('K'), "wurmknife"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.paper,6,0), true, new Object[]{"JJJ", Character.valueOf('J'), new ItemStack(TFCItems.Jute)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.repeater), true, new Object[]{"TRT","SSS", Character.valueOf('T'), new ItemStack(Blocks.redstone_torch),Character.valueOf('R'), new ItemStack(Items.redstone),Character.valueOf('S'), new ItemStack(Blocks.stone)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.comparator), true, new Object[]{" T ","TRT","SSS", Character.valueOf('T'), new ItemStack(Blocks.redstone_torch),Character.valueOf('R'), new ItemStack(Items.redstone),Character.valueOf('S'), new ItemStack(Blocks.stone)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.flower_pot,12,0), true, new Object[]{"WWW", Character.valueOf('W'), "wurmbrick"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.cauldron), true, new Object[]{"I I","I I", "III", Character.valueOf('I'), new ItemStack(TFCItems.WroughtIronSheet)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.minecart,1,0), true, new Object[]{"I I","III", Character.valueOf('I'), new ItemStack(TFCItems.WroughtIronSheet)}));
		RecipeHelper.addCircwithCenterRecipe(new ItemStack(Items.golden_apple,1,0), new ItemStack(TFCItems.GoldIngot), TFCFood.getFood(TFCItems.RedApple, 160f));
		RecipeHelper.addCircwithCenterRecipe(new ItemStack(Items.golden_apple,1,1), new ItemStack(tweaks.wurm.items.ModBlocks.GoldBlock), TFCFood.getFood(TFCItems.RedApple, 160f));
		RecipeHelper.addCircwithCenterRecipe(new ItemStack(Items.speckled_melon,1,0), new ItemStack(TFCItems.GoldIngot), TFCFood.getFood(TFCItems.Cranberry, 160f));
		RecipeHelper.add2xRecipe(new ItemStack(Blocks.brick_block), new ItemStack(Items.brick));
		RecipeHelper.addCircwithCenterRecipe(new ItemStack(Blocks.furnace), "wurmcobble", "wurmiron");
		RecipeHelper.add3xRecipe(new ItemStack(Blocks.glowstone), new ItemStack(Items.glowstone_dust));
		RecipeHelper.addSlabRecipe(new ItemStack(Blocks.glass_pane,6), new ItemStack(Blocks.glass));
	    for(int b = 0; b < 15; b++) {
	    	RecipeHelper.addCircwithCenterRecipe(new ItemStack(Blocks.stained_glass,8,b), "wurmglass", RecipeHelper.Dye[b]);
	    }
	    RecipeHelper.add3xRecipe(new ItemStack(Blocks.hay_block), new ItemStack(TFCBlocks.Thatch));
	    RecipeHelper.addSlabRecipe(new ItemStack(Blocks.iron_bars,32), new ItemStack(TFCItems.WroughtIronSheet));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.tripwire_hook,1), new Object[] {"IB", Character.valueOf('I'), TFCItems.WroughtIronSheet,Character.valueOf('B'), "wurmsstone" }));
	    for(int b = 0; b < 15; b++) {
	    	RecipeHelper.addCircwithCenterRecipe(new ItemStack(Blocks.stained_hardened_clay,8,b), new ItemStack(Blocks.hardened_clay), RecipeHelper.Dye[b]);
	    }
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.hardened_clay,8,15),new Object[] {"GGG", "GDG", "GGG", Character.valueOf('G'), TFCItems.ClayBall, Character.valueOf('D'), TFCItems.BrassSheet}));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.clock), new Object[] {" G ", "GRG", " G ", Character.valueOf('G'), "wurmgold", Character.valueOf('R'), Items.redstone}));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.compass), new Object[] {" G ", "GRG", " G ", Character.valueOf('G'), TFCItems.WroughtIronSheet, Character.valueOf('R'), Items.redstone}));
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jukebox), true, new Object[]{"PPP","PGP","PPP", Character.valueOf('P'), "wurmplanks", Character.valueOf('G'), "wurmchipgem"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.noteblock), true, new Object[]{"PPP","PGP","PPP", Character.valueOf('P'), "wurmplanks", Character.valueOf('G'), "wurmredstone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.ender_chest,1,0), true, new Object[]{"OOO","OEO","OOO", Character.valueOf('O'), new ItemStack(Blocks.obsidian), Character.valueOf('E'), new ItemStack(Items.ender_eye)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.hopper,1,0), true, new Object[]{"I I","ICI"," I ", Character.valueOf('I'), "wurmiron", Character.valueOf('C'), "wurmchest"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.enchanting_table,1,0), new Object[]{"BGB","OSO","OOO", Character.valueOf('B'), new ItemStack(Items.book), Character.valueOf('G'), "wurmegem", Character.valueOf('S'), new ItemStack(TFCItems.BlueSteelIngot2x), Character.valueOf('O'), new ItemStack(Blocks.obsidian)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.beacon,1,0), new Object[]{"GGG","GNG","OOO", Character.valueOf('G'), new ItemStack(Blocks.glass), Character.valueOf('N'), new ItemStack(Items.nether_star), Character.valueOf('O'), new ItemStack(Blocks.obsidian)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.brewing_stand,1,0), new Object[]{" B ","CCC", Character.valueOf('B'), new ItemStack(Items.blaze_rod),Character.valueOf('C'), "wurmcobble"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.item_frame),true, new Object[]{"SSS","SLS","SSS", Character.valueOf('S'), "wurmstick",Character.valueOf('L'), new ItemStack(TFCItems.Leather)}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.writable_book), new Object[]{"dyeBlack", Items.book, Items.feather}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.iron_axe), 185), new Object[] {"II ", "IS ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.WroughtIronIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.iron_axe), 185), new Object[] {" II", " SI", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.WroughtIronIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.iron_pickaxe), 185), new Object[] {"III", " S ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.WroughtIronIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.iron_shovel), 185), new Object[] {" I ", " S ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.WroughtIronIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.iron_sword), 185), new Object[] {" I ", " I ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.WroughtIronIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.golden_axe), 150), new Object[] {"II ", "IS ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.GoldIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.golden_axe), 150), new Object[] {" II", " SI", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.GoldIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.golden_pickaxe), 150), new Object[] {"II ", "IS ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.GoldIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.golden_shovel), 185), new Object[] {" I ", " S ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.GoldIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.golden_sword), 185), new Object[] {" I ", " S ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), TFCItems.GoldIngot}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.diamond_axe), 320), new Object[] {"II ", "IS ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), new ItemStack(TFCItems.GemDiamond,1,2)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.diamond_axe), 320), new Object[] {" II", " SI", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), new ItemStack(TFCItems.GemDiamond,1,2)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.diamond_pickaxe), 300), new Object[] {"III", " S ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), new ItemStack(TFCItems.GemDiamond,1,2)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.diamond_shovel), 300), new Object[] {" I ", " S ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), new ItemStack(TFCItems.GemDiamond,1,2)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(ItemNBT.addDamage(new ItemStack(Items.diamond_sword), 300), new Object[] {" I ", " I ", " S ", Character.valueOf('S'), "wurmstick", Character.valueOf('I'), new ItemStack(TFCItems.GemDiamond,1,2)}));
		RecipeHelper.add2xRecipe(new ItemStack(Blocks.stonebrick,4), new ItemStack(Blocks.stone));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.double_stone_slab,1,8), new Object[] {new ItemStack(Blocks.stone_slab),new ItemStack(Blocks.stone_slab)}));
	
	}
}
