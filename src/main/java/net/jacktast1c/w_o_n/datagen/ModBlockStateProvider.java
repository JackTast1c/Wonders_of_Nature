package net.jacktast1c.w_o_n.datagen;

import net.jacktast1c.w_o_n.W_O_N;
import net.jacktast1c.w_o_n.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
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

        logBlock(((RotatedPillarBlock) ModBlocks.REDWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.REDWOOD_WOOD.get()), blockTexture(ModBlocks.REDWOOD_LOG.get()), blockTexture(ModBlocks.REDWOOD_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_REDWOOD_LOG.get()), blockTexture(ModBlocks.STRIPPED_REDWOOD_LOG.get()),
                new ResourceLocation(W_O_N.MOD_ID, "block/stripped_pine_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_REDWOOD_WOOD.get()), blockTexture(ModBlocks.STRIPPED_REDWOOD_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_REDWOOD_LOG.get()));


        //Redwood Blockset
        blockItem(ModBlocks.REDWOOD_LOG);
        blockItem(ModBlocks.REDWOOD_WOOD);
        blockItem(ModBlocks.STRIPPED_REDWOOD_LOG);
        blockItem(ModBlocks.STRIPPED_REDWOOD_WOOD);
        blockWithItem(ModBlocks.REDWOOD_PLANKS);
        leavesBlock(ModBlocks.REDWOOD_LEAVES);

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
