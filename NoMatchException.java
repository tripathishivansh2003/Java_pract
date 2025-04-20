class NoMatchException extends Exception {
    NoMatchException(String s) {
        super(s);
    }
}

class TestException {
    static void checkCountry(String country) throws NoMatchException {
        if (!country.equals("India")) {
            throw new NoMatchException("Country is not India");
        } else {
            System.out.println("Country is India");
        }
    }

    public static void main(String args[]) {
        try {
            checkCountry("USA");
        } catch (NoMatchException e) {
            System.out.println("Exception: " + e);
        }
    }
}