import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();

        // list.add(23);
        // list.add("bapu");
        // list.add(2.333231f);
        // list.add('s');

        ArrayList<String> l = new ArrayList<>();
                
        l.add("bapu");
        l.add("lol");
        l.add("pratham");
        l.add("ttyl");

        System.out.println(l);
    }
}
/*
Methods of List
The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.

Some of the commonly used methods of the Collection interface that's also available in the List interface are:

add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element

*/