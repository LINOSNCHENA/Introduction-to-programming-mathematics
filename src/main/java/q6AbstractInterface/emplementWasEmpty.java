package q6AbstractInterface;

interface Pet {
    public void test();
}

class Dog implements Pet {

    public void test() {
        System.out.println("\n =====|Interface_Pet_1|========");
        System.out.println("Interface Method Implemented");
        System.out.println("Interface Method completed");
        System.out.println("\n ======|Interface_Pet_2|========");
    }

    public static void main(String args[]) {
        Pet p = new Dog();
        p.test();
    }
}