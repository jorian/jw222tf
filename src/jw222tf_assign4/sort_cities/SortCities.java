package jw222tf_assign4.sort_cities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by JorianWielink on 29/12/2016.
 */
public class SortCities {
    public static void addCitiesToArray() throws FileNotFoundException {
        String fileLocation = "C:\\Users\\Jorian\\Desktop\\cities.dat";
        Scanner citiesList = new Scanner(new File(fileLocation));
        ArrayList<City> citiesArray = new ArrayList<>();
        //City[] citiesArray = new City[1000];
        int pop;
        String name;

        /*
        Make sure your text file is encoded in UTF-8.
         */
        while (citiesList.hasNextLine()) {
            String line = citiesList.nextLine();
            int delimiterLocation = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ';') {
                    delimiterLocation = i;
                }
            }
            int len = line.length();
            name = line.substring(0, delimiterLocation);
            pop = Integer.valueOf(line.substring(delimiterLocation + 1, len));

            City temp = new City(name, pop);
            citiesArray.add(temp);
        }
        Collections.sort(citiesArray);

        for (City aCity : citiesArray) {
            System.out.println(aCity.getName() + ": " + aCity.getPopulation());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        addCitiesToArray();
    }
}
