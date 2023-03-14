package net.runelite.client.plugins.raidhelper;

import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.raidhelper.RaidHelperOverlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.api.Client;
import javax.inject.Inject;



@PluginDescriptor(
        name = "Raid Helper",
        description = "Displays helpful information during raids",
        tags = {"overlay", "raid", "prayer", "helper"}
)
public class RaidHelperPlugin extends Plugin
{
    @Inject
    private Client client;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private RaidHelperOverlay raidHelperOverlay;

    @Subscribe
    public void onGameTick(GameTick event)
    {
        // Check for raid encounters and update the overlay information
    }

    @Override
    protected void startUp() throws Exception
    {
        overlayManager.add(raidHelperOverlay);
    }

    @Override
    protected void shutDown() throws Exception
    {
        overlayManager.remove(raidHelperOverlay);
    }
}
