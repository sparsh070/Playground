import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
        // Get the searching element 1
        int search_elem_1 = in.nextInt();
        // Get the search element 2
        int search_elem_2 = in.nextInt();
      
      int ele1=-1;
      int ele2=-1;
      for(int i=0;i<=arr.length-1;i++)
      {
        if(search_elem_1==arr[i])
        {
          ele1=i;
        }
        else if(search_elem_2==arr[i])
        {
        ele2=i;
        }
      }
      System.out.println(ele1);
      System.out.println(ele2);
    }
}