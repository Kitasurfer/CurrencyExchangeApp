package validator;

public class PasswordValidateException extends Exception {
    /*
    Если я хочу создать исключение, достаточно наследоваться от одного из двух классов:
    1. Проверяемое исключение - Exception
    2. Не проверяемое - RuntimeException

    getMessage() - возвращает строку с коротким описание исключения
     */

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " + super.getMessage();
    }




}
