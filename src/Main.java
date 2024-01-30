public class Main {
    public static void main(String[] args) {
        print();
    }

    public static void print() {

        printBottomTriangle();
        System.out.println();

        printTopTriangle();
        System.out.println();

        printLeftTriangle();
        System.out.println();

        printRightTriangle();
    }

    public static void printBottomTriangle() {
        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (y <= x && y <= 9 - x) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printTopTriangle() {
        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (y >= x && y >= 9 - x) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printLeftTriangle() {
        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x >= y && x >= 9 - y) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printRightTriangle() {
        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if (x <= y && x <= 9 - y) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
public class Main {

    public static void main(String[] args) {
        max(2);
        max(9);
        max(29);
        max(99);
        max(111);
        max(119);
        max(229);
        max(929);
        max(999999);
    }

    public static void max(int num) {
        String s = "";
        String[] base1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] base2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] base3 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        if (num > 0 && num < 10) {
            s = base1[num];
        } else if (num > 10 && num < 20) {
            s = base3[num % 10];
        } else if (num > 19 && num < 100) {
            s = base2[num / 10] + " " + base1[num % 10];
        } else if (num > 99 && num < 1000) {
            s = base1[num / 100] + " hundred " + max(num % 100);
        } else if (num > 999 && num < 10000) {
            s = base1[num / 1000] + " thousand " + max(num % 1000);
        } else if (num > 9999 && num < 1000000) {
            s = max(num / 1000) + " thousand " + max(num % 1000);
        }

        System.out.println(s.trim());
    }
}

