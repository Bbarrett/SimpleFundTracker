package elements;

import java.io.IOException;
import java.util.TimerTask;


public class Task extends TimerTask {
   
    private final URLScanner URLSC;

    public Task() throws IOException {
        URLSC = new URLScanner();
        URLSC.setURL();
    }

    // Make it simple, create a task that can be set to run each day at noon.
    @Override
    public void run() {
       
        
          
        
    
        }
    }




