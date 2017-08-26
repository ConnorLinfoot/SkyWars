package com.connorlinfoot.skywars;

import com.connorlinfoot.networklib.NetworkLib;
import org.bukkit.plugin.java.JavaPlugin;

public class SkyWarsPlugin extends JavaPlugin {
    private SkyWarsGame game;

    public void onEnable() {
        game = new SkyWarsGame();
        NetworkLib.getAPI().getNetworkServer().switchModule(getGame());
    }

    public SkyWarsGame getGame() {
        return game;
    }

}
