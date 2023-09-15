package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListToMap {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	HashMap<Object,Object> map = new HashMap<>();
	for(int j=0;j<list.size();j++)
	{
		map.put(j,list.get(j));
	}
	System.out.println(map);
	System.out.println(list);
	list.remove(0);
}

}
