package co.epam4.cleancode;
import java.util.Scanner;
import java.util.*;
public class HouseConstruction {
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();//takes choice from available options1.standard materials2.above standard materials3.high standards4.automated standard
	float areaofhouse=sc.nextFloat();//take input of house area
	if(choice==1)
	{stdmat();
	}
   else if(choice==2)
	{abovestdmat();
	}
    else if(choice=3)
    {highstdmat();
    }
	else if(choice==4) {
		highautostdmat();
	}
 void highstdmat()
{
	 float cost=areaofhouse*1800;//Construction cost per square feet
}
void highautostdmat() {
	float cost=areaofhouse*2500;
}
void stdmat()
{
	float cost=areaofhouse*1200;
}
void abovestdmat()
{
	float cost=areaofhouse*1500;
}
}
