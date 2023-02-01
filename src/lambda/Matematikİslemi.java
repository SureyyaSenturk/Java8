package lambda;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class Matematikİslemi {
    public static void main(String[] args){
        Matematikİslemi matematikİslemi=new Matematikİslemi();

        //Tip bildirimi ile
        IMatematikIslemi toplama=(int a,int b)-> a+b;
        //Tip bildirimi olmadan
        IMatematikIslemi cikarma=(a,b)-> a-b;
        //return ederek sonuç bulma
        IMatematikIslemi carpma=(int a,int b)->{
            return a*b;
        };

        IMatematikIslemi bolme=(int a,int b)->a/b;

        System.out.println("10 + 5 = " + matematikİslemi.islem(10, 5, toplama));
        System.out.println("10 - 5 = " + matematikİslemi.islem(10, 5, cikarma));
        System.out.println("10 x 5 = " + matematikİslemi.islem(10, 5, carpma));
        System.out.println("10 / 5 = " + matematikİslemi.islem(10, 5, bolme));


        IKarsilamaService karsilamaService=(mesaj -> System.out.println("Merhaba"+ mesaj));
        karsilamaService.Mesaj("Süreyya");


    }

    interface IMatematikIslemi{
        int islem(int a, int b);
    }

    interface IKarsilamaService{
        void Mesaj(String mesaj);
    }
    private int islem(int a,int b,IMatematikIslemi matematikIslemi){
        return matematikIslemi.islem(a,b);
    }
}
