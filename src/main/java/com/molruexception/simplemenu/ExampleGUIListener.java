package com.molruexception.simplemenu;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
public class ExampleGUIListener implements Listener {

    @EventHandler
    public void onInvClick(InventoryClickEvent event) {
        final Inventory clickedInventory = event.getClickedInventory();
        if (clickedInventory != null && clickedInventory.getHolder() instanceof ExampleGUI gui) {
            final Player player = (Player) event.getWhoClicked();
            player.sendMessage(gui.getMessage());
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event.getHand() != EquipmentSlot.HAND || event.getAction() != Action.RIGHT_CLICK_BLOCK) {
            return;
        }

        final Block block = event.getClickedBlock();
        if (block.getType() == Material.STONE) {
            final ExampleGUI gui = new ExampleGUI();
            final Player player = event.getPlayer();
            player.openInventory(gui.getInventory());
        }
    }

}
