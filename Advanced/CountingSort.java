import java.util.Scanner;

public class counting_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements now ... ");
		int max = 0;
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
			if(a[i]>max) max=a[i];
		}
		int[] c = new int[max+1];
		for(int i=0;i<=max;i++) c[i]=0;
		for(int i=0;i<n;i++) ++c[a[i]];
		for(int i=1;i<=max;i++) c[i]+=c[i-1];
		int[] b = new int[n];
		for(int i=n-1;i>=0;i--) {
			b[c[a[i]]-1]=a[i];
			--c[a[i]];
		}
		/*for(int i=0;i<n;i++) {
			a[i]=b[i];
		}*/
		System.out.println("The sorted array is : ");
		for(int i=0;i<n;i++) {
			System.out.println(b[i] + " ");
		}
	}

}
