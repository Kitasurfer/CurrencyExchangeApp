package model;

import java.time.LocalDateTime;

public class Transaction {
    private long id;                   // Уникальный идентификатор операции
    private LocalDateTime timestamp;   // Дата и время операции
    private String type;               // Тип операции ("Пополнение", "Снятие", "Обмен")
    private Currency currency;         // Валюта операции
    private double amount;             // Сумма операции
    private double balanceAfter;       // Баланс на счете после операции
    private long userId;
}
