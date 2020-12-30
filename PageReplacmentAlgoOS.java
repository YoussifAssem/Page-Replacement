/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ammar;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PageReplacmentAlgoOS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
         Scanner in=new Scanner(System.in);
        int frameNumber,pageNumber,page[],frame[];
        FIFO xz=new FIFO();
        System.out.print("Enter number of Frames: ");
        frameNumber=in.nextInt();
        System.out.println("***************************** ");
        frame=new int[frameNumber];
        
        System.out.print("Enter number of Pages: ");
        pageNumber=in.nextInt();
        System.out.println("***************************** ");
        page=new int[pageNumber];  
        for(int i=0;i<pageNumber;i++)
        {
           page[i]=in.nextInt();
        }
        System.out.println("***************************** ");
       /* xz.SetPages(page);
        xz.SetFrames(frame);
        xz.Page_Falults(frameNumber, pageNumber);*/
        
       Optimal vv=new Optimal();
        vv.SetPages(page);
        vv.SetFrames(frame);
        vv.Page_Falults(frameNumber, pageNumber);
        
    }
    
}
