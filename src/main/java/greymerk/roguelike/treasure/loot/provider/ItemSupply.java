package greymerk.roguelike.treasure.loot.provider;

/*
 * Roguelike Dungeons Reborn
 * Modified Source
 */

import java.util.Random;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ItemSupply extends ItemBase {

	public ItemSupply(int weight, int level) {
		super(weight, level);
	}

	@Override
	public ItemStack getLootItem(Random rand, int level) {

		if (rand.nextInt(20) == 0)
			return new ItemStack(Items.CARROT, 1);
		if (rand.nextInt(20) == 0)
			return new ItemStack(Items.POTATO, 1);

		switch (rand.nextInt(8)) {
		case 0:
			return new ItemStack(Items.WHEAT_SEEDS, rand.nextInt(8) + 1);
		case 1:
			return new ItemStack(Items.PUMPKIN_SEEDS, rand.nextInt(8) + 1);
		case 2:
			return new ItemStack(Items.MELON_SEEDS, rand.nextInt(8) + 1);
		case 3:
			return new ItemStack(Items.WHEAT, rand.nextInt(8) + 1);
		case 4:
			return new ItemStack(Blocks.TORCH, 10 + rand.nextInt(10));
		case 5:
			return new ItemStack(Items.PAPER, rand.nextInt(8) + 1);
		case 6:
			return new ItemStack(Items.BOOK, rand.nextInt(4) + 1);
		case 7: {
			switch (rand.nextInt(7)) {
			case 0:
				return new ItemStack(Blocks.OAK_SAPLING, rand.nextInt(4));
			case 1:
				return new ItemStack(Blocks.ACACIA_SAPLING, rand.nextInt(4));
			case 2:
				return new ItemStack(Blocks.BAMBOO_SAPLING, rand.nextInt(4));
			case 3:
				return new ItemStack(Blocks.BIRCH_SAPLING, rand.nextInt(4));
			case 4:
				return new ItemStack(Blocks.DARK_OAK_SAPLING, rand.nextInt(4));
			case 5:
				return new ItemStack(Blocks.JUNGLE_SAPLING, rand.nextInt(4));
			case 6:
				return new ItemStack(Blocks.SPRUCE_SAPLING, rand.nextInt(4));
			}
		}
		default:
			return new ItemStack(Items.STICK, 1);
		}
	}
}
