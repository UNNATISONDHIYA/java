public class DigitOccurrence {
    public static void main(String[] args) {
        int number = 4556435;  // Number to search within
        int digitToFind = 5;   // Digit to find
        int count = 0;

        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;  // Get the last digit
            if (digit == digitToFind) {
                count++;
            }
            temp = temp / 10;  // Remove the last digit
        }

        System.out.println("Digit: " + digitToFind + " occurs " + count + " times in " + number);
    }
}

