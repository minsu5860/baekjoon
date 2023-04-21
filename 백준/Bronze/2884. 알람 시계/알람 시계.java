import java.util.*;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		min -= 45; 
		
		if(min < 0) {
			hour--;
			min += 60;
			
			if(hour < 0) {
				hour = 23;
			}
		}
		System.out.println(hour + " " + min);
	}
}