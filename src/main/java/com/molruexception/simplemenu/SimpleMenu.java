package com.molruexception.simplemenu;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleMenu extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new ExampleGUIListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
