class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> lis=new ArrayList<Integer>();
       StringBuilder sb=new StringBuilder();
        int i=num.length-1,carry=0;
        while(i>=0||k!=0)
        {
            int sum=carry;
            if(i>=0)
                sum=sum+num[i];
              if(k!=0)
                sum=sum+k%10;  
                  sb.append(sum%10);
            carry=sum/10;
            i--;
            k=k/10;
            
        }
        if(carry!=0)
            sb.append(carry);
        String nz= String.valueOf(sb.reverse());
        for( i=0;i<nz.length();i++)
            lis.add(Integer.parseInt(String.valueOf(nz.charAt(i))));
        return lis;
​
    }
}
