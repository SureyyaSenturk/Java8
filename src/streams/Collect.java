package streams;

import utils.Kisiler;
import utils.KisilerUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * author süreyya
 */
public class Collect {

    public static void main(String[] args){
        List<Kisiler> kisiler = KisilerUtils.kisilerList();

        List<Kisiler> sortedAndLimited=kisiler.stream().sorted((p1,p2)->p1.getDogumGunu().compareTo(p2.getDogumGunu())).limit(3)
                .collect(Collectors.toList());
        System.err.println("Sıralanmış ve Sınırlandırılmış Kişileri Yazdır:");
        sortedAndLimited.forEach(System.out::println);



        Map<String,List<Kisiler>> groupByCinsiyetList=kisiler.stream().collect(Collectors.groupingBy(Kisiler::getCinsiyet));
        System.err.println("Kişileri Cinsiyete Göre Gruplama");
        System.out.println(groupByCinsiyetList.toString());


        Map<String, Optional<Kisiler>> personByMaxAgeForEachGender=kisiler.stream()
                .collect(Collectors.groupingBy(Kisiler::getCinsiyet,Collectors.maxBy(Comparator.comparing(Kisiler::getCinsiyet))));
        System.err.println("Kişi nesnelerini Cinsiyete Göre Gruplama ve Maximum Yaşa Sahip Kişiyi Listele");
        System.out.println(personByMaxAgeForEachGender.toString());
    }
}
