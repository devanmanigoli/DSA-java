public class ReverseArray{
    public static void reverse(int i, int arr[],int n){
        if(i>=n/2){
            return;
        }
      int temp=arr[i];
      arr[i]=arr[n-i-1];
      arr[n-i-1]=temp;


      reverse(i+1,arr,n);
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};

        reverse(0,arr,arr.length);
         
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");

        }
    }

}