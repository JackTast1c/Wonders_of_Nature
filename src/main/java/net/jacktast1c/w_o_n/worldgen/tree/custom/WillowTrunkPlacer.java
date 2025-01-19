package net.jacktast1c.w_o_n.worldgen.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.jacktast1c.w_o_n.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class WillowTrunkPlacer extends TrunkPlacer {
    public static final Codec<WillowTrunkPlacer> CODEC = RecordCodecBuilder.create(willowTrunkPlacerInstance -> trunkPlacerParts(willowTrunkPlacerInstance).apply(willowTrunkPlacerInstance, WillowTrunkPlacer::new));

    public WillowTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.WILLOW_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {

        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);
        int height = pFreeTreeHeight + pRandom.nextInt(heightRandA, heightRandA + 1) + pRandom.nextInt(heightRandB - 1, heightRandB + 1);
        for(int i = 0; i < height; i++) {
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i), pConfig);
            
            if(i % 3 == 0 && pRandom.nextBoolean()) {

                int h = i+3;
                boolean canItGenerate = h < height-2;

                if(canItGenerate) {

                    if (pRandom.nextFloat() > 0.5f) {
                        for (int x = 0; x < 3; x++) {
                            pBlockSetter.accept(pPos.above(h).relative(Direction.NORTH, 1), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.NORTH, 2), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.NORTH, 3), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.NORTH, 3).relative(Direction.Axis.Y, 1), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y))));
                        }
                    }
                    if (pRandom.nextFloat() > 0.5f) {
                        for (int x = 0; x < 3; x++) {
                            pBlockSetter.accept(pPos.above(h).relative(Direction.SOUTH, 1), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.SOUTH, 2), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.SOUTH, 3), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.SOUTH, 3).relative(Direction.Axis.Y, 1), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y))));
                        }
                    }
                    if (pRandom.nextFloat() > 0.5f) {
                        for (int x = 0; x < 3; x++) {
                            pBlockSetter.accept(pPos.above(h).relative(Direction.EAST, 1), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.EAST, 2), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.EAST, 3), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.EAST, 3).relative(Direction.Axis.Y, 1), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y))));
                        }
                    }
                    if (pRandom.nextFloat() > 0.5f) {
                        for (int x = 0; x < 3; x++) {
                            pBlockSetter.accept(pPos.above(h).relative(Direction.WEST, 1), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.WEST, 2), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.WEST, 3), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                            pBlockSetter.accept(pPos.above(h).relative(Direction.WEST, 3).relative(Direction.Axis.Y, 1), ((BlockState)
                                    Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y))));
                        }
                    }
                }
            }
            }
//            if(i % 2 == 0 && pRandom.nextBoolean()){
//                if(pRandom.nextFloat() > 0.25f) {
//                    for(int x = 0; x < 4; x++) {
//                        pBlockSetter.accept(pPos.above(h).relative(Direction.NORTH, x), ((BlockState)
//                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
//                        pBlockSetter.accept(pPos.above(h).relative(Direction.SOUTH, x), ((BlockState)
//                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
//                        pBlockSetter.accept(pPos.above(h).relative(Direction.EAST, x), ((BlockState)
//                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
//                        pBlockSetter.accept(pPos.above(h).relative(Direction.WEST, x), ((BlockState)
//                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
//                    }
//                }
//            }
        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(pPos.above(height), 0, false));
    }


}
