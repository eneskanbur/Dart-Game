



import java.util.Scanner;

/**
 *
 * @author Enes
 */
public class Dart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**********");
        System.out.println("Dart Game!");
        System.out.println("**********");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of darts to be thrown:");
        int darts = scanner.nextInt();
        double count = 1;
        double addition = 0;
        int x=0;
        int y=0;
        int a =0;
        int b =0;
        int c =0;
        int d =0;
        int e =0;
        int f =0;
        int u =0;
        String region="";
        
        //int y = ((int)((Math.random()*(2)-1)*10));(if there is a problem with random number generation to fix it )
        
        while(count<=darts){
             x = ((int)((Math.random()*(2)-1)*10));
             y = ((int)((Math.random()*(2)-1)*10));
            addition = (((double)(x+y))/10);
            
        //System.out.print("Plus:" + ((double)(x+y))/10);(to see if there is a problem with collecting)
            
            if(x>0 && y>0 && addition==1.0 ){
               region = "Undiceded";
               u++;
            }else if(x>0 && y>0 && addition<1){
                region = "A";
                a++;
            }else if(x>0 && y>0 && addition>1){
                region = "B";
                b++;
            }else if(x<0 && y>0){
                region = "C";
                c++;
            }else if(x<0 && y<0 && x<y){
                region = "D";
                d++;
            }else if(x<0 && y<0 && x>y){
                region = "E";
                e++;
            }else if(x<0 && y<0 && x==y){
                region = "Undecided";
                u++;
            }else if(x>0 && y<0){
                region = "F";
                f++;
            }else if(x==0 || y==0){
                region = "Undecided";
                u++;
            }
            System.out.println("");
            System.out.println("Dart:" + (int)count); 
            System.out.println("Coordinates:" + "(" +(double)x/10 + ", " + (double)y/10 + ")");
            System.out.println("Region:" + region);
            
            //System.out.println("U:" + u);(to see if the values are counted correctly)
            //System.out.println("A:" + a);
            //System.out.println("B:" + b);
            //System.out.println("C:" + c);
            //System.out.println("D:" + d);
            //System.out.println("E:" + e);
            //System.out.println("F:" + f);
            
            region ="";
            count++;
            
        }
            count--;
            
            int percentageA =(int)(((100.0*a)/count)*100.0);
            int percentageB =(int)(((100.0*b)/count)*100.0);
            int percentageC =(int)(((100.0*c)/count)*100.0);
            int percentageD =(int)(((100.0*d)/count)*100.0);
            int percentageE =(int)(((100.0*e)/count)*100.0);
            int percentageF =(int)(((100.0*f)/count)*100.0);
            int percentageU =(int)(((100.0*u)/count)*100.0);
            
            System.out.println(" ");
            System.out.println("Region Statics:");
            System.out.println("A:" + " " + a + " " + "dart" + "(" + (double)percentageA/100 + "%" + ")");
            System.out.println("B:" + " " + b + " " + "dart" + "(" + (double)percentageB/100 + "%" + ")");
            System.out.println("C:" + " " + c + " " + "dart" + "(" + (double)percentageC/100 + "%" + ")");
            System.out.println("D:" + " " + d + " " + "dart" + "(" + (double)percentageD/100 + "%" + ")");
            System.out.println("E:" + " " + e + " " + "dart" + "(" + (double)percentageE/100 + "%" + ")");
            System.out.println("F:" + " " + f + " " + "dart" + "(" + (double)percentageF/100 + "%" + ")");
            System.out.println("Undecided:" + " " + u + " " + "dart" + "(" + (double)percentageU/100 + "%" + ")");

        }
    
    }
  

