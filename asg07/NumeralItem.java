public class NumeralItem implements Item {
	int value;

	public NumeralItem(int value) {
		this.value = value;
	}

	public NumeralItem clone() {
		return this;
	}

	public String toString() {
		return value + "";
	}

	@Override
	public boolean equals(Item num) {
		if (this.toString() == num.toString())
			return true;
		return false;
	}

}