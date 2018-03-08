package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */
class TelephoneController {
    public static void main(String[] args) {
        Telephone crosley = new Telephone();

        // Sets instance variables for Telephone object
        crosley.setNumber();
        crosley.setDialer("rotary");
        crosley.setConnectionType("land line");
        crosley.setHasRingerVolumeSetting(false);

        // Gets and prints the instance variables for Telephone object
        System.out.println(crosley.getNumber());
        System.out.println(crosley.getDialer());
        System.out.println(crosley.getConnectionType());
        System.out.println(crosley.getRingerVolume());
    }
}

class Telephone {
    private String number;
    private String dialer;
    private String connectionType; // i.e. land line, wireless, cell, satellite
    private boolean hasRingerVolumeSetting;
    private int ringerVolume;

    public String getNumber() {
        return number;
    }

    // Creates an instance of the PhoneNumber class which creates an acceptable format number
    public void setNumber() {
        PhoneNumber ourNumber = new PhoneNumber();
        ourNumber.setCountryCode(1);
        ourNumber.setAreaCode(215);
        ourNumber.setSevenDigitNumber(7389234);
        this.number = "+" + ourNumber.getCountryCode() + ourNumber.getAreaCode() + ourNumber.getSevenDigitNumber();
    }

    public String getDialer() {
        return dialer;
    }

    public void setDialer(String dialer) {
        this.dialer = dialer;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public boolean isHasRingerVolumeSetting() {
        return hasRingerVolumeSetting;
    }

    public void setHasRingerVolumeSetting(boolean hasRingerVolumeSetting) {
        this.hasRingerVolumeSetting = hasRingerVolumeSetting;
    }

    public int getRingerVolume() {
        return ringerVolume;
    }

    public void setRingerVolume(int ringerVolume) {
        switch (this.ringerVolume) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.ringerVolume = ringerVolume;
                break;
            default:
                this.ringerVolume = 5;
        }
    }

}

class PhoneNumber {
    private int countryCode;
    private int areaCode;
    private int sevenDigitNumber;

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        int[] countryCodeList = {1, 52, 53, 502, 503}; // USA/Canada, Mexico, Cuba, Guatemala, El Salvador
        switch (this.countryCode) {
            case 1:
            case 52:
            case 53:
            case 502:
            case 503:
                this.countryCode = countryCode;
                break;
            default:
                this.countryCode = 1;
        }
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getSevenDigitNumber() {
        return sevenDigitNumber;
    }

    public void setSevenDigitNumber(int number) {
        this.sevenDigitNumber = number;
    }
}