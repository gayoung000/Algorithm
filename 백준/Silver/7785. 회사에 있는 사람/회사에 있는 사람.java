import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int n = Integer.parseInt(st.nextToken());
	    // ArrayList<String> list = new ArrayList<>();
	    
	    HashSet<String> set = new HashSet<>();
	    
	    for(int i = 0; i < n; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	String[] arr = new String[2];
	  	    arr[0] = st.nextToken();
	  	    arr[1] = st.nextToken(); 
	  	    
	  	    if(arr[1].equals("enter")) {
	  	    	// list.add(arr[0]);
	  	    	set.add(arr[0]);
	  	    } else {
	  	    	// list.remove(arr[0]);
	  	    	set.remove(arr[0]);
	  	    }
	    }
	    
	    ArrayList<String> list = new ArrayList<>(set);
	    Collections.sort(list, Collections.reverseOrder());
	    
	    for (String name : list) {
            System.out.println(name);
        }
	}

}
