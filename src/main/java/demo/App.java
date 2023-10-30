package demo;

public class App {
    public String getMessage() {
	return "The number is: ";
    }

    private int runCalculation() {
	var adder = new Adder();
	return adder.addNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
    
    public static void main(String[] args) {
	var app = new App();
	System.out.println(app.getMessage() + app.runCalculation());
    }
}
