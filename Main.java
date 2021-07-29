import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("***************");
        System.out.println("戦艦ゲーム");
        System.out.println("***************");


        int X=inX();
        int Y=inY();

        int[][] field1=Ship.field();

        System.out.println(field1);
    

    }


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
