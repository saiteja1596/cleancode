package co.epam4.cleancode;
import java.util.Scanner;
	public class Interest
	{public int principal;
	public int time;
	public int rate;
	public int nooftimesinterestcompounded;
	public void simple()//calculate simple interest
		{float  sinterest;
	         sinterest = (principal * rate * time) / 100;
		}
	public void compoundinterest()//calculate compound interest 
	{double amount = principal * Math.pow(1 + (rate / nooftimesinterestcompounded), nooftimesinterestcompounded * time);
	 CompoundInterest obj = new CompoundInterest();
	 obj.calculate(2000, 5, .08, 12);
	    }
	}