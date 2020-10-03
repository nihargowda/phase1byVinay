package streams_api_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamsDemo {

	public static void main(String[] args) {
		List<Integer> lis=new ArrayList<>(Arrays.asList(22,33,44,55,11,22,99));
		System.out.println("lis = "+lis);
		int sum=lis.stream().filter(i->i>40).mapToInt(i->i).sum();
		System.out.println("Sum = "+sum);
		
		
		List<String> lisString=new ArrayList<>(Arrays.asList("hey","hii","hello","java","jee","vinay","pavan","jme"));
		
		List<String> results=lisString.stream().sorted(Collections.reverseOrder()).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("results "+results);
		
		results=lisString.stream().filter(s->s.length()>3 && s.length()<5).sorted(Collections.reverseOrder()).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("results "+results);
	}

}
// ::(method reference operator)