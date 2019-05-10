package com.jstnf.stackserializer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DeserializeLastCommand implements CommandExecutor
{
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			Player p = (Player) sender;

			if (Serializer.deserializeItem() == null)
			{
				p.sendMessage("Nothing has been serialized yet. Serialize something with /serialize!");
			}
			else
			{
				p.getInventory().addItem(Serializer.deserializeItem());
				p.sendMessage("Given item that was last serialized!");
			}
		}
		else
		{
			sender.sendMessage("You must be a player to use this command!");
		}

		return true;
	}
}