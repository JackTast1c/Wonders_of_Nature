package net.jacktast1c.w_o_n.item;

import net.jacktast1c.w_o_n.W_O_N;
import net.jacktast1c.w_o_n.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, W_O_N.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WON_TAB = CREATIVE_MODE_TABS.register("won_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.won_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Redwood Blockset
                        output.accept(ModBlocks.REDWOOD_LOG.get());
                        output.accept(ModBlocks.REDWOOD_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_REDWOOD_LOG.get());
                        output.accept(ModBlocks.STRIPPED_REDWOOD_WOOD.get());
                        output.accept(ModBlocks.REDWOOD_LEAVES.get());
                        output.accept(ModBlocks.REDWOOD_PLANKS.get());
                        output.accept(ModBlocks.REDWOOD_STAIRS.get());
                        output.accept(ModBlocks.REDWOOD_SLAB.get());
                        output.accept(ModBlocks.REDWOOD_DOOR.get());
                        output.accept(ModBlocks.REDWOOD_TRAPDOOR.get());
                        output.accept(ModBlocks.REDWOOD_FENCE.get());
                        output.accept(ModBlocks.REDWOOD_FENCE_GATE.get());
                        output.accept(ModBlocks.REDWOOD_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.REDWOOD_BUTTON.get());
                        //output.accept(ModBlocks.REDWOOD_SAPLING.get());

                        //Willow Blockset
                        output.accept(ModBlocks.WILLOW_LOG.get());
                        output.accept(ModBlocks.WILLOW_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_WILLOW_LOG.get());
                        output.accept(ModBlocks.STRIPPED_WILLOW_WOOD.get());
                        output.accept(ModBlocks.WILLOW_LEAVES.get());
                        output.accept(ModBlocks.WILLOW_PLANKS.get());
                        output.accept(ModBlocks.WILLOW_STAIRS.get());
                        output.accept(ModBlocks.WILLOW_SLAB.get());
                        output.accept(ModBlocks.WILLOW_DOOR.get());
                        output.accept(ModBlocks.WILLOW_TRAPDOOR.get());
                        output.accept(ModBlocks.WILLOW_FENCE.get());
                        output.accept(ModBlocks.WILLOW_FENCE_GATE.get());
                        output.accept(ModBlocks.WILLOW_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.WILLOW_BUTTON.get());
                        //output.accept(ModBlocks.WILLOW_SAPLING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
