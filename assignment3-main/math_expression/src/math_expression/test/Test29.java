package math_expression.test;

public class Test29 {
	public int x;
	public int y;
	
	public void compute() {
		x = this.external.pow(4, 2);
		y = x = this.external.pow(4, 2) - 2;
	}
	
	private External external;	
	
	public Test29(External external){
		this.external = external;
	}
	
	interface External {		
	public int pow (int n6818971649593317170, int n5906181649593317170);
	}
}
