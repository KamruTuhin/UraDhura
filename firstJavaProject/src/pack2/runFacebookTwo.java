package pack2;

public class runFacebookTwo {

	public static void main(String[] args) {
		
		facebook a=new facebook("abc","hgvh");
		facebook b=new facebook("bac","trst123");
		b.call();
		b.call("dfa");
		
		//facebook c=new facebook(12);
		
		System.out.println(a.username);
		System.out.println(a.password);
		System.out.println(b.username);
		System.out.println(b.password);
		
		//c.post();
	}

}
