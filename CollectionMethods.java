package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionMethods {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>(10);
		list.add("Abdul");
		list.add("Vaseem");
		list.add("Shakeer");
		System.out.println(list.get(0));
		System.out.println(list.get(1)+list.get(2));
		System.out.println(list.contains("vaseem"));
		System.out.println(list);
		System.out.println(list.get(1));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.set(1, "Abdul and vaseem always together");//it will replace the existing one at that place
		System.out.println(list);
		Object s[]=list.toArray();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String sf:list) {
			System.out.println(sf);
		}
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
        System.out.println(iter.hasNext());
		
		ListIterator<String> listiter=list.listIterator();
		while(listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
		

	}

}
