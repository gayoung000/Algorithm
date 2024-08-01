
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine(); // 개행 문자 소비
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
		    String str= sc.nextLine();
            // 원본 문자열 배열  
            char[] originArr = str.toCharArray();
            
            // 회문 문자열 배열 (우선 원본 문자열로 두기) 
            char[] afterArr = str.toCharArray();
            
            int N = originArr.length;
            for(int i = 0; i < N / 2; i++){
                char tmp = afterArr[i];
               	afterArr[i] = afterArr[N-1-i];
                afterArr[N-1-i] = tmp;
            }
  
            if(Arrays.equals(originArr, afterArr)){
                System.out.println( "#" + test_case + " 1");
            } else { 
                System.out.println( "#" + test_case + " 0");
            }
       }
        sc.close();
        }

}