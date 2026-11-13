package collection;
import java.util.Collection;
import java.util.ArrayList;

class CollectionMethodsDemo {
	public static void main(String[] args) {
		Collection<String>csCol = new ArrayList<>();
		csCol.add("Monish");
		csCol.add("Saumitra");
		csCol.add("Kavana");
		csCol.add("Sachin");
		
		Collection<String>ecCol = new ArrayList<>();
		ecCol.add("Umesh");
		ecCol.add("Lakshmi");
		ecCol.add("Chetan");
		ecCol.add("Mohan");
		
		Collection<String>mechCol = new ArrayList<>();
		mechCol.add("SreeLeela");
		mechCol.add("Shishira");
		mechCol.add("Pooja");
		mechCol.add("Millie");
		
		Object[] mechArr = mechCol.toArray();
		
		Collection<String> tcsCol = new ArrayList<>();
		tcsCol.addAll(csCol);
		tcsCol.addAll(ecCol);
		tcsCol.addAll(mechCol);
		
		System.out.println(tcsCol.size());
		System.out.println(tcsCol);
		
		tcsCol.remove("Chetan");
		System.out.println(tcsCol.size());
		System.out.println(tcsCol);
		
		tcsCol.removeAll(mechCol);
		
		System.out.println("Saumitra present? "+tcsCol.contains("Saumitra"));
		System.out.println("Pooja present? "+tcsCol.contains("Pooja"));
		
		System.out.println(tcsCol.isEmpty());
		tcsCol.clear();
		System.out.println(tcsCol.isEmpty());
		
	}
}

/* Output:- 
12
[Monish, Saumitra, Kavana, Sachin, Umesh, Lakshmi, Chetan, Mohan, SreeLeela, Shishira, Pooja, Millie]
11
[Monish, Saumitra, Kavana, Sachin, Umesh, Lakshmi, Mohan, SreeLeela, Shishira, Pooja, Millie]
Saumitra present? true
Pooja present? false
false
true
*/
