package streams;

import utils.Kisiler;
import utils.KisilerUtils;

import java.util.List;

public class Filter {

    public static void main (String[] args){
        List<Kisiler> kisiler= KisilerUtils.kisilerList();

        kisiler.stream().filter(p->p.getAd().startsWith("a")).forEach(System.out::println);

        kisiler.stream().filter(p->p.getCinsiyet().equalsIgnoreCase("Kadın")).forEach(System.out::println);
    }
}
