import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        hs1.add(6);
        System.out.println("Set1 :"+hs1);
        Iterator<Integer> iterator1 = hs1.iterator();


        hs2.add(4);
        hs2.add(5);
        hs2.add(6);
        hs2.add(7);
        hs2.add(8);
        hs2.add(9);
        hs2.add(10);
        hs2.add(11);
        System.out.println("Set2 :"+hs2);
        List<Integer> list = new ArrayList<>(hs2);

        list.remove(3);

        hs2= new HashSet<>(list);
        System.out.println("Set2 after removal  :"+hs2);



        Set<Integer> unionOfSet = new HashSet<>(hs1);
        unionOfSet.addAll(hs2);

        Set<Integer> intersectionOfSet = new HashSet<>(hs1);
        intersectionOfSet.retainAll(hs2);

        System.out.println("Union Set: ");
        Iterator<Integer> iterator3 = unionOfSet.iterator();
        while (iterator3.hasNext()) {
            System.out.print(iterator3.next()+ " ");
        }
        System.out.println();

        System.out.println("Intersection Set: ");

        Iterator<Integer> iterator4 = intersectionOfSet.iterator();
        while (iterator4.hasNext()) {
            System.out.print(iterator4.next()+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Linkedlist : ");

        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);

        Iterator<Integer> iterator5 = ll.iterator();
        while (iterator5.hasNext()) {
            System.out.print(iterator5.next()+" ");
        }
        System.out.println();
        System.out.println("3rd Element :");
        System.out.println(ll.get(2));
    }
}
