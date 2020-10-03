package streams_api_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoWithoutStreams {

	public static void main(String[] args) {
	
		List<Integer> lis=new ArrayList<>(Arrays.asList(22,33,44,55,11,22,99));
		System.out.println("lis = "+lis);
		int sum=0;
		for(Integer i:lis) {
			if(i>40) {
			sum=sum+i;
			}
		}
		System.out.println("Result is "+sum);
	}

}
