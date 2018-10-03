public class Main {
    public static void main (String [] args){
        int b;
        double result = 0;
        double n = 0;

        for (int a = 158; a > 1;){
            b = a % 2;
            result = result + b * Math.pow(10.0, n);
            a = (a - b)/2;
        }
        System.out.println(result);
        System.out.println("////");
    }
}
