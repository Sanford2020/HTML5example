package data.model;

public class users {
	private int id;
	private String userName;
	private String userPass;
	public int getId()
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getUserName(){return userName;}
	public void setUserName(String userName){this.userName=userName;}
	public String getUserPass(){return userPass;}
	public void setUserPass(String userPass){this.userPass=userPass;}
}

