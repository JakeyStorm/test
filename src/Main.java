import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 =new ArrayList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println(arrayList3);

        arrayList.add(100);
        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(103);
        arrayList.add(104);
        arrayList.add(0,105);
        System.out.println(arrayList);

        linkedList.add(12);
        linkedList.addFirst(123);
        linkedList.add(0,123);
        linkedList.addLast(1234);
        linkedList.add(0,12345);
        linkedList.addAll(arrayList);
        linkedList.addLast(123);
        linkedList.addLast(123);
        linkedList.add(5,123);
        linkedList.addLast(123);
        System.out.println(linkedList);

        System.out.println(arrayList.size());
        System.out.println(linkedList.size());

        arrayList1.add("dsad");
        arrayList1.add("dsad1");
        arrayList1.add("dsad2");
        arrayList1.add("dsad3");
        arrayList1.remove("dsad3");
        System.out.println(arrayList1);

        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList2.add(12.1);
        arrayList2.remove(12.1);
        System.out.println(arrayList2);

        linkedList.remove();
        linkedList.remove(0);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeFirstOccurrence(123);
        linkedList.removeLastOccurrence(123);
        System.out.println(linkedList);

        System.out.println(arrayList.get(0));

        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());

        for(int i = 0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        for(int s : arrayList) {
            System.out.println(s);
        }

        boolean isContainsSherlock = arrayList.contains("Sherlock");
        boolean isContainsSherlock1 = arrayList.contains(100);
        System.out.println(isContainsSherlock);
        System.out.println(isContainsSherlock1);


//        ArrayList<Book> bookArrayList = new ArrayList<>();
//        Book b = new Book("Война и мир","Толстой",1000);
//        bookArrayList.add(b);
//        System.out.println(bookArrayList);
    }
}
