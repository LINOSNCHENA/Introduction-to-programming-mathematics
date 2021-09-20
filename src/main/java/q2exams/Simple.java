package q2exams;

public class Simple {

    public static void main(String[] args) {
        cleanPemba.clearScreen();
        System.out.println("\n A xxxxxxxxxxxxxxxxx (1) or (-1) xxxxxxxxxxxxxxxxxxxx A \n");
        int x = Solution1.solution();
        System.out.println(x);
        System.out.println("\n B xxxxxxxxxxxxxxxxx Some2-Number xxxxxxxxxxxxxxxxxxxx B \n");
        int[] A = { 1, 1, 1, 1, 4 };
        int[] x1 = Solution2.solution(A);
        System.out.println(x1);
        System.out.println("\n C xxxxxxxxxxxxxxxxx END xxxxxxxxxxxxxxxxxxxxxxxxxx C \n");
    }
}
