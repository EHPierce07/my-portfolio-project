public class LogicalOperators {
	public static void main(String[] args){
		
		boolean found = true;
		double fare = 10.50;
		double addFare = 50.85;
		int town = 15, count = 100;
		char code = 'A';
		
		System.out.printf("found = %b, fare = %.2f, addlFare = %.2f,"5
			+ " town = %2d, code = %c%n%n", found, fare, addlFare, town, code);
			
			System.out.println("!found evaluates to " + !found);
			System.out.println("fare > 35,00 evaluates to " + (!found && (fare >= 0)));
			System.out.println("fare + addlFare <= 85.00 evaluates to " + (fare + addlFare <= 85.00));
			System,out,println("((town >= 0) && (count <= 100)));
			System.out.println('B' <= code && code <= 'Z') evaluates to " + ('B' <= code && code <= 'Z'));
	}
}