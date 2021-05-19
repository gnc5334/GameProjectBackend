package game.concretes;

import java.util.ArrayList;
import java.util.List;

import game.abstracts.PlayerCheckService;
import game.abstracts.PlayerService;
import game.entities.Player;

public class PlayerManager implements PlayerService {

	
	 List<Player> playerList = new ArrayList<Player>();
     PlayerCheckService _playerCheckService;
     public boolean isSuccess = false;
     
     public PlayerManager(PlayerCheckService _playerCheckService) {
		super();
		this._playerCheckService = _playerCheckService;
	}

     
	@Override
	public void Add(Player player) {
		
		 if (_playerCheckService.Validate(player))
         {
			 playerList.add(player);
             System.out.println(player.getFirstName() + " kayýt oldu");
             isSuccess = true;
         }
         else { 
        	 System.out.println("\n Doðrulama baþarýsýz.Geçersiz kimlik no. ");
             isSuccess = false;
         }
	}

	@Override
	public void Update(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void List() {
		// TODO Auto-generated method stub
		
	}

}
