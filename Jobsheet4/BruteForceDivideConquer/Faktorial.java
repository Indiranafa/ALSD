package Jobsheet4.BruteForceDivideConquer;
    public class Faktorial {
        public int nilai;

        // Metode untuk menghitung faktorial dengan pendekatan Brute Force
        int faktorialBF(int n){
            int fakto = 1;
            int i = 1;
            while (i <= n) {
                fakto *= i; // Perkalian fakto dengan nilai i
                i++;
            }
            return fakto; // Mengembalikan nilai faktorial
        }

    // Metode untuk menghitung faktorial dengan pendekatan Divide and Conquer
    int faktorialDC(int n){
        if(n == 1){
            return 1;
        }
        else{
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
    }

