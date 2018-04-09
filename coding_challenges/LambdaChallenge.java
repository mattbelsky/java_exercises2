package coding_challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LambdaChallenge {

    public static final Pattern pattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    public static void main(String[] args) {

        /******************** PART 1 ********************/

        // Lambdas that calculate the volume of a cube of side length "side"
        VolumeCube vol1 = (side) -> Math.pow(side, 3);
        VolumeCube vol2 = (side) -> Math.pow(side, 3);

        // Display the volume of said cubes.
        System.out.println(vol1.getVolume(3));
        System.out.println(vol2.getVolume(150.7));

        /******************** PART 2 ********************/

        // Emails for validation
        String[] emails = {"matt.belsky@gmail.com", "apusinghtheking@yahoo.com", "whatsmyemailcom"};

        // Lambda that validates an email address
        /*  How this works:
                Instantiates an EmailValidator object named "validatorLambda".
                Holds the code and parameter type for abstract method validate().
                When validate() is called, this code executes.
         */
        EmailValidator validatorLambda = (email) -> {
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        };

        // Anonymous inner class that validates an email address
        // Note that this is an expression similar to the lambda and functions very similarly.

        EmailValidator validatorAnonClass = new EmailValidator() {
            @Override
            public boolean validate(String email) {
                Matcher matcher = pattern.matcher(email);
                return matcher.matches();
            }
        };

        // Instantiation of class that implements the functional interface
        Validator validatorClass = new Validator();

        // Displays whether the array of email addresses matches the regex pattern.
        for(String email : emails) {
            System.out.println(validatorLambda.validate(email));
            System.out.println(validatorAnonClass.validate(email));
            System.out.println(validatorClass.validate(email));
        }
    }
}
