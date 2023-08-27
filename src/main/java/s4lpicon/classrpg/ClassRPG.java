package s4lpicon.classrpg;

import org.bukkit.entity.Player;
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
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // Verificar si el comando es "miComando"
        if (cmd.getName().equalsIgnoreCase("miComando")) {
            // Verificar si el remitente es un jugador
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("¡Comando personalizado ejecutado!");
            } else {
                sender.sendMessage("Este comando solo se puede ejecutar como jugador.");
            }
            return true; // Indicar que el comando fue manejado
        }
        return false; // El comando no fue manejado
    }
}