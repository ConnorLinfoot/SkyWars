package com.connorlinfoot.skywars;

import com.connorlinfoot.networklib.Modules.Game.GameSettings;
import com.connorlinfoot.networklib.Modules.Game.Templates.LastManStanding;

public class SkyWarsGame extends LastManStanding {

    public SkyWarsGame() {
        super("SkyWars", "skywars");
        GameSettings.HUNGER.set(true);
        GameSettings.BUILD.set(true);
        GameSettings.DESTROY.set(true);
        GameSettings.DROP_ITEMS.set(true);
        GameSettings.PICKUP_ITEMS.set(true);
        GameSettings.BUCKETS.set(true);
        GameSettings.DROP_ITEMS_ON_DEATH.set(true);
    }

}
