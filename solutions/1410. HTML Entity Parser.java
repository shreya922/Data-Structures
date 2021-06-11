class Solution {
    public String entityParser(String s) {
        String s1=new String(s);
     if(s.contains("&quot;"))
          s1=s1.replaceAll("&quot;","\"");
      if(s.contains("&apos;"))
          s1=s1.replaceAll("&apos;","'");   
      if(s.contains("&amp;"))
          s1=s1.replaceAll("&amp;","&");
      if(s.contains("&gt;"))
          s1=s1.replaceAll("&gt;",">");
      if(s.contains("&lt;"))
          s1=s1.replaceAll("&lt;","<");
      if(s.contains("&frasl;"))
          s1=s1.replaceAll("&frasl;","/");
                         return s1;
    }
}
