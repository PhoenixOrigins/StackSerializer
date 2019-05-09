package com.jstnf.stackserializer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SerializeCommand implements CommandExecutor
{
    public StackSerializer plugin;

    public SerializeCommand(StackSerializer plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        return true;
    }
}