
package page.replacement;

public class LRU{
     //Array of pages entered from user
    private int []pages;
    //Pages Faults 
    private int pageFaults;
    //Number that will point on the array of frame
   boolean flg1, flg2;
    //Array of frames will contain the page faults
    private int []frames;
    
    private int pageHits;
    
    private int []fs;
    
    private int index;
    public LRU(){
    }

    public void SetPages(int []p){
       this.pages = p;
    }
    public void SetFrames(int []f){
       this.frames = f;
       fs = new int [f.length];
       //Initialaize frame Array with -1
         for(int x=0;x<f.length;x++){
           frames[x] = -1;  
         }
    }
    
    
    public void Page_Falults(int frameSize, int pageSize){
     //Loop on pages entered from user
    for(int lp=0;lp< pageSize;lp++){
        //Initialaized two flags with false
        flg1=false; 
        flg2=false;
        //Loop on frameSize
      for(int f=0;f<frameSize;f++){
          //Check if number in the frame = number in the page
        if(frames[f] == pages[lp]){
            //make the two flags true so, the number is already exist in the frame
            System.out.print("Page Hit : ");
            pageHits++;
           flg1=true;
           flg2=true;
           break;
       }
     }
      //Check if flag1 is false this means that there are -1 values on the frame array
      if(flg1==false){
  for(int lf=0;lf<frameSize;lf++){
    if(frames[lf]==-1){
        System.out.print("Page Faults : ");
      frames[lf]=pages[lp];
      pageFaults++;
      //Make the flag2 with true So we make a push in the array
       flg2=true;
       break;
     }
   }
}

//Check if flag2 is false This means that The page is not in the frame array 
if(flg2==false){
    
  for(int lf=0;lf<frameSize;lf++)
    fs[lf]=0;
     for(int k=lp-1,t=1;t<=frameSize-1;t++,k--){
        for(int lf=0;lf<frameSize;lf++){
          if(frames[lf]==pages[k])
              //Put 1 in the fs it means that the the number will not swap
            fs[lf]= 1;
       }
}
for(int lf=0;lf<frameSize;lf++){
   if(fs[lf]== 0)
       //got the index will take the number and put it into frame 
    index=lf;
  }
  System.out.print("Page Faults : ");
  //make the page faults
  frames[index]=pages[lp];
  pageFaults++;
 }
    Display();
 }
    System.out.println("Number Of Page Faults :"+pageFaults);
    System.out.println("Number Of Page Hits :"+pageHits);
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