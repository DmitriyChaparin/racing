package Data;

public class TestData {
    public static void main(String[] args) {
        boolean success = Data.validateLoginAndPassword("dedDED123_", "qwerty123", "qwerty123!");
        if (success) {
            System.out.println("пароль и логин принят!!!");
        }else {
        System.out.println("неапрвильный логин или пароль");
    }
}}
