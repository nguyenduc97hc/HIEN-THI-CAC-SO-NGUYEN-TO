import java.util.Scanner;
public class HienThiCacSoNguyenTo {
    public static void main(String[] args) {
        int cout = 0;
        int num = 20;
            for(int i = 1;;i++){
                if(cout == num){
                    break;
                }
                if(ktsonguyento(i)){
                    System.out.println(i);
                    cout++;
                }
            }

    }
    public static boolean ktsonguyento(int number){
        if(number<2){
            return false;
        }
        else{
            if(number == 2){
                return true;
            }
            else{
                for(int i = 2;i*i<=number;i++){
                    if(number%i==0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
