class ReverseNumber {
    static int sum = 0;

    static void rev1(int n) {
        if(n == 0 ) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    public static void main(String[] args) {
        int num = 1234;
        rev1(num);   
        System.out.println(sum); 
    }
}
