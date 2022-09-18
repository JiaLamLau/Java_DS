import java.util.*;

public class TestArrayAndLinked {
    public static void main(String[] args) {
        List<Integer> arrayList =new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0,10);
        arrayList.add(3,30);
        System.out.println("A list of integer in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
        //System.out.println(linkedList);
        linkedList.add(1,"red");
        System.out.println(linkedList);
        linkedList.removeLast();
        linkedList.addFirst("Green");
        System.out.println("添加完后的linklist");
        System.out.println(linkedList);

        System.out.println("Display the linked list forword:");
        ListIterator<Object> listIterator =linkedList.listIterator();//
        while(listIterator.hasNext()){
            System.out.println(listIterator.next()+"");
        }
        System.out.println();

        System.out.println("Display the linked list backward");
        listIterator=linkedList.listIterator(linkedList.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
    }
}
