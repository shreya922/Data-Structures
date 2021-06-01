class Solution {
    public boolean isValid(String s) {
        StringBuffer sb=new StringBuffer(s);
        while(sb.length()!=0)
        {
            int a=sb.indexOf("abc");
            System.out.print(a);
            if(a!=-1)
            {
            sb=sb.deleteCharAt(a);
             sb=sb.deleteCharAt(a);
             sb=sb.deleteCharAt(a);
            }
            if(a==-1)
                break;
        }
        if(sb.length()==0)
            return true;
        return false;
    }
}
