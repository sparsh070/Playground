import java.util.Scanner;
class Main{
  
	public static void main (String[] args) {
		Scanner in=new Scanner (System.in);
         int num=in.nextInt();
      int num2=num /100;
      int num3=num %10;
      int add=num2+num3;
      System.out.println(add);
	}
}