import java.io.IOException;

class except {
    static void validate(int age) throws IOException {
        if (age < 18) {
            throw new IOException("Not valid");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String args[]) {
        try {
            validate(13);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}