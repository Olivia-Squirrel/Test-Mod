package com.Bobbybim.LetsModReboot.init;
import com.Bobbybim.LetsModReboot.block.BlockLMRB;
import com.Bobbybim.LetsModReboot.block.BlockLOOM;
import com.Bobbybim.LetsModReboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB loom = new BlockLOOM();

    public static void init()
    {
        GameRegistry.registerBlock(loom, "loom");
    }
}
