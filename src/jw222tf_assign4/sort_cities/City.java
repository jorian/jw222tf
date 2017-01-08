package jw222tf_assign4.sort_cities;

/**
 * Created by JorianWielink on 29/12/2016.
 */
public class City implements Comparable<City>{
    /*
    Constructs an instance of City, holding two instance variables 'name' and 'population', for use in SortCities.java.

    Implements the Comparable interface in order to sort cities based on their population. See compareTo method.
     */
    private String name;
    private int population;

    City(String cityName, int cityPopulation) {
        name = cityName;
        population = cityPopulation;
    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(City o) {
        if (o != null) {
            return this.population - o.population;
        } else
            return 0;
    }
}
