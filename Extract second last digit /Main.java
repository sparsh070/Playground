import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int lastdigit=num/10;
      int secondlast=lastdigit%10;
      System.out.println(secondlast);
	}
}