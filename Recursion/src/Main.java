public class Main {
    //print numbers from 5 to 1
    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }

    //print numbers from 1 to 5
    public static void printNumb(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }

    //Calculate sum of n numbers
    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
    }

    // Calculate Factorial
    public static int calcFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1 = calcFactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

        //return n*printFactorial(n-1);   // this way also correct
    }

    public static void printFibonacci(int a, int b, int n){
        if(n == 0){    // n==0 means sum is calculated for n numbers.
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacci(b, c,n-1);   // here after one calculation b become a and c become b for next term calculation
    }

    // Calculate x^n (stack height = n)
    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;       // Base case 1
        }
        if(x == 0){
            return 0;       // Base case 2
        }
        int xPownm1 = calcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {

        int m = 5;
        printNumber(m);  //n=5

        int p = 1;
        printNumb(p);  //p=1

        printSum(1,5,0);

        System.out.println(calcFactorial(5));

        // Fibonacci
        int a=0, b=1;
        int n=7;
        printFibonacci(a, b, n-2);  // here n-2 because first two terms are already given a and b

        int x = 2;
        int k = 5;
        System.out.println(calcPower(x, k));
    }
}