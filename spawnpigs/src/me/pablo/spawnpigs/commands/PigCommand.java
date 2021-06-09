package me.pablo.spawnpigs.commands;

import me.pablo.spawnpigs.Main;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class PigCommand implements CommandExecutor {

    private Main plugin;

    public PigCommand(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("spawnpigs").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)) {
            sender.sendMessage("Only players may execute this command!");
            return true;
        }

        Player p = (Player) sender;

        if(p.hasPermission("spawnpigs.use")) {

            Location loc = p.getLocation();
            World w = loc.getWorld();

            for(int i = 0; i < 10; i++) {
                w.spawnEntity(loc, EntityType.PIG);
            }
            return true;
        } else {
            p.sendMessage("You do not have permission to execute this command!");
        }

        return false;
    }
}

