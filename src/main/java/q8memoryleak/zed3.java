package q8memoryleak;

import java.util.*;

import q2exams.cleanPemba;

class TestArrayLinked {
    public static void main(String args[]) {

        cleanPemba.clearScreen();
        System.out.println("====================|X1|=====================");
        System.out.println("====================|lISTfATSER?|=====================");

        List<String> al = new ArrayList<String>();// creating arraylist
        al.add("Ravi");// adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.add("ZAMBIA");

        List<String> al2 = new LinkedList<String>();// creating linkedlist
        al2.add("James");// adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");
        al2.add("ZAMBIA");

        System.out.println("arraylist: " + al);
        System.out.println("linkedlist: " + al2);

        long start = System.nanoTime();
        al.remove(4);
        long end = System.nanoTime();
        long start2 = System.nanoTime();
        al2.remove(4);
        long end2 = System.nanoTime();

        long elapsedTime1 = end - start;
        long elapsedTime2 = end2 - start2;

        System.out.println("arraylist-SPEED1: " + al);
        System.out.println("arraylistTime: " + elapsedTime1);
        System.out.println("linkedlist-SPEED2: " + al2);
        System.out.println("arraylistTime: " + elapsedTime2);
        System.out.println("====================|X2|=====================");
    }
}