package me.pablo.spawnpigs;

import me.pablo.spawnpigs.commands.PigCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new PigCommand(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
