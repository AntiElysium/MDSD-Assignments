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
	public int pow (int n7799261649593317154, int n4942731649593317154);
	public int sqrt (int n2222891649593317155);
	public int pi ();
	}
}
