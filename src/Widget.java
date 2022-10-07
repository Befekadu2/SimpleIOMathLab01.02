/**
 *class Widget represents a simple product for testing
 * @param /09/15/2022
 * @author befekadu
 */
public class Widget {
    private String name;
    private int ID;
    private double cost;
    /**
     * Parameterized constructor for class Widget
     */
public Widget(String n, int i, double c) {
    name = n;
    ID = i;
    cost = c;
}

    public Widget() {
    }

    public String toString() {
    return name + "\t" + ID + "\t$" + cost;
}

    /**
     * Main method for class Widget
     * @parma args Command-line arguments,if needed
     */
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i]);
        Widget w = new Widget();

    }
}
