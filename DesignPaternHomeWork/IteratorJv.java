import java.util.*;
public class IteratorJv {
    
    public static void main(String[] args) {
     

//an array list

     ArrayList arrl = new ArrayList();
     
     
    // adding new element to array list
    arrl.add("Apple");
    arrl.add("Banana");
    arrl.add("Orange");
    arrl.add("Pear");
    arrl.add("Peach");

    
    // iterator for displaying  array list

        System.out.println("Show me All contents of array list, ");
        Iterator itr = arrl.iterator();
        
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + " ");  
        }
        System.out.println();
        
        // objects which being iterated
        ListIterator litr = al.listIterator();
        
        while(litr.hasNext()){
            Object element= litr.next();
            litr.set(element + " ");
        }
        System.out.println("Modified contents arraylist : ");
        itr = arrl.iterator();
        
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();
        
        // Displaying the list backward
        System.out.println("Modified list backwards: ");
        
        while(litr.hasPrevious()){
            Object element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
