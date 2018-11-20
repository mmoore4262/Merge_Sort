public class Merge {

    private int[] arr;
    //also known as from
    private int left;
    //also known as to
    private int right;

    public static void mergeSort(int[] arr)
    {
        int n= arr.length;
        int[] temp= new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }
    /**public static void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if (left<right)
        {
            int middleElement= (left+right)/2;
            for (int i=0; i<temp.length; i++)
            {
                System.out.print(arr[i]);
            }
            System.out.println("");
            mergeSortHelper(arr,left,middleElement,temp);

            for (int i=0; i<temp.length; i++)
            {
                System.out.print(arr[i]);
            }
            System.out.println("");
            mergeSortHelper(arr,middleElement+1,right,temp);

            //merge(arr,left,middleElement,right,temp);
        }
    }**/
    public static void merge(int[] arr, int left, int middleOfArr, int right, int[] temp)
    {
        int j=0;
        for (int i=0; i<middleOfArr; i++)
        {
            if (arr[left+i]>arr[right+i])
            {
                //Should the index of temp be a variable
                temp[j]=arr[right+i];
                if (arr[])
            }
        }

    }
    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if (left<right)
        {
            int middleOfArr= (left+right)/2;
            mergeSortHelper(arr,left,middleOfArr,temp);
            mergeSortHelper(arr,middleOfArr+1,right,temp);
            //merge(arr,left,middleOfArr,right,temp);
        }
    }
}
