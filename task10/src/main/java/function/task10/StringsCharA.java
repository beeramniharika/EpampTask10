package function.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class StringsCharA {

	public static void main(String[] args) {
		String[] strarr={"apple","ammani","ami","ANT","job","aam","dad","mine","ant","life"};
		List<String> strlist = Arrays.asList(strarr);
		List<String> startwitha3 = filter(strlist,(String str)-> (str.startsWith("a"))&&(str.length()==3));
		System.out.println(startwitha3);
	
	}

	private static List<String> filter(List<String> strlist, Predicate<String> predicate) {
       List<String> finalString =  new ArrayList<>();
       for(String str : strlist){
    	   if(predicate.test(str)){
    		   finalString.add(str);
    	   }
       }
		return finalString;
	}
}

