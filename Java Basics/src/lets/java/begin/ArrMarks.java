package lets.java.begin;


import java.util.*;
public class ArrMarks {
	
	public static void update(int marks[]) {
		for(int i=0; i< marks.length;i++) {
			marks[i]=marks[i]+10;
		}
		
	}
	
	public static void main(String args[]) {
		int marks[]=new int[3];
		Scanner sc=new Scanner(System.in);
		
		 marks[0]=sc.nextInt();
		 marks[1]=sc.nextInt();
		 marks[2]=sc.nextInt();
		 
		 System.out.println("sub1 marks is="+marks[0]);
		 System.out.println("sub2 marks is="+marks[1]);
		 System.out.println("sub3 marks is="+marks[2]);
		
		
		 int percentage=((marks[0]+marks[1]+marks[2])/3);
		 System.out.println("percentage is="+percentage);
		 System.out.println("length of array is="+marks.length);
		 
		 
		 update(marks);
		 for(int i=0; i< marks.length;i++) {
		 System.out.println (marks[i]);
		 }
	}

}