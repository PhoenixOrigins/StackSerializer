package com.jstnf.stackserializer;

import org.bukkit.plugin.java.JavaPlugin;

public class StackSerializer extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getCommand("deserializelast").setExecutor(new DeserializeLastCommand());
        getCommand("serialize").setExecutor(new SerializeCommand());
    }

    @Override
    public void onDisable() { }
}