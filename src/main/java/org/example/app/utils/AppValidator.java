package org.example.app.utils;

public class AppValidator {

    // Regex для id.
    // Регулярний вираз для позитивних цілих чисел без нулів, мінусів або ком на початку.
    // ^ вказує на початок рядка
    // [1-9] відповідає будь-якій цифрі від 1 до 9 і гарантує відсутність нулів на початку.
    // $ вказує на кінець рядка
    public final static String ID_RGX = "^[1-9]$";

    // Regex для телефону у форматі xxx xxx-xxxx

    // Валідація вхідного значення id
    public static boolean isIdValid(String id) {
        if (id != null)
            return id.isEmpty() || !id.matches(ID_RGX);
        return false;
    }

    // Валідація вхідного значення телефона
   }
