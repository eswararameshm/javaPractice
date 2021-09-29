package ramesh1;

public class Arraybignum {
	public static void main(String[] args)
	{
		int[] a= {75,23,55,66,11,9,22,99,27,24,29,59,69,80};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min) {
				min=a[i];
			}
			if(a[i]>max) {
				max=a[i];	
			}
		}
		System.out.println("biggest element in the array=" + max);
		System.out.println("smallest element in the array=" + min);
		System.out.println(a.length);
	}
}
