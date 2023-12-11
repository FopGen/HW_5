package org.example;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(iterrate(n));
        System.out.println(recursive(n));
        System.out.println(dynamic(n));
    }



    //складність часова О(n), просторова O(1)
    private static int iterrate(int n) {
        int x1 = 0;
        int x2 = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = x1 + x2;
            x1 = x2;
            x2 = result;
        }
        return result;
    }



    //складність часова О(2^n), просторова О(n)
    private static int recursive(int n) {
        if (n<=1){
            return n;
        }
        return recursive(n-2)+recursive(n-1);
    }



    //складність часова О(n), просторова O(1)
    public static int dynamic(int n){

        int[] prevSolutions = new int[n];
        if (n == 1 || n == 2)
        {
            return 1;
        }
        prevSolutions[0] = 1;
        prevSolutions[1] = 1;
        for (int i = 2; i < prevSolutions.length; i++)
        {
            prevSolutions[i] = prevSolutions[i-1] + prevSolutions[i-2];
        }
        return prevSolutions[n-1];
    }

}


