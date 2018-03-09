package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

class Country {
    private String countryName;
    private String countryCapital;
    private int numStates;

    public Country(String countryName, String countryCapital) {
        this.countryName = countryName;
        this.countryCapital = countryCapital;
        this.numStates = 0; // This number will be incremented as we build state classes.
    }

    public void setNumStates(int numStates) {
        this.numStates = numStates;
    }

    public static void main(String[] args) {
        Country canada = new Country("Canada", "Ottowa");
        canada.test();
    }

    public void test() {
        State bc = new State();
        bc.printCountryName();
    }

    class State {
        private String stateName;
        private String stateCapital;
        private int statePopulation;
        private long stateArea; // sq miles

        public void printCountryName() {
            System.out.println(countryName + " " + countryCapital);
        }
    }
}