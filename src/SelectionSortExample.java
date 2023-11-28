public class SelectionSortExample {

    void selectionSort( int [] a){
        int n = a.length;
        for(int i =0 ; i <= n - 2 ; i++){
            int min = i;
            for(int j = i ; j <= n -1 ; j++){
                if(a[j] < a[min]){
                    min = j;
                }
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    void printArray(int [] a){
        int n = a.length;
        for (int i = 0 ; i< n ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSortExample object = new SelectionSortExample();
        int [] a = {13,46,24,20,53,9};
        object.selectionSort(a);
        System.out.println("Sorted Array");
        object.printArray(a);
    }
}
