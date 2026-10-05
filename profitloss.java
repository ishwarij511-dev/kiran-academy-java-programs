package programs;

public class profitloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int cp=500;
        int sp=600;
        
        if(sp>cp)
        {
        	int profit=sp-cp;
        	System.out.println("profit=");
        }
        else if(cp>sp)
        {
        	int loss=cp-sp;
        	System.out.println("loss=");
        }
        else
        {
        	System.out.println("no profit,noloss");
        	
        }	
	}

}
