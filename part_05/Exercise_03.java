package part_05;

import java.util.InputMismatchException;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class PaintingController {
    public static void main(String[] args) {
        Painting starryNight = new Painting("Starry Night");

        // Displays initial values before paint method is called.
        displayProperties(starryNight);

        starryNight.paint("red");
        displayProperties(starryNight);

        starryNight.paint(0, 125, 255);
        displayProperties(starryNight);

        // Invalid RGB values are entered.
        starryNight.paint(276, 0, 0);
        displayProperties(starryNight);

        starryNight.paint("red", "green");
        displayProperties(starryNight);

        starryNight.paint("ff0000");
        displayProperties(starryNight);
    }

    // Displays the properties of a painting.
    public static void displayProperties(Painting p) {
        System.out.println(p.getName());
        System.out.println(p.latestColorAddedToString());
        System.out.println();
    }
}

// Represents a digital painting, thereby using the RGB color spectrum.
// I did not realize Java has a Color class that can do most of this when I started...
class Painting {
    private String name;
    private int[] latestColorAddedRGB;

    public Painting(String name) {
        this.name = name;
        this.latestColorAddedRGB = new int[]{255, 255, 255}; // a blank canvas
    }
    // Paints a color that is specified as a string name.
    public void paint(String color) {
        convertStringColorToRGB(color);
    }

    // Paints a mix of two string colors.
    public void paint(String color1, String color2) {
        // call mix() method which calls convert() twice and returns two RGB colors to mix
        mix(color1, color2);
    }

    // Paints an RGB color.
    public void paint(int red, int green, int blue) {
        try {
            if (!validRGB(red) || !validRGB(green) || !validRGB(blue)) {
                throw new InputMismatchException();
            }
            latestColorAddedRGB = new int[]{red, green, blue};
        }
        catch (InputMismatchException exc) {
            latestColorAddedRGB = new int[]{255, 255, 255};
        }
    }

    // Determines whether an input RGB value is valid and returns a boolean value.
    private boolean validRGB(int value) {
        if (value < 0 || value > 255) {
            return false;
        }
        else {
            return true;
        }
    }

    // Mixes two colors.
    private void mix(String one, String two) {
        int[] color1 = convertStringColorToRGB(one);
        int[] color2 = convertStringColorToRGB(two);
        /*
            NewColor.R = Color1.R - (Color1.R - Color2.R)/2
            NewColor.G = Color1.G - (Color1.G - Color2.G)/2
            NewColor.B = Color1.B - (Color1.B - Color2.B)/2
         */
        int[] newColor = new int[]{color1[0] - (color1[0] - color2[0]) / 2,
                                   color1[1] - (color1[1] - color2[1]) / 2,
                                   color1[2] - (color1[2] - color2[2]) / 2};
        latestColorAddedRGB = newColor;
    }

    // Accepts string color values and converts them to RGB values.
    private int[] convertStringColorToRGB(String color) {
        int[] RGB = null;

        // If the string is a hex code, the hex-RGB conversion method is called.
        /*if (color.matches("-?[0-9a-fA-F]+")) {
            RGB = convertHexColorToRGB(color);
        }*/

        // If color is among a limited number of strings, set the RGB value.
        switch (color) {
            case "red":
                RGB = new int[]{255, 0, 0};
                break;
            case "green":
                RGB = new int[]{0, 255, 0};
                break;
            case "blue":
                RGB = new int[]{0, 0, 255};
                break;
            case "yellow":
                RGB = new int[]{255, 255, 0};
                break;
            case "pink":
                RGB = new int[]{255, 0, 255};
                break;
            case "cyan":
                RGB = new int[]{0, 255, 255};
                break;
            default:
                RGB = new int[]{255, 255, 255};
        }

        latestColorAddedRGB = RGB;
        return RGB;
    }

    // Converts a hexadecimal string to an RGB value and returns the array holding the red, green, and blue values.
    /*private int[] convertHexColorToRGB (String hexColor) {
        int[] RGB = new int[]{Integer.valueOf( hexColor.substring( 1, 3 ), 16 ),
                              Integer.valueOf( hexColor.substring( 3, 5 ), 16 ),
                              Integer.valueOf( hexColor.substring( 5, 7 ), 16 )};
        return RGB;
    }*/

    public String getName() {
        return name;
    }

    public String latestColorAddedToString() {
        return "The latest added color has RGB value " + latestColorAddedRGB[0] + " | " + latestColorAddedRGB[1] + " | "
                + latestColorAddedRGB[2] + ".";
    }
}