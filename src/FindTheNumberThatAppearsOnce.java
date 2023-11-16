public class FindTheNumberThatAppearsOnce {
    public static int getSingleElement(int [] arr){
        int n = arr.length;
        int xorr = 0;

        for(int i = 0 ; i < n ; i++ ){
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String[] args) {
        int [] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println(ans);
    }
}
