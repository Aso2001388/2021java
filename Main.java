import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("***************");
        System.out.println("戦艦ゲーム");
        System.out.println("***************");

        int[][] field ={{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        int X=inX();
        int Y=inY();
        //船を三隻配置する。
        Ship ship1=new Ship();
        field=ship1.ran(field);
        
        Ship ship2=new Ship();
        field=ship2.ran(field);

        Ship ship3=new Ship();
        field=ship3.ran(field);

        

     }
        //爆弾を落とす。

    


    //X座標の入力値をもらう
    public static int inX(){
        System.out.println("爆弾のX座標を入力してください");
        Scanner sc= new Scanner(System.in);
        int X=sc.nextInt();
        return X;

    }


    //Y座標の入力値をもらう
    public static int inY(){
        System.out.println("爆弾のY座標を入力してください");
        Scanner sc= new Scanner(System.in);
        int Y=sc.nextInt();
        return Y;

    }


}

   
