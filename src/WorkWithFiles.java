import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorkWithFiles {

	public static String fromFileToString(File file) {
		StringBuilder sb = new StringBuilder();
		String str = "";
		try (BufferedReader f = new BufferedReader(new FileReader(file))) {
			for (; (str = f.readLine()) != null;)
				sb.append(str);
		} catch (IOException e) {
			System.out.println("ERROR");
		}

		return sb.toString();

	}

	private String[] getWords(String text) {
		String[] words = text.split("[ .,\n!]");
		return words;
	}

	private String getChars(String[] array) {
		Map<String, Integer> myMap = new TreeMap<>();
		for (String str : array) {
			for (int i = 0; i < str.length(); i++) {
				if (!myMap.containsKey(str.substring(i, i + 1))) {
					myMap.put(str.substring(i, i + 1), 1);

				} else {
					myMap.put(str.substring(i, i + 1), myMap.get(str.substring(i, i + 1)) + 1);
				}
			}
		}
		return sortByValue(myMap);

	}
	
	

	private String sortByValue(Map<String, Integer> myMap) {
		List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(myMap.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue() );
            }
        });
		return list.toString();
	}

	public void countChars(File file) {
		String text = fromFileToString(file);
		String[] strings = getWords(text);
		 System.out.println(getChars(strings));
	}
}
