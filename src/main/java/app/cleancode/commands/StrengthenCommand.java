package app.cleancode.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class StrengthenCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player)sender;
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 5));
			return true;
		}else {
			sender.sendMessage("The strengthen command can only be executed by players");
			return false;
		}
	}

}
