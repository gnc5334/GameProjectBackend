package game.entities;

public class Player {
	
	  private int Id;
	  private String FirstName;
	  private String LastName;
	  private int BirthYear;
	  private long IdentitiyNumber;
	  
	  public Player() {}
	  
	public Player(int id, String firstName, String lastName, int birthYear, long identitiyNumber) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		BirthYear = birthYear;
		IdentitiyNumber = identitiyNumber;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getBirthYear() {
		return BirthYear;
	}

	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}

	public long getIdentitiyNumber() {
		return IdentitiyNumber;
	}

	public void setIdentitiyNumber(long identitiyNumber) {
		IdentitiyNumber = identitiyNumber;
	}
	  
	  

}
