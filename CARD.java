package war;

public class CARD {

	public int number = 0;
	public String name = "";
	
	CARD(int number, String name) {
	this.number = number;
	this.name = name;
	//this.count = count;
}

public String describe() {
	String str = "";
	str += number + " of " + name;
	System.out.println(str);
	return str;
	}



public int getNumber() {
	return number;
}


public void setNumber(int number) {
	this.number = number;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


	
}


