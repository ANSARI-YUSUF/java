import java.lang.*;
import java.util.*;
class arraylist{

    public static void main(final String[] args) {

        // System.out.println("hello");
        List<Integer> l = new ArrayList();

        Iterator<Integer> it=l.iterator();

        l.add(10);
        l.add(5);
        l.add(80);
        System.out.println(l);

        List<Integer> l2 = new ArrayList();


        l2.add(100);
        l2.add(50);

        l.add(800);

        l.addAll(l2);
        l.add(3, 5000);
        l.set(4,900);
       int a= l.get(4);

       l.remove(5);
       l.remove(Integer.valueOf(80));

    //    l.contains(5)
       System.out.println(l.contains(5));
        System.out.println(l);
        System.out.println(a);

        for (Integer e : l) {

            System.out.println("the element:"+e);

            
        }


        while(it.hasNext()){
            
            System.out.println("Iterator="+it.next());
        }
        l.clear();
    }
}