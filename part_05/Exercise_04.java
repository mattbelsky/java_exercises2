package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class BirthController {
    public static void main(String[] args) {
        Birth barry = new Birth("Barry", "1/3/1962");
        Birth raj = new Birth("Raj", 3, 4, 2000);
        Birth emma = new Birth("Emma", 12, 16, 1918);

        barry.setName("Barack");
        raj.setBirthDay(4);
        emma.setBirthday("12/16/1918");
    }
}

class Birth {
    private String name;
    private String birthday;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public Birth(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Birth(String name, int birthDay, int birthMonth, int birthYear) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public Birth(String name, int birthDay, int birthMonth) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
