public class TestMyList {
	public static void main(String[] args) {
		MyList l = new MyList();
		l.append(new NumeralItem(1));
		l.append(new NumeralItem(2));
		System.out.println(l);
		
		// do dai cua list
		System.out.println("do dai la: " + l.length());
		
		//tao list l3 de so sanh voi l
		MyList l3 = new MyList();		
		l3.append(new NumeralItem(1));
		l3.append(new NumeralItem(2)); 
		
		//so sanh 2 list
		System.out.println("so sanh 2 list:  "+l3.equals(l));

		// them list l2 vao va them phan tu cua l2
		MyList l2 = new MyList();
		l2.append(new StringItem("a"));
		l2.append(new StringItem("b"));
		System.out.println(l2); // (a, b)
		
		
		// noi l va l2
		l.append(l2);
		System.out.println(l);
		
		// noi l va l2 theo kieu noi list
		l.appendList(l2);
		System.out.println(l);
		l2.append(new NumeralItem(5));
		System.out.println(l2);
		System.out.println(l);

	}
}
