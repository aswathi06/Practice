package wordcount.sort;
import java.util.Comparator;

import wordcount.Word;


public class WordComparator implements Comparator<Word>{

	@Override
	public int compare(Word o1, Word o2) {
		// TODO Auto-generated method stub
//		if(o1.getOccurance()>o2.getOccurance())
//			return 1;
//		else if(o1.getOccurance()<o2.getOccurance())
//			return -1;
//		else if(o1.getOccurance() == o2.getOccurance())
//			return 0;
		return o2.getOccurance() - o1.getOccurance();
	}

}
