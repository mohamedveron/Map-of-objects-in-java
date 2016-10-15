import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main {
public static void main (String []args){
	Comment c1 = new Comment(1, "c1");
	Comment c2 = new Comment(2, "c2");
	Comment c3 = new Comment(3, "c3");
	Comment c4 = new Comment(4, "c4");
	Type t1  = new Type(1,"t1");
	Type t2  = new Type(2,"t2");
	Type t3  = new Type(3,"t3");
	Type t4  = new Type(1,"t1");
	Map<Report,Integer>map = new HashMap<Report,Integer>();
	map.put(new Report(1,c1,t1), 1);
	map.put(new Report(2,c2,t2), 1);
	map.put(new Report(3,c3,t3), 1);
	map.put(new Report(4,c4,t4), 1);
	
	Set<Report> keys = map.keySet();
    for(Report p:keys){
        System.out.println(p+"==>"+map.get(p));
    }
}
}
