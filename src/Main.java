public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        if (DataAccessUser.verificationDataUser("aaa", "ddd_A3я", "ddd_A3")) {
            System.out.println("вход выполнен");
        } else {
            System.out.println("вход не выполнен");
        }

    }
}