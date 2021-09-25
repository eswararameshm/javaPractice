package ramesh1;

public class Arrays2 {
	public static void main(String[] args) {
		int[] a=new int[15];
		for(int i=0;i<15;i++)
		{
			a[i]=i*5;
		}
		for(int i=0;i<15;i++)
		{
			System.out.println(a[i]);
		}
		//=======================================
		char[] ma;
		ma=new char[7];
		ma[0] ='m';
		ma[1] ='r';
		ma[2] ='a';
		ma[3] ='m';
		ma[4] ='e';
		ma[5] ='s';
		ma[6] ='h';
		System.out.println(ma);
		System.out.println(ma.length);
		
	}

}
