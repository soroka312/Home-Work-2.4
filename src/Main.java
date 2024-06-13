public class Main {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";


    public static void main(String[] args) {

        try {
            сheck("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.println("Всё ок!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Что то не так!");
            e.printStackTrace();
        }
    }

    public static void сheck(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        if (login.matches(REGEX)) {
            throw new WrongLoginException();
        }
        if (password.length() > 20) {
            throw new WrongPasswordException();
        }
        if (password.matches(REGEX)) {
            throw new WrongPasswordException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }


    }
}