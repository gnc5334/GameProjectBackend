package game.entities;

public class Game {
	
	 private int Id;
	 private String GameName;
	 private double GamePrice;
	 private String GameType;
	 private String GameCategori;
	 private String GameEAN;
	 
	 public Game() {}
	 
	public Game(int id, String gameName, double gamePrice, String gameType, String gameCategori, String gameEAN) {
		super();
		Id = id;
		GameName = gameName;
		GamePrice = gamePrice;
		GameType = gameType;
		GameCategori = gameCategori;
		GameEAN = gameEAN;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getGameName() {
		return GameName;
	}


	public void setGameName(String gameName) {
		GameName = gameName;
	}


	public double getGamePrice() {
		return GamePrice;
	}


	public void setGamePrice(double gamePrice) {
		GamePrice = gamePrice;
	}


	public String getGameType() {
		return GameType;
	}


	public void setGameType(String gameType) {
		GameType = gameType;
	}


	public String getGameCategori() {
		return GameCategori;
	}


	public void setGameCategori(String gameCategori) {
		GameCategori = gameCategori;
	}


	public String getGameEAN() {
		return GameEAN;
	}


	public void setGameEAN(String gameEAN) {
		GameEAN = gameEAN;
	}
	 
     
}
