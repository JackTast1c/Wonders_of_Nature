package net.jacktast1c.w_o_n.datagen.loot;

import net.jacktast1c.w_o_n.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.REDWOOD_LOG.get());
        this.dropSelf(ModBlocks.REDWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_REDWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_REDWOOD_WOOD.get());
        this.dropSelf(ModBlocks.REDWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.REDWOOD_STAIRS.get());
        this.dropSelf(ModBlocks.REDWOOD_FENCE.get());
        this.dropSelf(ModBlocks.REDWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.REDWOOD_TRAPDOOR.get());
        this.dropSelf(ModBlocks.REDWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.REDWOOD_BUTTON.get());

        this.add(ModBlocks.REDWOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.REDWOOD_SLAB.get()));
        this.add(ModBlocks.REDWOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.REDWOOD_DOOR.get()));

        this.add(ModBlocks.REDWOOD_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.REDWOOD_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES)); //TODO: Change this shi' to the sapling

        this.dropSelf(ModBlocks.WILLOW_LOG.get());
        this.dropSelf(ModBlocks.WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.WILLOW_PLANKS.get());
        this.dropSelf(ModBlocks.WILLOW_STAIRS.get());
        this.dropSelf(ModBlocks.WILLOW_FENCE.get());
        this.dropSelf(ModBlocks.WILLOW_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WILLOW_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WILLOW_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WILLOW_BUTTON.get());
        this.dropSelf(ModBlocks.WILLOW_SAPLING.get());

        this.add(ModBlocks.WILLOW_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WILLOW_SLAB.get()));
        this.add(ModBlocks.WILLOW_DOOR.get(),
                block -> createDoorTable(ModBlocks.WILLOW_DOOR.get()));

        this.add(ModBlocks.WILLOW_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WILLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
