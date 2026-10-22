
public class index2 {

    public static void main(String[] args) {

        // =========================
        // 1. INTEGER DATA TYPES
        // =========================

        byte age = 21;
        short year = 2026;
        int population = 1_400_000_000;
        long distance = 9_000_000_000L;

        System.out.println("BYTE: " + age);
        System.out.println("SHORT: " + year);
        System.out.println("INT: " + population);
        System.out.println("LONG: " + distance);


        // =========================
        // 2. DECIMAL DATA TYPES
        // =========================

        float temperature = 36.5f;
        double pi = 3.141592653589793;

        System.out.println("FLOAT: " + temperature);
        System.out.println("DOUBLE: " + pi);


        // =========================
        // 3. CHARACTER
        // =========================

        char grade = 'A';

        System.out.println("CHAR: " + grade);

        // char can participate in arithmetic
        char nextGrade = (char)(grade + 1);

        System.out.println("NEXT CHAR: " + nextGrade);


        // =========================
        // 4. BOOLEAN
        // =========================

        boolean passed = true;
        boolean failed = false;

        System.out.println("BOOLEAN 1: " + passed);
        System.out.println("BOOLEAN 2: " + failed);


        // =========================
        // 5. STRING
        // =========================

        String name = "Prince Raj";

        System.out.println("STRING: " + name);


        // =========================
        // 6. ARRAY
        // =========================

        int[] marks = {81, 81, 75, 90, 88};

        System.out.println("ARRAY:");

        for (int mark : marks) {
            System.out.println(mark);
        }


        // =========================
        // 7. TYPE CASTING
        // =========================

        double decimalNumber = 10.75;

        int integerNumber = (int) decimalNumber;

        System.out.println("DOUBLE: " + decimalNumber);
        System.out.println("CASTED INT: " + integerNumber);


        // =========================
        // 8. DIFFERENT NUMBER BASES
        // =========================

        int decimal = 12;
        int binary = 0b1100;
        int octal = 014;
        int hexadecimal = 0xC;

        System.out.println("DECIMAL: " + decimal);
        System.out.println("BINARY: " + binary);
        System.out.println("OCTAL: " + octal);
        System.out.println("HEXADECIMAL: " + hexadecimal);


        // =========================
        // 9. CONSTANTS
        // =========================

        int maximumInt = Integer.MAX_VALUE;
        int minimumInt = Integer.MIN_VALUE;

        System.out.println("MAX INT: " + maximumInt);
        System.out.println("MIN INT: " + minimumInt);


        // =========================
        // 10. INTEGER DIVISION
        // =========================

        int a = 5;
        int b = 2;

        System.out.println("INTEGER DIVISION: " + (a / b));

        double properDivision = (double) a / b;

        System.out.println("DECIMAL DIVISION: " + properDivision);


        // =========================
        // 11. LARGE CALCULATION
        // =========================

        int x = 1_000_000;
        int y = 1_000_000;

        long result = (long) x * y;

        System.out.println("LARGE CALCULATION: " + result);
    }
}
