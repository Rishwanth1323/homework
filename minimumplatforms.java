
import java.io.*;

class Main {

	public static int findPlatform(int arr[], int dep[],
								int n)
	{

		
		int plat_needed = 1, result = 1;
		int i = 1, j = 0;

		
		for (i = 0; i < n; i++) {
			// minimum platform
			plat_needed = 1;

			for (j = i + 1; j < n; j++) {
				// check for overlap
				if (Math.max(arr[i], arr[j])
					<= Math.min(dep[i], dep[j]))
					plat_needed++;
			}

			
			result = Math.max(result, plat_needed);
		}

		return result;
	}


	public static void main(String[] args)
	{
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n = 6;
		System.out.println(findPlatform(arr, dep, n));
	}
}
