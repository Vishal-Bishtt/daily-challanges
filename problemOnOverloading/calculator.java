package problemOnOverloading;

public class calculator {
    public  int sum(int a, int b){
        return a+=b;
    }
    public int sum(int a , int b , int c){
        b+=c;
        return a+=b;
    }
    public double sum(double a, double b){
        return a+=b;
    }
}
