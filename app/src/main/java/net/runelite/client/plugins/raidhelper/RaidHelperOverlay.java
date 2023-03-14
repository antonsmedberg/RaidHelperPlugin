package net.runelite.client.plugins.raidhelper;

package net.runelite.client.plugins.raidhelper;

import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.components.PanelComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;

public class RaidHelperOverlay extends Overlay
{
    private final PanelComponent panelComponent = new PanelComponent();

    RaidHelperOverlay()
    {
        setPosition(OverlayPosition.TOP_LEFT);
        setLayer(OverlayLayer.ALWAYS_ON_TOP);
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        panelComponent.getChildren().clear();

        // Example message displayed on the screen
        String message = "Hello, Raid Helper!";
        Color textColor = Color.WHITE;

        // Render the text
        OverlayUtil.renderTextLocation(graphics, new Point(10, 20), message, textColor);

        return panelComponent.render(graphics);
    }
}
