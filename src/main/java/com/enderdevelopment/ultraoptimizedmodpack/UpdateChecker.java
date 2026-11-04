package com.enderdevelopment.ultraoptimizedmodpack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("ultra_optimized_modpack")
public class UpdateChecker {
    public UpdateChecker() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::checkForUpdates);
    }

    private void checkForUpdates(final FMLClientSetupEvent event) {
        // Logic to check for updates
    }
}
