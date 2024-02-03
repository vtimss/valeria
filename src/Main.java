public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = sum(array);

        System.out.println(sum);
    }

    public static int sum(int[][] arr) {
        int sum = 0;

        for (int[] row : arr) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }
    public static void task2(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double average = average(array);

        System.out.println(average);
    }

    public static double average(int[][] arr) {
        int sum = 0;
        int count = 0;

        for (int[] row : arr) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        return (double) sum / count;
    }
    public static void task3(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] maxInRows = maxInRows(array);

        for (int max : maxInRows) {
            System.out.print(max);
        }
    }

    public static int[] maxInRows(int[][] arr) {
        int[] max = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            max[i] = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max[i]) {
                    max[i] = arr[i][j];
                }
            }
        }

        return max;
    }
    public static void task4(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] minInColumns = minInColumns(array);

        for (int min : minInColumns) {
            System.out.print(min);
        }
    }

    public static int[] minInColumns(int[][] arr) {
        int[] min = new int[arr[0].length];

        for (int i = 0; i < arr[0].length; i++) {
            min[i] = arr[0][i];
            for (int j = 1; j < arr.length; j++) {
                if (arr[j][i] < min[i]) {
                    min[i] = arr[j][i];
                }
            }
        }

        return min;
    }
    public static void task5(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] sumInRows = sumInRows(array);

        for (int sum : sumInRows) {
            System.out.print(sum);
        }
    }

    public static int[] sumInRows(int[][] arr) {
        int[] sum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i] += arr[i][j];
            }
        }

        return sum;
    }
    public static void task6(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean allDiagonalElementsPositive = isPositive(array);

        System.out.println(allDiagonalElementsPositive);
    }

    public static boolean isPositive(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] <= 0) {
                return false;
            }
        }
        return true;
    }
    public static void task7(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        swapRows(array, 0, 2);

        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    public static void swapRows(int[][] arr, int row1, int row2) {
        int[] temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
    }
    public static void task8(String[] args) {
        int[][] array = {{1, 2, -3}, {4, 5, 6}, {7, -8, 9}};
        int sum = sumNegativeRows(array);
        System.out.println(sum);
    }

    public static int sumNegativeRows(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    sum += arr[i][j];
                    break;
                }
            }
        }
        return sum;
    }
    public static void task9(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = countEven(array);
        System.out.println(count);
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void task10(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6};
        int count = countNegative(array);
        System.out.println(count);
    }

    public static int countNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }
    public static void task11(String[] args) {
        int[] array = {0, 2, 0, 4, 0, 6, 0};
        int[] result = replaceZeros(array);

        for (int num : result) {
            System.out.print(" " + num);
        }
    }

    public static int[] replaceZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = ++count;
            }
        }
        return arr;
    }
    public static void task12(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean isEqual = isDiagonalSumEqual(array);
        System.out.println(isEqual);
    }

    public static boolean isDiagonalSumEqual(int[][] arr) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftDiagonalSum += arr[i][i];
            rightDiagonalSum += arr[i][arr.length - i - 1];
        }
        return leftDiagonalSum == rightDiagonalSum;
    }
    public static void task13(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = sumLeftDiagonal(array);
        System.out.println(sum);
    }

    public static int sumLeftDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
    public static void task14(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = countLessThan(array, 4);
        System.out.println(count);
    }

    public static int countLessThan(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num) {
                count++;
            }
        }
        return count;
    }
    public static void task15(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2};
        boolean isUnique = isUnique(array);
        System.out.println(isUnique);
    }

    public static boolean isUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }
}