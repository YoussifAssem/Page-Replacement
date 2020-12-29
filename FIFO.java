
package page.replacement;

public class FIFO {
    //Array of pages entered from user
    private int []pages;
    //Pages Faults 
    private int pageFaults;
    //Number that will point on the array of frame
    private int nu;
    //Array of frames will contain the page faults
    private int []frames;
    
    private int pageHit;
    
    
    public FIFO(){
    }

    public void SetPages(int []p){
       this.pages = p;
    }
    public void SetFrames(int []f){
       this.frames = f;
    
         for(int x=0;x<frames.length;x++){
            frames[x] = -1;  
         }
    
    }
    
    
    public void Page_Falults(int frameSize, int pageSize){
        //To check of page in the frame or not 
        boolean flag = true;
         //Initialaize frame Array with -1
       
         //Loop from 0 to Number Of Pages Entered in the Array
        for(int z=0;z<pageSize;z++){
         //Set that the pages is not in the frame   
           flag = true;
           //loop from 0 to frame size
          for(int n=0;n<frameSize;n++){
              //check if the number in the index of the frame = the number in the index of page 
             if(frames[n] == pages[z]){
                 //if this exist set the flag with false and break from the internal loop
                  System.out.println("Page Hit : ");
                 pageHit++;
                 flag = false;
                 break;
             }  
          }
          //Check if the number is equal the frameSize if it exists will set the number with 0   
           if(nu == frameSize)
               nu = 0;
           //Check if the flag is true that means frame is not contain the page
           if(flag){
               System.out.print("Page Faults : ");
               //Set the page number into frame number
               frames[nu] = pages[z];
               //Increment the pointer no -> to the index will work with in the next time
               nu++;
               //Increment the page faults 
               pageFaults++;
           }
           //Print the Page Faults
        Display();
       }
        System.out.println("Number of Page Hits : " +pageHit);
        System.out.println("Number of Page Faults : " +pageFaults);
    }
    private void Display(){
         System.out.println();
    for(int z=0;z<frames.length;z++){
       if(frames[z]==-1)
          System.out.println("            | " + "-1" + " |");
     else
       System.out.println("            | " + frames[z] + " |");
   }
    }
}