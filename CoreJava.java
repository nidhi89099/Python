package Pack;

public class CoreJava {

	public static void main(String[] args) {
		// Creating Variables
		int a= 5;
		String s = "Nidhi";
		char ch = 'g';
		double f = 12.5;
		boolean b = true;
		//System.out.println(s);
		System.out.println(a+ "My lucky number");//Concatenation
		
		//Arrays are variables which hold multiple values of same data types
		int[]A=new int[5];
		A[0]= 1;
		A[1]= 2;
		A[2]= 3;
		A[3]= 4;
		A[4]= 5;
		
		int[]B= {1,8,3,4,9};    // other way of defining Arrays
		//		System.out.println(A[2]);
		//For loop
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]);
			
		}
		
		String[] name= {"Nidhi","Gupta","Java"};
		for(int i=0;i<name.length;i++)
		
		{
			System.out.println(name[i]);
		}
		//Enhanced For Loop
		for(String S:name)
		{
			System.out.println(S);
		}
		
		
		
		
		
		
		
		
		

	}

}
