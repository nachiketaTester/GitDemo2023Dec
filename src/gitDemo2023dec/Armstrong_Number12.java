package gitDemo2023dec;

import java.util.Scanner;

public class Armstrong_Number12 {

	public static void main(String[] args) {
int n,rem,arm=0;
Scanner sv=new Scanner(System.in);
System.out.println("Enter number : ");
n=sv.nextInt();
int c=n;
while(n>0)
{
	rem=n%10;
	arm=(rem*rem*rem)+arm;
	n=n/10;
	}
if(c==arm)
{
	System.out.println("It is a Armstrong Number");
}else
{
	System.out.println("It is not a ArmStrong number .");
}
	}

}
