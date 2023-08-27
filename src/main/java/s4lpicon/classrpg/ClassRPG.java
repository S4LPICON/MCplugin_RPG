package s4lpicon.classrpg;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
public final class ClassRPG extends JavaPlugin {
//asasas
    @Override
    public void onEnable() {
        getLogger().info("¡Mi plugin se ha habilitado!");
        getServer().getPluginManager().registerEvents(new BlockClickListener(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("miComando")) {
            sender.sendMessage("¡Hola desde mi comando!");
            return true;
        }
        return false;
    }
}
