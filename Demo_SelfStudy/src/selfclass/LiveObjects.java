/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfclass;

public class LiveObjects {
    
    private static int LiveInstante =0;
    {
        LiveInstante ++;
    }
    
    public static int getLiveInstante(){
        return LiveInstante;
    }
    
    public void finalize(){
        LiveInstante --;
    }
}

class TestLiveObjects{
        
    public static void main(String args[]){
        
        
        LiveObjects live = new LiveObjects();
        new LiveObjects();
        new LiveObjects();
        new LiveObjects();
        
        /* The Nume of Live Objects is going to 1 afte System.gc(); */
        //System.gc();
        //Thread.sleep(Sleep);
        
        System.out.println("The Number of Live Object is :"+LiveObjects.getLiveInstante());
    }
}
