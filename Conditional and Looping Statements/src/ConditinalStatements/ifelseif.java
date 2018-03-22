package ConditinalStatements;

public class ifelseif {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a > b && b > c){
			System.out.println("a i s greater value");
		}else if(b > a && b > c){
			System.out.println("b is a greater value");
		}else{
			System.out.println("c is a greater value");
		}
			
	}

}
