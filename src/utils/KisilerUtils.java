package utils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class KisilerUtils {
    public static List<Kisiler> kisilerList(){
        List<Kisiler> kisiler= Arrays.asList(

                new Kisiler("Süreyya","Şentürk","Kadın",24,new Date().getTime()+new Random().nextInt()),
                new Kisiler("Fatma","Çağlayan","Kadın",26,new Date().getTime()+new Random().nextInt()),
                new Kisiler("Ahmet","Töke","Erkek",27,new Date().getTime()+new Random().nextInt()),
                new Kisiler("Furkan","Beste","Erkek",32,new Date().getTime()+new Random().nextInt()),
                new Kisiler("İlkay","Hatun","Kadın",21,new Date().getTime()+new Random().nextInt())
        );
        return kisiler;
    }
}
