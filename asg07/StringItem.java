public class StringItem implements Item{
	String value;

	public StringItem(String value) {
		this.value = value;
	}

	public StringItem clone() {
		return this;
	}

	public String toString() {
		return value + "";
	}
	public boolean equals(Item str){
		if(this.value==str.toString()) return true;
		return false;
	}


}