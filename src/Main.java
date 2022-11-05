import java.util.Scanner;

public class Main {
    public static int Faktoriyel(int x){
        if (x==1||x==0){
            return 1;
        }else {
            int faktoriyel=x*Faktoriyel(x-1);
            return faktoriyel;
        }
    }

    public static void main(String[] args) {
        int num1,num2,combinsayon;
        Scanner scanner=new Scanner(System.in);
        System.out.println("C(x,y) x'i giriniz:");
        num1= scanner.nextInt();
        System.out.println("C(x,y) y'yi giriniz:");
        num2= scanner.nextInt();

        combinsayon=Faktoriyel(num1)/Faktoriyel(num2)*Faktoriyel(num1-num2);
        System.out.println("Combinsayonun sonucu:"+combinsayon);
    }
}