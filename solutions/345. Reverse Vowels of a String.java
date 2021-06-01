class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||
              s.charAt(i)=='e'||
              s.charAt(i)=='i'||
              s.charAt(i)=='o'||
              s.charAt(i)=='u'||
               s.charAt(i)=='A'||
              s.charAt(i)=='E'||
              s.charAt(i)=='I'||
              s.charAt(i)=='O'||
              s.charAt(i)=='U'
              )
                st.push(s.charAt(i));
        }
        int k=0;
       for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||
              s.charAt(i)=='e'||
              s.charAt(i)=='i'||
              s.charAt(i)=='o'||
              s.charAt(i)=='u'||
               s.charAt(i)=='A'||
              s.charAt(i)=='E'||
              s.charAt(i)=='I'||
              s.charAt(i)=='O'||
              s.charAt(i)=='U'
              )
                ch[i]=st.pop();
        }
        s=new String(ch);
        return s;
    }
}
