package assignment02;

import java.util.Scanner;

public class Student {
int y;
public static void main(String[]args)
{Scanner scanner=new Scanner(System.in);
System.out.println("Enter value:  ");
 int y=scanner.nextInt();
	Student std=new Student();
	System.out.println("Enter number is valid:" +"    "+std.y);
	scanner.close();
}
}
