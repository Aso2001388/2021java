//import java.lang.reflect.Field;
import java.util.Random;

public class Ship {
    
    
    public static int HP=3;

    //船を配置するメソッド
    public  int[][] ran(int[][] field){
        
        int[] a ={0,1,2,3,4};
        int[] b ={0,1,2,3,4};
        //乱数を取得し、船を配置する

        Random ran1 =new Random();
        int X=a[ran1.nextInt(4)];
        Random ran2=new Random();
        int Y=b[ran2.nextInt(4)];
        if(field[X][Y]==0){
            field[X][Y]=1;
        }else{
            int x=a[ran1.nextInt(4)];
            int y=b[ran2.nextInt(4)];
            field[x][y]=1;
        }
            return field;
    }
        
        
        public String hantei()
    }

    

    

   
        

    
    


