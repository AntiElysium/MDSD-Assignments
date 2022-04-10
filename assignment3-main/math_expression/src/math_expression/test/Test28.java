package math_expression.test;

public class Test28 {
	public int x;
	public int y;
	
	public void compute() {
		x = this.external.sqrt(4);
		y = x = this.external.sqrt(4) * 2;
	}
	
	private External external;	
	
	public Test28(External external){
		this.external = external;
	}
	
	interface External {		
	public int sqrt (int n860171649593317152);
	}
}
