import java.util.Scanner;

public class Main{
	
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int input = sc.nextInt();
    	int[] arr = new int[input];
    	int cnt = 0;
    	
    	for(int i = 0; i < input; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	int num = sc.nextInt();
    	
    	for(int j = 0; j < arr.length; j++) {
    		if(num == arr[j]) {
    			cnt++;
    		}
    	}
    	System.out.println(cnt);
    }
}