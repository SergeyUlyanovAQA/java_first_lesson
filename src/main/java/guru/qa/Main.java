package guru.qa;

public class Main {

    public static void main(String[] args) {

        Country Indonesia = new Country();

        Indonesia.name = "Indonesia";
        Indonesia.capital = "Jakarta";
        Indonesia.population = 270000000;
        Indonesia.visited = true;

        System.out.println(Indonesia.getInfoCountry());

    }

}
