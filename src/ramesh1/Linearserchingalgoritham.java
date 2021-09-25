package ramesh1;

public class Linearserchingalgoritham {
	public static void main(String[]args) {
		int[] a = { 75, 23, 55, 66, 11, 9, 22, 99, 27, 24, 29, 59, 69, 80 };
		int n = a.length;
		int item=90;
		boolean isElementFound = false;
		for (int i=0;i<n;i++)
		{
			if (a[i]==item)
			{
				System.out.print("element found in the position:"+i);
				isElementFound=true;
			}
			
		}
		if(!isElementFound) {
			System.out.print("element not found");
		}
	}

}
