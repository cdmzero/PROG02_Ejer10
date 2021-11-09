
package prog02_ejer10;

/**
 *
 * @author zero
 */
public class PROG02_Ejer10 {

    public static void main(String[] args) {
              
        float x     = 4.5F;
        float y     = 3.0F;
        int   i     = 2;
        int   j     = (int) (i * x); // conversion i y x float -> int      
        double dx   = 2.0;
        double dz   = dx * y;
        
//Byte
        byte   bx   = 5;
        byte   by   = 2;
        byte   bz   = (byte) (bx - by);  
//Short              
        short  sx   = 5;
        short  sy   = 2;
                
               
//Char
        char   cx   = '\u000F';
        char   cy   = '\u0001';
        int     z   = cx - cy;
     
    
      
   String convesrionIntFloat = " \n ------- Conversiones entre enteros y coma flotante ------- \n"
                    + "Producto de int por float:+ j = i * x = " + j +"\n"
                    + "Producto de float por double: dz=dx * y = " + dz + "\n";
     
   System.out.print(convesrionIntFloat);
                    
   
    String OpsByte1 = "\n------- Operaciones con byte -------\n" 
                    + "byte: 5 - 2 = "+ bz +"\n";
    
    
    // Referenciamos la variables para conseguir el resultado
    
               bx   = (int) -128;
               by   = (int) 1;
               bz   = (byte) (bx - by);
               
       
               
    
   // Referenciamos la variables para conseguir el resultado
           
    String OpsByte2 = "byte -128 - 1 = " + bz + "\n";
    
    
   // No conseguimos la conversion deseada revisar las particularidad de la conversion del tipo byte(https://aulasfp2122.
   // castillalamancha.es/mod/forum/discuss.php?d=2820)   
               bz   = (byte) (int) (bx - by);
               
           int za   = bx - by;
               
    String OpsByte3 = "(int)(-128 - 1) = " + za + "\n";

    System.out.print(OpsByte1 + OpsByte2 + OpsByte3);
    
           
               short sz = (short) (sx - sy);
              
    
 String OpsShort1 = " \n ------- Operaciones con short -------\n"
        + " short: 10 - 1 = " + sz + "\n";
  
               sx   = -32767;    
               sy   = 1;
               sz   = (short) (sx + sy);
               
 String OpsShort2 = "\n short: 32767 + 1 = " + sz + "\n";  
         

    
        System.out.print(OpsShort1 + OpsShort2);
        
        
 String OpsChar1 = "\n char: - = " + z + "\n"; 

                z   = cx - 1;
               
     
 String OpsChar2 = "\n char(0x000F) - 1 = " + z + "\n"; 
 
                cx  = '\uFFFF';
                z   = cx;
 
 String OpsChar3 = "\n (int)= " + z + "\n"; 

                
               sx   = (short) cx;
         
String OpsChar4 = "\n (short)= " + sx + "\n";

               sx   = (short) -32768;
               cx   = (char)sx;
                z   = sx;
               
String OpsChar5 = "\n -32768 short-char-int = " + z + "\n";


                sx = -1;
                cx   = (char) sx;
                 z   = (int) cx;
                 
String OpsChar6 = "\n -1 short-char-int = " + z + "\n";

                     
               
                
   
 
 
 
        System.out.print("\n ------- Operaciones con char -------" + OpsChar1 + OpsChar2 + OpsChar3 + OpsChar4 + OpsChar5 + OpsChar6);
        

    
    }
 
    
}
