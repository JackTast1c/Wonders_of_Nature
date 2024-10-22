package net.jacktast1c.w_o_n.worldgen.tree;

import net.jacktast1c.w_o_n.W_O_N;
import net.jacktast1c.w_o_n.worldgen.tree.custom.WillowTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, W_O_N.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<WillowTrunkPlacer>> WILLOW_TRUNK_PLACER =
            TRUNK_PLACER.register("willow_trunk_placer", () -> new TrunkPlacerType<>(WillowTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}
