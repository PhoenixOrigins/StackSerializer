package com.jstnf.stackserializer;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Type;
import java.util.Map;

public class Serializer
{
	public static String jsonHolder = "";

	public static String serializeItem(ItemStack item)
	{
		Gson gson = new Gson();
		JsonObject json = new JsonObject();

		Map<String, Object> itemProperties = item.serialize();
		jsonHolder = gson.toJson(itemProperties);
		return gson.toJson(itemProperties);
	}

	public static ItemStack deserializeItem()
	{
		Gson gson = new Gson();
		if (jsonHolder.equals(""))
		{
			return null;
		}
		Type type = new TypeToken<Map<String, Object>>(){}.getType();
		Map<String, Object> itemProperties = gson.fromJson(jsonHolder, type);
		ItemStack stack = ItemStack.deserialize(itemProperties);
		ItemMeta meta = (ItemMeta) itemProperties.get("meta"); // This doesn't work!
		if (meta != null)
		{
			stack.setItemMeta(meta);
		}
		return stack;
	}
}