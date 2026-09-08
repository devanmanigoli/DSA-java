public class ReverseArray2 {
    public static void reverse(int i,int j,int arr[]){
        if(i>=j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
   
         reverse(i+1,j-1,arr);
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};

        reverse(0,arr.length-1,arr);
        
        for(int x=0;x <arr.length;x++){
        System.out.print(arr[x]+" ");
        }
    }
}
