package jw222tf_assign4.sort_cities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by JorianWielink on 30/12/2016.
 */
public class TestSort {
    private static City[] cityList = new City[1 ];

    public static void main(String[] args) {
        ArrayList<City> lijstje = new ArrayList<City>();
        lijstje.add(new City("Apeldoorn", 100));
        lijstje.add(new City("Twello", 349));
        lijstje.add(new City("Zeuge", 230));

        Collections.sort(lijstje);

        for (City aCity : lijstje) {
            System.out.println(aCity.getPopulation());
        }
    }
}
