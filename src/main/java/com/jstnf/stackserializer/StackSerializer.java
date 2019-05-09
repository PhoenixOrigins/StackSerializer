package com.jstnf.stackserializer;

import org.bukkit.plugin.java.JavaPlugin;

public class StackSerializer extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getCommand("serialize").setExecutor(new SerializeCommand(this));
    }

    @Override
    public void onDisable() { }
}