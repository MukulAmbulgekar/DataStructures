package practice;

import java.util.*;

public class CollectionDemo {

   public static void main(String[] args) {
      List<String> a1 = new ArrayList<String>();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1.remove(0));
      System.out.print("\t" + a1);

      List<String> l1 = new LinkedList<String>();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);
      Iterator<String> i=a1.iterator();
      while(i.hasNext()){
          System.out.println("\n"+i.next());
      }
   }
}
