package io.github.gmills82.battleroyale.catastrophy;

import org.bukkit.World;

/**
 * @author Noel Tony
 * @since 12//25
 */
public interface Catastrophy {
	double getDelay();

	void warnPlayers();

	void initiateCatastrophy(World world);
}
