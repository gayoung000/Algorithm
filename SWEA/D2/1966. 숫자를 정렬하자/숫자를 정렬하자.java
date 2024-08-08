
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		//System.setIn(new FileInputStream("res/input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
           int N = sc.nextInt();
           int[] arr = new int[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            for (int i = 1; i < N; i++){
                int temp = arr[i];
                int j;
                for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
                    arr[j+1] = temp;
		}
            
            System.out.print("#" + test_case + " ");   
               for (int i = 0; i < N; i++) {
                System.out.print(arr[i]);
                if (i < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
            
	
        sc.close();
}
}