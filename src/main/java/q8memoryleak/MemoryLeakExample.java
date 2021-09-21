package q8memoryleak;

import java.util.Vector;

import q2exams.cleanPemba;

public class MemoryLeakExample {
    public static void main(String[] args) {

        cleanPemba.clearScreen();
        System.out.print("==================|memory_successfuly_started|========================");
        Vector v1 = new Vector(314567);
        Vector v2 = new Vector(876543987);
        System.out.print("\n There is no memory leak in this program.\n");

        Vector v3 = new Vector(214444);
       // Vector v4 = new Vector(214744444);
       // Vector v5 = new Vector(214444);
        v1.add("x2");
        v2.add("x3");
        v1.add("x2");
        v3.add("x3");
      //  v4.add("x2");
      //  v5.add("x3");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("Memory Leaks");
        System.out.print("====================|memory_successfuly_ended|=========================");
    }
}