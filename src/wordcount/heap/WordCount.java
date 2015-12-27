package wordcount.heap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import wordcount.Word;


public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Map<String,Integer> map = new HashMap<String,Integer>();
			BufferedReader br = new BufferedReader(new FileReader(new File("wordCount.txt")));
			String line;
			String[] words;
			while(( line = br.readLine()) != null){
				System.out.println(line);
				words = line.split(" ");
				
				for(String word : words){
					if(map.containsKey(word)){
						int value = (Integer) map.get(word);
						value = value+1;
						map.replace(word, value);
					}else{
						int val = 1;
						map.put(word, val);
					}
				}
				
			}
			br.close();
			Word wc;
			//List<Word> keyVal = new ArrayList<Word>();
			PriorityQueue<Word> pq = new PriorityQueue<Word>(new WordComparator());
			
			Set<String> keys = map.keySet();
			for(String key : keys){
				wc = new Word(key, (Integer)map.get(key));	
				//keyVal.add(wc);
				pq.add(wc);
			}
			//keyVal.sort(new WordComparator());
			


			Word wordObj;
			for(int i=0;i<5;i++){
				
				wordObj = pq.poll();
				System.out.println("Word "+wordObj.getName()+" occured "+wordObj.getOccurance()+" times!!");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
