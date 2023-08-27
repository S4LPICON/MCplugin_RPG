package s4lpicon.classrpg;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class BlockClickListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        // Obtener el jugador que interactuó con el bloque
        Player player = event.getPlayer();

        // Obtener el bloque con el que interactuó el jugador
        Block block = event.getClickedBlock();

        // Ejemplo de acción: enviar un mensaje al jugador
        player.sendMessage("Interactuaste con un bloque.");
    }
}
