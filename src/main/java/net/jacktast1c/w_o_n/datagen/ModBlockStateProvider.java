package net.jacktast1c.w_o_n.datagen;

import net.jacktast1c.w_o_n.W_O_N;
import net.jacktast1c.w_o_n.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, W_O_N.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(ModBlocks.blablabla);

        //Redwood Blockset
        logBlock(((RotatedPillarBlock) ModBlocks.REDWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.REDWOOD_WOOD.get()), blockTexture(ModBlocks.REDWOOD_LOG.get()), blockTexture(ModBlocks.REDWOOD_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_REDWOOD_LOG.get()), blockTexture(ModBlocks.STRIPPED_REDWOOD_LOG.get()),
                new ResourceLocation(W_O_N.MOD_ID, "block/stripped_redwood_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_REDWOOD_WOOD.get()), blockTexture(ModBlocks.STRIPPED_REDWOOD_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_REDWOOD_LOG.get()));

        stairsBlock(((StairBlock) ModBlocks.REDWOOD_STAIRS.get()), blockTexture(ModBlocks.REDWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.REDWOOD_SLAB.get()), blockTexture(ModBlocks.REDWOOD_PLANKS.get()), blockTexture(ModBlocks.REDWOOD_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.REDWOOD_BUTTON.get()), blockTexture(ModBlocks.REDWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.REDWOOD_PRESSURE_PLATE.get()), blockTexture(ModBlocks.REDWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.REDWOOD_FENCE.get()), blockTexture(ModBlocks.REDWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.REDWOOD_FENCE_GATE.get()), blockTexture(ModBlocks.REDWOOD_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.REDWOOD_DOOR.get()), modLoc("block/redwood_door_bottom"), modLoc("block/redwood_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.REDWOOD_TRAPDOOR.get()), modLoc("block/redwood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.REDWOOD_LOG);
        blockItem(ModBlocks.REDWOOD_WOOD);
        blockItem(ModBlocks.STRIPPED_REDWOOD_LOG);
        blockItem(ModBlocks.STRIPPED_REDWOOD_WOOD);
        blockWithItem(ModBlocks.REDWOOD_PLANKS);
        leavesBlock(ModBlocks.REDWOOD_LEAVES);


        //Willow Blockset
        logBlock(((RotatedPillarBlock) ModBlocks.WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WILLOW_WOOD.get()), blockTexture(ModBlocks.WILLOW_LOG.get()), blockTexture(ModBlocks.WILLOW_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_LOG.get()), blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()),
                new ResourceLocation(W_O_N.MOD_ID, "block/stripped_willow_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WILLOW_WOOD.get()), blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_WILLOW_LOG.get()));

        stairsBlock(((StairBlock) ModBlocks.WILLOW_STAIRS.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WILLOW_SLAB.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.WILLOW_BUTTON.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.WILLOW_PRESSURE_PLATE.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.WILLOW_FENCE.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.WILLOW_FENCE_GATE.get()), blockTexture(ModBlocks.WILLOW_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.WILLOW_DOOR.get()), modLoc("block/willow_door_bottom"), modLoc("block/willow_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WILLOW_TRAPDOOR.get()), modLoc("block/willow_trapdoor"), true, "cutout");

        blockItem(ModBlocks.WILLOW_LOG);
        blockItem(ModBlocks.WILLOW_WOOD);
        blockItem(ModBlocks.STRIPPED_WILLOW_LOG);
        blockItem(ModBlocks.STRIPPED_WILLOW_WOOD);
        blockWithItem(ModBlocks.WILLOW_PLANKS);
        leavesBlock(ModBlocks.WILLOW_LEAVES);
        saplingBlock(ModBlocks.WILLOW_SAPLING);

    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(W_O_N.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
