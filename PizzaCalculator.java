
public class PizzaCalculator {

	//Takes input and prints output
	public void pizzaInputOutput() {
		Kattio io = new Kattio(System.in);
		
		//Radius input
		int r = io.getInt();
		//Crust input
		int c = io.getInt();
		System.out.print(pizzaCalculator(r, c));
		io.close();
	}
	// Takes 2 ints and returns procentage
	public double pizzaCalculator(int r, int c) {
		return areaCalculator(r-c)/areaCalculator(r)*100;
	}
	// Takes one int and return area	
	public Double areaCalculator(int r) {
		return Math.PI * (r*r);
	}
	
	public static void main (String[] args) {
		new PizzaCalculator().pizzaInputOutput();
	}
	
}
