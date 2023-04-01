public class DataAccessUser {

    private DataAccessUser() {
    }

    public static boolean VerificationDataUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {

            if (login.length() > 20) { // проверка логина на соответствие длины и символам
                throw new WrongLoginException("Логин слишком длинный");

            } else if (!login.matches("[a-zA-Z_0-9]+")) {

                System.out.println("логин не правильный");
            } else {
                System.out.println("логин правильный");
            }

            if (password.length() >= 20) {      // проверка пароля на соответствие длины и символам
                throw new WrongPasswordException("Пароль слишком длинный");
            } else if (!password.matches("[a-zA-Z_0-9]+")) {
                System.out.println("пароль не правильный");
            } else {
                System.out.println("пароль правильный");
            }

            if (!confirmPassword.equals(password)) {    // проверка повторного введения пароля заданному
                throw new WrongPasswordException("Пароли не совпадают");
            } else {
                System.out.println("Повторный ввод пароля верный");
                return true;
            }
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }

}










