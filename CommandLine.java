class test
{
  public static void main(String args[])
  {
	int sum=0,x;
   	if(args.length>0)
  	{
    		for(int i=0;i<args.length;i++)
		{	
			x=Integer.parseInt(args[i]);
   			sum=sum+x;
		}
	}
	System.out.println(sum);
  }
}