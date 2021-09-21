package q9hashcode;

import java.util.Scanner;

import q2exams.cleanPemba;

public class IntegerHashCodeExample1 {
    public static void main(String[] args) {
        cleanPemba.clearScreen();
        // Create integer object
        Integer i = 66;
        // Returned hash code value for this object
        int hashValue = i.hashCode();
        System.out.println("\n Hash code Value for object is: " + hashValue);

        int hashValue2 = Integer.hashCode(55);
        System.out.println("Hash code Value for object is: " + hashValue2);

        // Create integer object
        System.out.print("Enter the desired input value: ");
        Scanner readInput = new Scanner(System.in);
        Integer ix = readInput.nextInt();
        readInput.close();
        // Returned hash code value for this object
        int hashValue3 = Integer.hashCode(ix);
        System.out.println("Hash code Value for object is: " + hashValue3);

        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");

        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));

        String a = "200";
        String b = "200";

        if(a.equals(b)){
            System.out.println("Equal variables1:");
            System.out.println(a.hashCode() + "\n" + b.hashCode());
        }

        String c = "1d04";
        String d = "1d0";

        if(!c.equals(d)){
            System.out.println("\nUn-equal variables2:");
            System.out.println(c.hashCode() + "\n" + d.hashCode());
        }

    }
}
