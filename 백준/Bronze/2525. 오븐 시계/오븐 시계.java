import java.util.*;

public class Main{
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int h = sc.nextInt();
    	int m = sc.nextInt();
    	
    	
    	int c = sc.nextInt();
    	
    	int cnt = 0;
    	int num = 0;
    	cnt = m+c;
    	
    	
    	if(cnt > 59) {
    		num = cnt / 60;
    		cnt = cnt % 60;
    		h += num;
    		
    		if(h > 23) {
    			h -= 24;
    		}
    	}
    	
    	System.out.println(h + " " + cnt);
    	
    }
}