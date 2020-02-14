package co.epam4.cleancode;

public class Main {
	public static void main(String args[])
	{
		Interest objectforaccessing=new Interest();
		objectforaccessing.principal=379000;
		objectforaccessing.rate=4;
		objectforaccessing.time=5;
		objectforaccessing.simple();
		objectforaccessing.compoundinterest();
	}
}
