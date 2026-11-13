package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachDemo {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<>();
		col.add("yellow");           col.add("red");
		col.add("white");            col.add("blue");
		col.add("pink");             col.add(null);
		col.add("red");              col.add("black");
		
		for(String clr : col) {
			System.out.println(clr);
		}
	}
}
