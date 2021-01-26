class Total{
   int sum;
   
   Total(){
   sum=0; 
   }
   
   void total(int n){
   sum+=n; 
   }
   
   int get(){
   return sum; 
   }
   }

class AThread extends Total implements Runnable{
	   Total t;
	   int a, b;
	   
	    AThread(Total t,int a, int b){
	       this.a=a;
	       this.b=b;
	       this.t=t;
	       
	    }

	    synchronized public void run() {
		   
		   try {
	       for(int i = a; i <= b; i++) {
	    	   
	    	   Thread.sleep(1000);
	          t.total(i);
	       System.out.println("a:"+a+"\tb:"+b+"\ti:"+i+"\tt.get():"+t.get());
	       }
	       System.out.println(t.get());
		   }catch(Exception e) {}
	   }
	   
	    
	}

public class Thread7_0126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Total t=new Total();
        AThread a=new AThread(t, 1, 50);//1~50 까지 총합
        AThread b=new AThread(t, 51, 100);//51~100 합 
        
        Thread a1 = new Thread(a);
        Thread b1 = new Thread(b);
        a1.start();
        b1.start();
                 
         
         try{
            a1.join();
            b1.join();
            ///throw 로 처리 가능. 
         }catch(Exception e) {}
         ////1275
         ////3775
         
			
	}

}
