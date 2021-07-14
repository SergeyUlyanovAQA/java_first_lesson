package guru.qa;

public class Country {

    String name;
    String capital;
    int population;
    boolean visited;

    public Country() {
    }

    public Country(String name, String capital, int population, boolean visited) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.visited = visited;
    }


    public String getInfoCountry() {
        return ("Country name: " + this.name + ", Country capital: " + this.capital +
                ", Country population: " + this.population + ", Country visited: " + this.visited);
    }

}
