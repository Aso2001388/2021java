//import java.lang.reflect.Field;
import java.util.Random;

public class Ship {
    
    static int[][] field ={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
    public static int HP=3;

    //船を配置するメソッド
    public static int[][] field(){
        
        int[] a ={0,1,2,3,4};
        int[] b ={0,1,2,3,4};
        //乱数を取得し、船を配置する

        Random ran1 =new Random();
        int X=a[ran1.nextInt(4)];
        Random ran2=new Random();
        int Y=b[ran2.nextInt(4)];
        field[X][Y]=1;
            
            return field;

        }        
        

       




    }

    

   
        

    
    


