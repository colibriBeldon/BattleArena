public class InputValidation {

    public boolean isAlpha(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }

        }

        return true;
    }

    public boolean isDigit(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (Exception e) {
            System.out.println(number + " Är inte ett nummer.");
            return false;
        }
    }
}

