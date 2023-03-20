public class Main {
    public static void main(String[] args) {
        Integer[] integers = {4, 2, 3, 4, 2};
        myMethod(integers);

        String[] strArray = {"Adilet", "Kanykei", "Aizat"};
        myMethod(strArray);
    }

    public static <T> void myMethod(T[] massive) {
        if (massive.length == 0) {
            return;
        }
        System.out.println("the first element: " + massive[0]);
        System.out.println("last element: " + massive[massive.length - 1]);
        System.out.println("all elements:");
        for (T element : massive) {
            System.out.println(element);
        }
    }
}