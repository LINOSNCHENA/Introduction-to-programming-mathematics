package q2exams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class TestSort1 {
  public static void main(String args[]) {

    cleanPemba.clearScreen();
    System.out.print("\n ===================|0_Cleaning_successfully_done|========================\n");
    ArrayList<String> sublings = new ArrayList<String>();
    sublings.add("BNikolas");
    sublings.add("ALorena");
    sublings.add("DMarvin");
    sublings.add("CLeon");

    System.out.print("\n ===================|1ASC-SORTINGS WORDS| ================================\n");
    System.out.println(sublings);
    Collections.sort(sublings, Collections.reverseOrder());
    Iterator<String> iterlist1 = sublings.iterator();
    while (iterlist1.hasNext()) {
      System.out.println(iterlist1.next());
    }
    System.out.print("\n ===================|2DESC-SORTINGS WORDS| ================================\n");
    Collections.sort(sublings);
    System.out.println(sublings);
    Iterator<String> iterlist2 = sublings.iterator();
    while (iterlist2.hasNext()) {
      System.out.println(iterlist2.next());
    }
    System.out.print("\n ====================|3SORTINGS INTEGERS|===================================\n");

    Integer[] daughters = { 13, 7, 6, 45, 21, 9, 101, 102 };
    Arrays.sort(daughters);
    System.out.printf("\n ASCENDING DAUGHTERS[] : %s", Arrays.toString(daughters));
    Arrays.sort(daughters, Collections.reverseOrder());
    System.out.printf("\n DESCENDING DAUGHTERS[] : %s", Arrays.toString(daughters));

    System.out.print("\n=====================|4SORTINGS INT-INTS|===================================\n");
    int[] son1 = { 13, 7, 6, 45, 21, 9, 101, 102 };
    Integer[] sons = Arrays.stream(son1).boxed().toArray(Integer[]::new);

    Arrays.sort(sons);
    System.out.printf("\n ASCENDING SONS[] : %s", Arrays.toString(sons));
    Arrays.sort(sons, Collections.reverseOrder());
    System.out.printf("\n DESCENDING SONS[] : %s", Arrays.toString(sons));
    System.out.print("\n ============================ End ============================================\n");

  }
}