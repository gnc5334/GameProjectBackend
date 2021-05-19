package game.concretes;

import game.abstracts.PlayerCheckService;
import game.entities.Player;

public class PlayerValidation implements PlayerCheckService {

	@Override
	public boolean Validate(Player player) {
		  if ( player.getBirthYear()>0 && player.getFirstName().length()>0 && player.getLastName().length()>0 && player.getIdentitiyNumber()>0)
          {
              return true;
          }
          else
          {
              return false;
          }
	}

}
