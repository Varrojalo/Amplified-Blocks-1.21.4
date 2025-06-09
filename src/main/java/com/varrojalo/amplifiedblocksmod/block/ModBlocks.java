package com.varrojalo.amplifiedblocksmod.block;

import com.varrojalo.amplifiedblocksmod.AmplifiedBlocksMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    // Create a Deferred Register to hold Blocks which will all be registered under the "amplifiedblocksmod" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AmplifiedBlocksMod.MOD_ID);

    // Creates a new Block with the id "amplifiedblocksmod:example_block", combining the namespace and path
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    //public static final DeferredBlock<Block> PULVERIZER_BLOCK = registerBlock("pulverizer_block",
    //        () -> new PulverizerBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON).noOcclusion()));

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
