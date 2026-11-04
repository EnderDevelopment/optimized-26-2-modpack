package com.enderdevelopment.ultraoptimizedmodpack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("ultra_optimized_modpack")
public class CommunitySupport {
    public CommunitySupport() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::initCommunitySupport);
    }

    private void initCommunitySupport(final FMLClientSetupEvent event) {
        // Logic to initialize community support features
    }
}
