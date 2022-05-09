package packageTwo;

public class utility {
	
	public int addtwoNumbers(int x,int y) {
		
		int sum =x+y;
		System.out.println(sum);
		return sum;
		
	}

	public double celsiustobFar(double celsius) {
		
		double fahranheit;
		fahranheit = (celsius*9)/5+32;
		System.out.println(fahranheit);
		return fahranheit;
	}
	
	public void printName(String name) {
		
		System.out.println();
	}
}
