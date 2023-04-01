package com.molruexception.simplemenu;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class ExampleGUI implements InventoryHolder {

    private final Inventory inventory;
    private final String message;

    public ExampleGUI() {
        this.inventory = Bukkit.createInventory(this, 27, Component.text("Example GUI"));
        this.message = "Test Message.";
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }

    public String getMessage() {
        return message;
    }

}
