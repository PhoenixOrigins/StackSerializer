package com.jstnf.stackserializer;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SerializeCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (sender instanceof Player)
        {
            Player p = (Player) sender;

            ItemStack inHand = p.getInventory().getItemInMainHand();
            if (inHand == null || inHand.getType() == Material.AIR)
            {
                sender.sendMessage("You do not have an item in your hand!");
            }
            else
            {
                sender.sendMessage(Serializer.serializeItem(inHand));
            }
        }
        else
        {
            sender.sendMessage("You must be a player to use this command!");
        }

        return true;
    }
}