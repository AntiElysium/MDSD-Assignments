package math_expression.test;

public class Test30 {
	public int x;
	
	public void compute() {
		x = this.external.sqrt(this.external.pow(this.external.pi(), 2));
	}
	
	private External external;	
	
	public Test30(External external){
		this.external = external;
	}
	
	interface External {		
	public int pow (int n4535871649592937600, int n6728691649592937600)
	public int sqrt (int n9009541649592937600)
	public int pi ()
	}
}
