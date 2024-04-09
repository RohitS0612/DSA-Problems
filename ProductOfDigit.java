/**
 * ProductOfDigit
 */
public class ProductOfDigit {

    public static void main(String[] args) {
        
        System.out.println(pro(55));

    }

    static  int pro(int n) {
        if(n%10 == 0) {
            return n;

        }
        return (n%10) * pro( n / 10);
    }
}