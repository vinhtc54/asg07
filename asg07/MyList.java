public class MyList implements Item {
	Node start;
	Node end;

	public MyList() {

	}

	public void append(Item item) {
		Node node = new Node(item, null);
		if (start == null) {
			start = node;
		} else

			end.next = node;
		end = node;

	}

	public void appendList(MyList list) {
		Node node = list.start;
		while (node != null) {
			if (start == null) {
				start = node;
			} else {
				end.next = node;
			}
			end = node;
			node = node.next;
		}
	}

	public Item clone() {
		return this;
	}

	public String toString() {
		String s = "(";
		Node node = start;
		while (node != null) {
			s += node.data.toString() + ",";
			node = node.next;
		}
		s = s.substring(0, s.length() - 1) + ")";
		return s;
	}

	public int length() {
		int count = 0;
		Node node = start;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}

	public boolean equals(Item item) {
		MyList list = (MyList) item;
		if (this.length() == list.length()) {
			Node node1 = this.start;
			Node node2 = list.start;
			boolean b = true;
			while (node1 != null && node2 != null) {
				b = node1.data.equals(node2.data);
				if (b = false)
					break;
				else
					node1 = node1.next;
				node2 = node2.next;
			}
			return b;
		} else
			return false;

	}

}
