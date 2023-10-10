import Maths.Factorial;

class Main{

     public static void main(String[] args){
        Factorial factorialCalculator = new Factorial();
        long result = factorialCalculator.factorial(5);
        System.out.println(result);
    }
}