package q2exams;

class Solution1 {
    static int solution() {
        int[] A = { 1, 1, 1, 1, 50 };//1
        int n = A.length;//2
        int[] L = new int[n + 1]; //3

        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }
        System.out.println("===============================");
        System.out.println(n-1);
        System.out.println(A[n-1]);
        System.out.println(L[n-1]);
        System.out.println("=======================1========");

        int count = 0;
        int pos = (n + 1) / 2;
        int candidate = L[pos];
        System.out.println(pos);
        System.out.println(candidate);
        System.out.println("=======================2========");
        for (int i = 1; i <= n; i++) {
            if (L[i] == candidate)
                count = count + 1;
        }
        if (count > pos)
            if (2 * count > n)
                return candidate;
        return (-1);
    }
}