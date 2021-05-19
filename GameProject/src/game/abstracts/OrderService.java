package game.abstracts;

import game.entities.Campaign;
import game.entities.Game;
import game.entities.Player;

public interface OrderService {
	
	 void Order(Player player,Game game, Campaign campaign);

}
