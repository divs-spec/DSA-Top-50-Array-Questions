/*class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        Arrays.sort(arr);
    }
}
*/
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int newarr[]=new int[arr.length];
        int count0=0;
        int count1=0;
        int count2=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            } else if( arr[i]==1){
                count1++;
            } else if( arr[i]==2){
                count2++;
            }
        }
        
        for(int i=0;i<count0;i++){
            newarr[i]=0;
        }
        for(int j=count0; j<count0+count1;j++){
            newarr[j]=1;
        }
        for(int k=count0+count1 ; k< count0+count1+count2;k++){
            newarr[k]=2;
        }
        
        for(int i=0;i<newarr.length;i++){
            arr[i]=newarr[i];
        }
    }
}
