package coding_challenges;

// Contains the data from the refugees_per_capita.csv file.
public class Refugees {
    private int index;
    private int year;
    private String country;
    private double population;
    private double refugees;
    private double refPerCap;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getRefugees() {
        return refugees;
    }

    public void setRefugees(double refugees) {
        this.refugees = refugees;
    }

    public double getRefPerCap() {
        return refPerCap;
    }

    public void setRefPerCap(double refPerCap) {
        this.refPerCap = refPerCap;
    }
}
