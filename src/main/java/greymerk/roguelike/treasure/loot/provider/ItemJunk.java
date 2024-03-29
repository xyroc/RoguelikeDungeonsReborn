package greymerk.roguelike.treasure.loot.provider;

/*
 * Roguelike Dungeons Reborn
 * Modified Source
 */

import java.util.Random;

import greymerk.roguelike.treasure.loot.PotionMixture;
import greymerk.roguelike.treasure.loot.Shield;
import greymerk.roguelike.treasure.loot.TippedArrow;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ItemJunk extends ItemBase {

	public ItemJunk(int weight, int level) {
		super(weight, level);
	}

	@Override
	public ItemStack getLootItem(Random rand, int level) {

		if (level > 0 && rand.nextInt(200) == 0) {
			if (level > 2 && rand.nextInt(10) == 0)
				return new ItemStack(Items.DIAMOND_HORSE_ARMOR, 1);
			if (level > 1 && rand.nextInt(5) == 0)
				return new ItemStack(Items.GOLDEN_HORSE_ARMOR, 1);
			if (rand.nextInt(3) == 0)
				return new ItemStack(Items.IRON_HORSE_ARMOR, 1);
			return new ItemStack(Items.SADDLE);
		}

		if (rand.nextInt(100) == 0)
			return PotionMixture.getRandom(rand);

		if (level > 1 && rand.nextInt(100) == 0)
			return new ItemStack(Items.GHAST_TEAR);

		if (level < 3 && rand.nextInt(80) == 0)
			return new ItemStack(Items.BOOK);

		if (rand.nextInt(80) == 0)
			return Shield.get(rand);

		if (level > 1 && rand.nextInt(60) == 0)
			return TippedArrow.get(rand, 4 + rand.nextInt(level) * 2);

		if (level > 1 && rand.nextInt(50) == 0) {
			switch (rand.nextInt(6)) {
			case 0:
				return new ItemStack(Items.GUNPOWDER, 1 + rand.nextInt(3));
			case 1:
				return new ItemStack(Items.BLAZE_POWDER, 1 + rand.nextInt(3));
			case 2:
				return new ItemStack(Items.GOLD_NUGGET, 1 + rand.nextInt(3));
			case 3:
				return new ItemStack(Items.REDSTONE, 1 + rand.nextInt(3));
			case 4:
				return new ItemStack(Items.GLOWSTONE_DUST, 1 + rand.nextInt(8));
			case 5: {
				switch (rand.nextInt(16)) {
				case 0:
					return new ItemStack(Items.WHITE_DYE, 1 + rand.nextInt(3));
				case 1:
					return new ItemStack(Items.BLUE_DYE, 1 + rand.nextInt(3));
				case 2:
					return new ItemStack(Items.BLACK_DYE, 1 + rand.nextInt(3));
				case 3:
					return new ItemStack(Items.BROWN_DYE, 1 + rand.nextInt(3));
				case 4:
					return new ItemStack(Items.CYAN_DYE, 1 + rand.nextInt(3));
				case 5:
					return new ItemStack(Items.GRAY_DYE, 1 + rand.nextInt(3));
				case 6:
					return new ItemStack(Items.GREEN_DYE, 1 + rand.nextInt(3));
				case 7:
					return new ItemStack(Items.LIGHT_BLUE_DYE, 1 + rand.nextInt(3));
				case 8:
					return new ItemStack(Items.LIGHT_GRAY_DYE, 1 + rand.nextInt(3));
				case 9:
					return new ItemStack(Items.LIME_DYE, 1 + rand.nextInt(3));
				case 10:
					return new ItemStack(Items.MAGENTA_DYE, 1 + rand.nextInt(3));
				case 11:
					return new ItemStack(Items.ORANGE_DYE, 1 + rand.nextInt(3));
				case 12:
					return new ItemStack(Items.PINK_DYE, 1 + rand.nextInt(3));
				case 13:
					return new ItemStack(Items.PURPLE_DYE, 1 + rand.nextInt(3));
				case 14:
					return new ItemStack(Items.RED_DYE, 1 + rand.nextInt(3));
				case 15:
					return new ItemStack(Items.YELLOW_DYE, 1 + rand.nextInt(3));
				}
			}
			}
		}

		if (rand.nextInt(60) == 0)
			return PotionMixture.getPotion(rand, PotionMixture.LAUDANUM);

		if (rand.nextInt(30) == 0)
			return new ItemStack(Blocks.TORCH, 6 + rand.nextInt(20));

		if (level > 0 && rand.nextInt(8) == 0) {
			switch (rand.nextInt(8)) {
			case 0:
				return new ItemStack(Items.SLIME_BALL);
			case 1:
				return new ItemStack(Items.SNOWBALL);
			case 2:
				return new ItemStack(Items.MUSHROOM_STEW);
			case 3:
				return new ItemStack(Items.CLAY_BALL);
			case 4:
				return new ItemStack(Items.FLINT);
			case 5:
				return new ItemStack(Items.FEATHER);
			case 6:
				return new ItemStack(Items.GLASS_BOTTLE);
			case 7:
				return new ItemStack(Items.LEATHER);
			}
		}

		switch (rand.nextInt(7)) {
		case 0:
			return new ItemStack(Items.BONE);
		case 1:
			return new ItemStack(Items.ROTTEN_FLESH);
		case 2:
			return new ItemStack(Items.SPIDER_EYE);
		case 3:
			return new ItemStack(Items.PAPER);
		case 4:
			return new ItemStack(Items.STRING);
		case 5:
			return new ItemStack(Items.STICK);
		default:
			return new ItemStack(Items.STICK);
		}
	}
}
