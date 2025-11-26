//4817 - Прямокутник

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            while (in.hasNextInt()) {
            int x = in.nextInt();
            int y = in.nextInt();
            int P = 2 * (x + y);
            int S = x * y;

            System.out.print(P);
            System.out.print(" ");
            System.out.println(S);
        }
    }
}


//8520 - Умовний оператор - 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // example below, replace it with your solution
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y;
        if(x<5){
            y=x*x-3*x+4;
        }
        else{
            y=x+7;
        }
        System.out.print(y);
    }
}


//8954 - Вивести масив 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
        
        scanner.close();
    }
}
