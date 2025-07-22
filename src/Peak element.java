class Solution {

    public int peakElement(int[] arr) {
        // code here
        if(arr.length == 1)
        return 0;
        int temp = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > temp && arr[i] > arr[i+1])
            return i;
            
            temp = arr[i];
        }
        if(arr[arr.length - 1] > arr[arr.length - 2])
        return arr.length-1;
        else
        return -1;
    }
}
