public class GCDOrHCF {

    public static int gcd(int n, int m){
        if(m == 0){
            return n;
        }
        return gcd(m,n % m);
    }

    public static void main(String[] args) {
        int n = 2, m = 6;
        int ans = gcd(n,m);
        System.out.print(ans);
    }
}
