import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner reader =  new Scanner(System.in);
        System.out.println("enter");
        String a = reader.nextLine().replaceAll(" ", "").toLowerCase();
        System.out.println("enter");
        String b = reader.nextLine().replaceAll(" ", "").toLowerCase();
        boolean bool = true;


        if (a.length() == b.length()) {
            char[] arr1 = new char[a.length()];
            char[] arr2 = new char[b.length()];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = a.charAt(i);
                arr2[i] = b.charAt(i);
                char temp;
            }
            for (int i = arr1.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr1[j] > arr1[j + 1]) {
                        char temp = arr1[j + 1];
                        arr1[j + 1] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            for (int i = arr1.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr2[j] > arr2[j + 1]) {
                        char temp = arr2[j + 1];
                        arr2[j + 1] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[j] != arr2[j]) {
                    bool = false;
                    break;




                }
            }
        }else {
            bool = false;

        }if (bool) {
            System.out.println("true");
        }else
            System.out.println("false");
    }
}