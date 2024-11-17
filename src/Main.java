import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 34));
        System.out.println(permission(generateRandomAge(), 2));
        System.out.println(permission(generateRandomAge(), -5));
        System.out.println(permission(generateRandomAge(), -11));
        System.out.println(permission(generateRandomAge(), 22));
    }

    public static String permission(int age, double temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return ("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return ("Можно идти гулять");
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return ("Можно идти гулять");
        } else {
            return ("уйдо отур");
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(29);
    }
}