        {
            l1=new ArrayList<Integer>();
            String temp=list.get(i);
            System.out.print(temp);
            for(int j=0;j<temp.length();j++)
            {
                int num=0;
                Boolean flag=false;
                while(j<temp.length()&&temp.charAt(j)!=' ')
                {
                    if(temp.charAt(j)=='-')
                    {
                        flag=true;
                        j++;
                    }
                  num=num*10+ temp.charAt(j)-48;
                    j++;
                }
                if(flag==true)
               l1.add(-num);
                else
                 l1.add(num);   
                flag=false;
            }
            l2.add(l1);
        }
        return l2;
    }
     public List<String> paths(TreeNode root,List<String> list,String s,int targetSum,int sum)
    {
        if(root.left!=null||root.right!=null)
        {
            s=s+root.val+" ";
            sum=sum+root.val;
            if(root.left!=null)
            paths(root.left,list,s,targetSum,sum);
            if(root.right!=null)
              paths(root.right,list,s,targetSum,sum);
        }
        if(root.left==null&&root.right==null)
        {
