class Solution {
    public int calculate(String s) {
     Stack<Character> st=new Stack<Character>();
        Boolean flag=false;
        s="("+s+")";
        s=s.replaceAll(" ","");
        int num=0;
        int i=0;
             String[] tokens=new String[200000];
        int k=0;   
​
        while(i<s.length())
        {
          
           if(Character.isLetterOrDigit(s.charAt(i)))
           {
               num=0;
               
               while(i!=s.length()&&Character.isLetterOrDigit(s.charAt(i)))
               {
                  
                   num=(num*10)+(int)(s.charAt(i)-48);
                    i++;
                   //System.out.println(num);
