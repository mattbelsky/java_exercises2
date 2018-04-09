package coding_challenges;

// Use annotation to ensure that this remains a functional interface.
@FunctionalInterface
public interface EmailValidator {
    public boolean validate(String email);
}
