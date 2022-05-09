package packageOne;

public class runMain {

	public static void main(String[] args) {
	  
		Scanner FarenhiteT = new Scanner(System.in);
		System.out.println(&quot;Enter Farenhite Temparature :&quot;);
		int FarenhiteTemp = FarenhiteT.nextInt();
		int Celsius_Temperature = (( FarenhiteTemp - 32)*5)/9;
		System.out.println(&quot;The Celsius Temperature is :&quot; +Celsius_Temperature);

	}

}
