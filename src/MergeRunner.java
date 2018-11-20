public class MergeRunner {
    public static void main(String[] args)
    {
        int arr[]=new int[                                    6];
        for (int i=0; i<arr.length; i++)
        {
            arr[i]=(int)(Math.random()*10);
            System.out.print(arr[i]);
        }
        System.out.println("");
        Merge.mergeSort(arr);
    }
}
