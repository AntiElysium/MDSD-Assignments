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
	public int pow (int n1127091649592937628, int n1624501649592937628)
	}
}
