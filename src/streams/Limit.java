package streams;

import utils.Kisiler;
import utils.KisilerUtils;

import java.util.List;

public class Limit {

    public static void main(String[] args) {

        List<Kisiler> kisiler= KisilerUtils.kisilerList();
        kisiler.stream().filter(p->p.getCinsiyet().equalsIgnoreCase("Erkek")).limit(2).forEach(System.out::println);
    }
}