package Data;

import javax.swing.*;

public class Data {
    public static final String VALIDATE_CHARACTER = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM1234567890_";
    public Data() {

    }
    public static boolean validateLoginAndPassword(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        return false;
        }return true;
    }

    public static void check(String login, String password, String confirmPassword)
            throws WrongLoginException,WrongPasswordException {
        if (!validateString(login)) {
            throw new WrongLoginException("Неверно введен логин");
        }
        if (!validateString(password)) {
            throw new WrongPasswordException("Неверно введен пароль");
        }
        if (!validateString(confirmPassword) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль введен не верно или не совпадают");
        }
    }

    public static boolean validateString(String str) {
        if (str.length() < 1 || str.length() > 20) {
            return false;
        }
            for (int i = 0; i < str.length(); i++) {
                if (!VALIDATE_CHARACTER.contains(String.valueOf(str.charAt(i)))) {
            return false;
                }
            }return true;
        }
    }
