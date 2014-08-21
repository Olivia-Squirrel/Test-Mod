package com.Bobbybim.LetsModReboot.creativeTab;


import com.Bobbybim.LetsModReboot.init.ModItems;
import com.Bobbybim.LetsModReboot.item.itemLMRB;
import com.Bobbybim.LetsModReboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.Fabric;
        }
    };
}

