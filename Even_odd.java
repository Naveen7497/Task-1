import java.util.Scanner;
 class Even_odd{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=in.nextInt();
	if(n%2==0)
		System.out.println(n+" is even");
	else
		System.out.println(n+" is odd");
	}
 
 }