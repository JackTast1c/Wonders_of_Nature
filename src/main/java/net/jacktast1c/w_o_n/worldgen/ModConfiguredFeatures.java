package net.jacktast1c.w_o_n.worldgen;

import net.jacktast1c.w_o_n.W_O_N;
import net.jacktast1c.w_o_n.block.ModBlocks;
import net.jacktast1c.w_o_n.worldgen.tree.custom.WillowFoliagePlacer;
import net.jacktast1c.w_o_n.worldgen.tree.custom.WillowTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WILLOW_LOG.get()),
                new WillowTrunkPlacer(3, 1, 2),
                BlockStateProvider.simple(ModBlocks.WILLOW_LEAVES.get()),
                new WillowFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(W_O_N.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
