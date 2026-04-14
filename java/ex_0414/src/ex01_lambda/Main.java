package ex01_lambda;

public class Main {
	public static void main(String[] args) {
		CalculatorService cs = new CalculatorService();
		Calculator c = (a, b) -> a + b;
		
		cs.execute(c);
		cs.execute((a, b) -> a - b);
		
		
		String text = "This product is currently out of stock";
		
		TextService ts = new TextService();
		StringProcessor s1 = (upper) -> upper.toUpperCase();
		StringProcessor s2 = (upper) -> upper.replace("out of stock", "in stock");
		
		ts.processText(text, s1);
		ts.processText(text, s2);
		
	}
}
