package io.github.noelxtc.battleroyale.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static io.github.noelxtc.battleroyale.constants.Constants.COMMAND_CATASTROPHY;


public class CatastrophyCommandExecutor implements CommandExecutor {
	private BattleRoyaleCommandService commandService;

	public CatastrophyCommandExecutor(BattleRoyaleCommandService commandService) {
		this.commandService = commandService;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		//Check if issued by a player not console
		if (sender instanceof Player) {
			//Check which command was executed
			if (command.getName().equalsIgnoreCase(COMMAND_CATASTROPHY)) {
				this.commandService.catastrophyCommand(sender);
				return true;
			}
		}

		return false;
	}
}
