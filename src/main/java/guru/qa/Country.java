package guru.qa;

public class Country {

    String name;
    String capital;
    int population;
    boolean visited;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital){
            this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population){
        this.population = population;
    }

    public boolean Visited() {
        return visited;
    }
    public void setVisited(boolean visited){
        this.visited = visited;
    }


    public String getInfoCountry() {
        return ("Country name: " + this.name + ", Country capital: " + this.capital +
                ", Country population: " + this.population + ", Country visited: " + this.visited);
    }

}
