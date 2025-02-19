package net.jacktast1c.w_o_n.datagen;

import net.jacktast1c.w_o_n.W_O_N;
import net.jacktast1c.w_o_n.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, W_O_N.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.REDWOOD_LOG.get().asItem())
                .add(ModBlocks.REDWOOD_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_REDWOOD_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_REDWOOD_WOOD.get().asItem())
                .add(ModBlocks.WILLOW_LOG.get().asItem())
                .add(ModBlocks.WILLOW_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.REDWOOD_PLANKS.get().asItem())
                .add(ModBlocks.WILLOW_PLANKS.get().asItem());
    }
}
