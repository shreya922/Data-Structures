class Solution {
    public String countAndSay(int n) {
        String s=count(n);
        return s;
    }
    public String count(int n)
    {
        int x=1;
        String s="";
        while(x<(n+1))
        {
       
        if(x==1)
        {
           s=s+"1";
            x++;
        }
          char[] temp=s.toCharArray();
           // s="";
            Boolean flag=false;
        if(x<=n)
        {
          
            int a=0;
            int count=1;
            //Boolean flag=true;
            s="";
            while(a<temp.length)
            {
                flag=true;
                count=1;
                while(a<=(temp.length-2)&&temp[a]==temp[a+1])
                {
                    a++;
                    count++;
                    //flag=false;
                }
               
                s=s+String.valueOf(count)+String.valueOf(temp[a]);
                a++;
            }
            x++;
            flag=false;
        }
        }
        
         return s;
    }
}
