import java.util.Scanner;
 class Multiplication{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=in.nextInt();
     for(int i=1;i<=10;i++){
	  System.out.println("%d * %d = %d",n, i, n*i);
	 }
	}
}	