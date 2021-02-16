package app.cleancode;

import org.bukkit.plugin.java.JavaPlugin;

import app.cleancode.commands.StrengthenCommand;

public class StrongWoodsEntryPoint extends JavaPlugin {
@Override
public void onEnable() {
	getLogger().info("Stronger woods plugin enabled!");
	this.getCommand("strengthen").setExecutor(new StrengthenCommand());
}
@Override
	public void onDisable() {
		getLogger().info("Stronger woods plugin disabled!");
	}
}
