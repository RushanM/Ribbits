package com.yungnickyoung.minecraft.ribbits.block;

import com.yungnickyoung.minecraft.ribbits.module.PlacedFeatureModule;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SwampDaisyBlock extends SwampPlantBlock {
    protected static final VoxelShape SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);

    public SwampDaisyBlock(Properties properties) {
        super(properties, PlacedFeatureModule.SWAMP_DAISY_PATCH);
    }

    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        Vec3 offset = blockState.getOffset(blockGetter, blockPos);
        return SHAPE.move(offset.x, offset.y, offset.z);
    }
}
