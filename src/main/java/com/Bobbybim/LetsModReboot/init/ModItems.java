package com.Bobbybim.LetsModReboot.init;

import com.Bobbybim.LetsModReboot.item.itemLMRB;
import com.Bobbybim.LetsModReboot.item.itemMapleLeaf;
import com.Bobbybim.LetsModReboot.item.itemPajamaPants;
import com.Bobbybim.LetsModReboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;



@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final itemLMRB pajamaPants = new itemPajamaPants();

    public static final itemLMRB Fabric = new itemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(Fabric, "Fabric");

        GameRegistry.registerItem(pajamaPants, "pajamaPants");
    }





}



