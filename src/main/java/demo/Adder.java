package demo;

public class Adder {
    public int addNumbers(int... numbers) {
	var total = 0;
	for(var n : numbers) {
	    total += n;
	}

	return total;
    }
}
