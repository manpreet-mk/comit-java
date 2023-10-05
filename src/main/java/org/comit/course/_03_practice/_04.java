package org.comit.course._03_practice;

public class _04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years=8;
		double salary=65000;
		
		if (years>5) {		
			 double bonus=salary*0.05;
			 salary=salary +bonus;
			  System.out.println("bonus amounr is:"+bonus);
		            System.out.println("updated salaryis: "+ salary);
			
		}
		else {
            System.out.println("no change in salary");
		}
	}

}
