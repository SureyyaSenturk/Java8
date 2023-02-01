package optional;

import utils.Kisiler;
import utils.KisilerUtils;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalInterface {
    public static void main(String[] args) {
        List<Kisiler> kisiler= KisilerUtils.kisilerList();

        Optional<Kisiler>kisilerOptional=Optional.of(kisiler.get(0));
        kisilerOptional.ifPresent(System.out::println);

        try{
            kisilerOptional=Optional.of(null);
        }catch (NullPointerException e){
            System.err.println("Kişi Oluştururken Bir Hata Oluştu");
        }

        kisilerOptional=Optional.ofNullable(null);
        kisilerOptional.ifPresent(System.out::println);

        Kisiler kisi=kisilerOptional.orElse(new Kisiler("Süreyya","Şentürk","Kadın",24,new Date().getTime()+new Random().nextInt()));
        kisilerOptional=Optional.of(kisi);
        kisilerOptional.ifPresent(System.out::println);

    }

}
