import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
  
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
}
rearranging(list, n);
  for(int index=0;index< n ;index++)
  {
    System.out.print(list[index] +" ");
  }
 
  
}

public static void rearranging(int list[], int n)
{
  int neg[]=new int[n];
  int neg_size=0;
  int pos[]=new int[n];
  int pos_size=0;
  for(int index = 0; index < n; index++)
{
if(list[index]>0){
  pos[pos_size]=list[index];
      pos_size++;
 
}
    else if(list[index]==0){
       neg[neg_size]=list[index];
  neg_size++;
     
    }
    
}
  int arr_index=0;
  for(int index = 0; index < pos_size; index++)
  {
    list[arr_index]=pos[index];
    arr_index++;
    
  }
  for(int index = 0; index < neg_size; index++)
  {
    list[arr_index]=neg[index];
    arr_index++;
  }
}  
}