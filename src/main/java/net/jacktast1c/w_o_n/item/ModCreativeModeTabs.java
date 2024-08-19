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
                        output.accept(ModBlocks.REDWOOD_PLANKS.get());
                        output.accept(ModBlocks.REDWOOD_LEAVES.get());
                        //output.accept(ModBlocks.REDWOOD_SAPLING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
