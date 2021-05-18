class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==null)
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])>(arr.length/2))
                return arr[i];
        }
        return -1;
    }
}
