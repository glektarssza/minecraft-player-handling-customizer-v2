package com.glektarssza.player_handling_customizer;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

/**
 * A class which provides sided functionality common to both the server and the
 * client.
 */
public abstract class CommonProxy {
    /**
     * Create a new instance.
     */
    protected CommonProxy() {
        // -- Does nothing
    }

    /**
     * Handle the pre-initialization event from the Forge mod loader.
     *
     * @param event The event to handle.
     */
    public void OnPreInit(final FMLPreInitializationEvent event) {
        // -- IMMEDIATELY register ourselves with the main event bus!
        MinecraftForge.EVENT_BUS.register(this);
    }

    /**
     * Handle the main initialization event from the Forge mod loader.
     *
     * @param event The event to handle.
     */
    public void OnInit(final FMLInitializationEvent event) {}

    /**
     * Handle the post-initialization event from the Forge mod loader.
     *
     * @param event The event to handle.
     */
    public void OnPostInit(final FMLPostInitializationEvent event) {}

    /**
     * Handle the event indicating the server is about to start from the Forge
     * mod loader.
     *
     * @param event The event to handle.
     */
    public void OnServerAboutToStart(final FMLServerAboutToStartEvent event) {
        // -- Does nothing, here for the server proxy to implement
    }

    /**
     * Handle the event indicating the server is starting from the Forge mod
     * loader.
     *
     * @param event The event to handle.
     */
    public void OnServerStarting(final FMLServerStartingEvent event) {
        // -- Does nothing, here for the server proxy to implement
    }

    /**
     * Handle the event indicating the server has started from the Forge mod
     * loader.
     *
     * @param event The event to handle.
     */
    public void OnServerStarted(final FMLServerStartedEvent event) {
        // -- Does nothing, here for the server proxy to implement
    }

    /**
     * Handle the event indicating the server is stopping from the Forge mod
     * loader.
     *
     * @param event The event to handle.
     */
    public void OnServerStopping(final FMLServerStoppingEvent event) {
        // -- Does nothing, here for the server proxy to implement
    }

    /**
     * Handle the event indicating the server has stopped from the Forge mod
     * loader.
     *
     * @param event The event to handle.
     */
    public void OnServerStopped(final FMLServerStoppedEvent event) {
        // -- Does nothing, here for the server proxy to implement
    }
}
