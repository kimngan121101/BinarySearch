import java.util.Arrays;
public class BinarySearch {
	
	public static void main(String[] args) {
		
        Integer[] arr = { 1,2,0,3,4,5,6};   
        int x = 3; 
        Arrays.sort(arr);
        
		int result = binarySearch(arr, x); 
		
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
	}
	
	public static <T extends Comparable<T>> int binarySearch(T[] data, T target) {
		int l = 0, r = data.length - 1; 
        while (l <= r) { 
            int m = l + (r-l) / 2; 
  
            if (data[m].compareTo(target) == 0 ) 
                return m; 
  
            if (data[m].compareTo(target) < 0 ) 
                l = m + 1; 
  
            else
                r = m - 1; 
        } 
		return -1;	
	}

}
