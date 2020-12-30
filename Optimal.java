/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ammar;

/**
 *
 * @author DELL
 */
public class Optimal {
    
     private int []pages;
    //Pages Faults 
    private int pageFaults;
    //Number that will point on the array of frame
    private int no;
    //Array of frames will contain the page faults
    private int []frames;
    private int Hit=0;
    private boolean isFull=false;
    
    
     public void SetPages(int []p){
       this.pages = p;
    }
     public void SetFrames(int []f){
       this.frames = f;
       
    }
     
      public void Page_Falults(int frameSize, int pageSize){
         //Initialaize frame Array with -1
         for(int x=0;x<frameSize;x++){
           frames[x] = -1;  
         }
         
         
         for(int i = 0; i < pages.length; i++)
        {
         int search = -1;
         for(int j = 0; j < frames.length; j++)
         {
          if(frames[j] == pages[i])
          {
           search = j;
           Hit++;
           break;
          } 
         }
         if(search == -1)
         {
          if(isFull)
          {
           int index[] = new int[frames.length];
           boolean index_flag[] = new boolean[frames.length];
           for(int j = i + 1; j < pages.length; j++)
           {
            for(int k = 0; k < frames.length; k++)
            {
             if((pages[j] == frames[k]) && (index_flag[k] == false))
             {
              index[k] = j;
              index_flag[k] = true;
              break;
             }
            }
           }
           int max = index[0];
           no = 0;
           if(max == 0)
            max = 200;
           for(int j = 0; j < frames.length; j++)
           {
            if(index[j] == 0)
             index[j] = 200;
            if(index[j] > max)
            {
             max = index[j];
             no = j;
            }
           }
          }
          frames[no] = pages[i];
          
          pageFaults++;
          if(!isFull)
          {
           no++;
              if(no == frames.length)
              {
               no = 0;
               isFull = true;
              }
          }
         }
            for(int j = 0; j < frames.length; j++)
                System.out.println("\n" + frames[j]);
        }
        
       
        System.out.println("The number of Hits: " + Hit);
        System.out.println("Hit Ratio: " + (float)((float)Hit/pages.length));
        System.out.println("The number of Faults: " + pageFaults);
      }
}