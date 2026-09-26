package net.enderkitty.neoforge;

import net.enderkitty.ReloadServerList;
import net.neoforged.fml.common.Mod;

@Mod(ReloadServerList.MOD_ID)
public final class ReloadServerListNeoForge {
    
    public ReloadServerListNeoForge() {
        ReloadServerList.init();
    }
}
