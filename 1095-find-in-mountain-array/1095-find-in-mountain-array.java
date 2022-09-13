/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int left=0,right=arr.length()-1;
        int peek=getPeak(arr,target);
        System.out.println("Peek is - "+peek);
        if(arr.get(peek)==target){
            return peek;
        }
        int index=doBinary(arr,target,0,peek);
        System.out.println("Start Index is - "+index);
        if(index!=-1){
            return index;
        }
        return doBinary(arr,target,peek+1,arr.length()-1);
        
    }
    public int getPeak(MountainArray arr,int target){
        int left=0,right=arr.length()-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr.get(mid)<arr.get(mid+1)){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
    public int doBinary(MountainArray arr,int target,int left,int right){
        boolean isIncreasing=arr.get(left)<arr.get(right);
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            if(isIncreasing){
                if(target<arr.get(mid)){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                 if(target>arr.get(mid)){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            
        }
        return -1;
    }
}