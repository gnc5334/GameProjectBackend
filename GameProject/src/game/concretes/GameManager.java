package game.concretes;

import java.util.ArrayList;
import java.util.List;
import game.abstracts.GameService;
import game.entities.Game;

public class GameManager implements GameService {

	 List<Game> gameList = new ArrayList<Game>();
	 
	@Override
	public void Add(Game game) {
		System.out.println(game.getGameName() + " eklendi");
		gameList.add(game);
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getGameName() + " güncellendi");
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getGameName() + " silindi");
		gameList.remove(game);
	}

	@Override
	public void List() {
		for(Game itemGame : gameList){
			System.out.println(itemGame.getGameName());
		}
		
	}

}
