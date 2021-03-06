/**
 * This Code is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 */
// Created @ 25 Dec 2012
package vazkii.tinkerer.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import vazkii.tinkerer.reference.MiscReference;

/**
 * ItemMetadataCompatBlock
 *
 * Metadata Compatible ItemBlock. The ItemBlock type always
 * places down metadata 1. This one places a block with the
 * metadata present in the ItemStack.
 *
 * @author Vazkii
 */
public class ItemMetadataCompatBlock extends ItemBlock {

	/** ItemBlock.blockID isn't visible **/
	int blockID2;

	public ItemMetadataCompatBlock(int par1) {
		super(par1);
		blockID2 = par1 + MiscReference.ITEM_INDEX_SHIFT;
	}

	/** Same method as the overrided one, except this one takes in consideration
	 * the metadata of the ItemStack **/
	@Override
    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata) {
       if (!world.setBlockAndMetadataWithNotify(x, y, z, blockID2, stack.getItemDamage()))
               return false;

       if (world.getBlockId(x, y, z) == blockID2){
           Block.blocksList[blockID2].onBlockPlacedBy(world, x, y, z, player);
           Block.blocksList[blockID2].func_85105_g(world, x, y, z, metadata);
       }

       return true;
    }

}
