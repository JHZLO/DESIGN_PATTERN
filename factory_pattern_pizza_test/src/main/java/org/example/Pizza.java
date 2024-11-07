import java.util.ArrayList;

public class Pizza {
    String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

    @Override
	public String toString() {

		String display = "---- ";
		display += name;
        display += " ----\n";
		display += dough;
        display += "\n";
		display += sauce;
        display += "\n";
		for (String topping : toppings) {
			display += topping;
            display += "\n";
		}
		return display;
	}
    
}
