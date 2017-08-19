package myproject;

public class PolimorfizmTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Splender();
		System.out.println(b.numerOfWheel);
		b.run();
		
		Animals tab[] = new Animals[3];
		tab[0] = new Cats();
		tab[1] = new Dogs();
		tab[2] = new Owl();
		for(int i = 0; i < 3; i++) {
			tab[i].Voice();
		}

	}

}
