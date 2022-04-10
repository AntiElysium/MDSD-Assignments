package math_expression.test;

public class Test31 {
	public int x;
	public int y;
	
	public void compute() {
		x = 5;
		y = 2 + this.external.pow(, 3 * 2);
	}
	
	private External external;	
	
	public Test31(External external){
		this.external = external;
	}
	
	interface External {		
	public int pow (int n1968011649593317150, int n5513141649593317150);
	}
}
