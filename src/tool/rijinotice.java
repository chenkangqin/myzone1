package tool;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class rijinotice extends Thread{
	private static rijinotice instance=null;
	private rijinotice(String nameString){
		super(nameString);
	}
	public static synchronized rijinotice getInstance(String nameString){   
        if(instance==null){   
            instance=new rijinotice(nameString);   
        }   
        return instance;   
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(this.getName());
			try {
				
				sleep(20000);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
