package model;

public class User {

        private long id;             // Уникальный идентификатор пользователя
        private String name;         // Имя пользователя
        private String email;        // Email пользователя
        private String password;     // Пароль пользователя
        private Role role;           // Роль пользователя (USER или ADMIN)
        private boolean isBlocked;   //  блокировка
    }

