public class DataAccessUser {
    private String login;
    private String password;
    private String confirmPassword;


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static void VerificationDataUser(String login, String password, String confirmPassword) {

        if (login.length() > 20) {
            System.out.println("логин слишком длинный");
        } else {
            System.out.println("логин правильный");
        }

        if (password.length() >= 20) {
            System.out.println("пароль слишком длинный");

        } else if (password.matches("[a-zA-Z_0-9]+")) {
            System.out.println("пароль правильный");
        } else {
            System.out.println("пароль не правильный");
        }
        if (confirmPassword.equals(password)) {
            System.out.println("Повторный ввод вверный");
        } else {
            System.out.println("Повторный ввод пароля не верный");
        }
    }
}



