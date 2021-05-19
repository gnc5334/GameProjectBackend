package game.abstracts;

import game.entities.Game;

public interface GameService {
	
	 void Add(Game game);
     void Update(Game game);
     void Delete(Game game);
     void List();

}
