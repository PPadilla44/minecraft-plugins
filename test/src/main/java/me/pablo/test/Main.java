package me.pablo.test;

import org.bukkit.plugin.java.JavaPlugin;
import me.pablo.test.test.Test;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new Test(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
