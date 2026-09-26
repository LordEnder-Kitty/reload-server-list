package net.enderkitty.fabric;

import net.enderkitty.ReloadServerList;
import net.fabricmc.api.ClientModInitializer;

public class ReloadServerListFabric implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        ReloadServerList.init();
    }
}
