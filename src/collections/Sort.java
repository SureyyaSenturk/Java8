package collections;

import utils.Kisiler;
import utils.KisilerUtils;

import java.util.*;

public class Sort {
    public static void main(String[] args) {

        Sort sort=new Sort();
        List<Kisiler> kisiler= KisilerUtils.kisilerList();

        sort.siralamajava7(kisiler);
        System.out.println(Arrays.toString(kisiler.toArray()));

        sort.siralamajava8(kisiler);
        System.out.println(Arrays.toString(kisiler.toArray()));


    }
    //java7
    private void siralamajava7(List<Kisiler> kisiler){
        Collections.sort(kisiler, new Comparator<Kisiler>() {
            @Override
            public int compare(Kisiler o1, Kisiler o2) {
                return o1.getAd().compareTo(o2.getSoyad());
            }
        });

    }
    //java8
    public void siralamajava8(List<Kisiler> kisiler){
        Collections.sort(kisiler,((o1, o2) -> o1.getAd().compareTo(o2.getSoyad())));
    }

}
