
package page.replacement;

import java.util.Scanner;

public class PageReplacement {

 
    public static void main(String[] args) {
         int frameNumber,pageNumber,page[],frame[];
         
         System.out.println("Enter 1 : For FIFO");
         System.out.println("Enter 2 : For LRU");
         System.out.println("Enter 3 : For Optimal");
         
         System.out.print("Choice : ");
         Scanner in=new Scanner(System.in);
          short choice = in.nextShort();
         
          if(choice == 1){
            FIFO xz=new FIFO();
            System.out.print("Enter number of Frames: ");
            frameNumber=in.nextInt();
            System.out.println("********************************************");
            frame=new int[frameNumber];
        
            System.out.print("Enter number of Pages: ");
            pageNumber=in.nextInt();
            System.out.println("********************************************");
            System.out.print("Enter Pages : ");
            page=new int[pageNumber];  
            for(int i=0;i<pageNumber;i++){
              page[i]=in.nextInt();
        }
            System.out.println("********************************************");
            System.out.println("***********");
            xz.SetPages(page);
            xz.SetFrames(frame);
            System.out.println("Number Of Pages U Entered :" +page.length);
            System.out.println("Number Of Frames U Entered :" +frame.length);
            System.out.print("Pages U Entered : ");
            for(int y=0;y<page.length;y++)
               System.out.print(page[y] + "  ");
               System.out.println();
               xz.Page_Falults(frameNumber, pageNumber);
        }
          else if (choice == 2){
            LRU xz=new LRU();
            System.out.print("Enter number of Frames: ");
            frameNumber=in.nextInt();
            System.out.println("********************************************");
            frame=new int[frameNumber];
        
            System.out.print("Enter number of Pages: ");
            pageNumber=in.nextInt();
            System.out.println("********************************************");
            System.out.print("Enter Pages : ");
            page=new int[pageNumber];  
            for(int i=0;i<pageNumber;i++){
              page[i]=in.nextInt();
        }
            System.out.println("***********");
            xz.SetPages(page);
            xz.SetFrames(frame);
            System.out.println("Number Of Pages U Entered :" +page.length);
            System.out.println("Number Of Frames U Entered :" +frame.length);
            System.out.print("Pages U Entered : ");
            for(int y=0;y<page.length;y++)
               System.out.print(page[y] + "  ");
               System.out.println();
               xz.Page_Falults(frameNumber, pageNumber);
          }
          else if (choice == 3){
                Optimal xz=new Optimal();
            System.out.print("Enter number of Frames: ");
            frameNumber=in.nextInt();
            System.out.println("********************************************");
            frame=new int[frameNumber];
        
            System.out.print("Enter number of Pages: ");
            pageNumber=in.nextInt();
            System.out.println("********************************************");
            System.out.print("Enter Pages : ");
            page=new int[pageNumber];  
            for(int i=0;i<pageNumber;i++){
              page[i]=in.nextInt();
        }
            System.out.println("***********");
            xz.SetPages(page);
            xz.SetFrames(frame);
            System.out.println("Number Of Pages U Entered :" +page.length);
            System.out.println("Number Of Frames U Entered :" +frame.length);
            System.out.print("Pages U Entered : ");
            for(int y=0;y<page.length;y++)
               System.out.print(page[y] + "  ");
               System.out.println();
               xz.Page_Falults(frameNumber, pageNumber);
          
          }
          else{
              System.err.println("ERROR DATA IS NOT VAILID ENTER NUMBER FROM THE LIST");
          }
        }
    
}
