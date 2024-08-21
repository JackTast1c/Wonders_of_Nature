package net.jacktast1c.w_o_n.datagen;

import net.jacktast1c.w_o_n.W_O_N;
import net.jacktast1c.w_o_n.block.ModBlocks;
import net.jacktast1c.w_o_n.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, W_O_N.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //simpleItem(ModItems.wompwomp);

        simpleBlockItem(ModBlocks.REDWOOD_DOOR);

        fenceItem(ModBlocks.REDWOOD_FENCE, ModBlocks.REDWOOD_PLANKS);
        buttonItem(ModBlocks.REDWOOD_BUTTON, ModBlocks.REDWOOD_PLANKS);

        evenSimplerBlockItem(ModBlocks.REDWOOD_STAIRS);
        evenSimplerBlockItem(ModBlocks.REDWOOD_SLAB);
        evenSimplerBlockItem(ModBlocks.REDWOOD_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.REDWOOD_FENCE_GATE);
        trapdoorItem(ModBlocks.REDWOOD_TRAPDOOR);



        simpleBlockItem(ModBlocks.WILLOW_DOOR);

        fenceItem(ModBlocks.WILLOW_FENCE, ModBlocks.WILLOW_PLANKS);
        buttonItem(ModBlocks.WILLOW_BUTTON, ModBlocks.WILLOW_PLANKS);

        evenSimplerBlockItem(ModBlocks.WILLOW_STAIRS);
        evenSimplerBlockItem(ModBlocks.WILLOW_SLAB);
        evenSimplerBlockItem(ModBlocks.WILLOW_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.WILLOW_FENCE_GATE);
        trapdoorItem(ModBlocks.WILLOW_TRAPDOOR);
        saplingItem(ModBlocks.WILLOW_SAPLING);

    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(W_O_N.MOD_ID, "block/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(W_O_N.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(W_O_N.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(W_O_N.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(W_O_N.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(W_O_N.MOD_ID,"item/" + item.getId().getPath()));
    }
}
