package org.example.app.controller;

import org.example.app.service.UserService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.UserView;

import java.util.Map;

public class ContactController {

    UserView view;
    UserService service;

    public ContactController(UserService service, UserView view) {
        this.service = service;
        this.view = view;
    }

    public void createContact() {
        // Отримуємо вхідні дані
        Map<String, String> data = view.getCreateData();
        // Передаємо дані на обробку та отримуємо результат
        String res = service.create(data);
        // Перевіряємо результат щодо обробки даних.
        // Якщо БД відсутня, виводимо повідомлення про це
        // і закриваємо програму.
        // Інакше виводимо результат та перезапускаємо програму.
        if (res.equals(Constants.DB_ABSENT_MSG)) {
            // Виводимо результат
            view.getOutput(res);
            // Закриваємо програму
            System.exit(0);
        } else {
            // Виводимо результат
            view.getOutput(res);
            // Перезапускаємо програму
            AppStarter.startApp();
        }
    }

    public void readContacts() {
        // Отримаємо результат запиту в БД
        String res = service.read();
        // Перевіряємо результат щодо запиту в БД.
        // Якщо БД відсутня, виводимо повідомлення про це
        // і закриваємо програму.
        // Інакше виводимо результат та перезапускаємо програму.
        if (res.equals(Constants.DB_ABSENT_MSG)) {
            // Виводимо результат
            view.getOutput(res);
            // Закриваємо програму
            System.exit(0);
        } else {
            // Виводимо результат
            view.getOutput("\nCONTACTS:\n" + res);
            // Перезапускаємо програму
            AppStarter.startApp();
        }
    }

    public void readContactById() {
        // Отримуємо вхідні дані
        Map<String, String> data = view.getByIDData();
        // Передаємо дані на обробку та отримуємо результат
        String res = service.readById(data);
        // Перевіряємо результат щодо запиту в БД.
        // Якщо БД відсутня, виводимо повідомлення про це
        // і закриваємо програму.
        // Інакше виводимо результат та перезапускаємо програму.
        if (res.equals(Constants.DB_ABSENT_MSG)) {
            // Виводимо результат
            view.getOutput(res);
            // Закриваємо програму
            System.exit(0);
        } else {
            // Виводимо результат
            view.getOutput("\nCONTACT BY ID:\n" + res);
            // Перезапускаємо програму
            AppStarter.startApp();
        }
    }

    public void updateContact() {
        // Отримуємо вхідні дані
        Map<String, String> data = view.getUpdateData();
        // Передаємо дані на обробку та отримуємо результат
        String res = service.update(data);
        // Перевіряємо результат щодо обробки даних.
        // Якщо БД відсутня, виводимо повідомлення про це
        // і закриваємо програму.
        // Інакше виводимо результат та перезапускаємо програму.
        if (res.equals(Constants.DB_ABSENT_MSG)) {
            // Виводимо результат
            view.getOutput(res);
            // Закриваємо програму
            System.exit(0);
        } else {
            // Виводимо результат
            view.getOutput(res);
            // Перезапускаємо програму
            AppStarter.startApp();
        }
    }

    public void deleteContact() {
        // Отримуємо вхідні дані
        Map<String, String> data = view.getDeleteData();
        // Передаємо дані на обробку та отримуємо результат
        String res = service.delete(data);
        // Перевіряємо результат щодо обробки даних.
        // Якщо БД відсутня, виводимо повідомлення про це
        // і закриваємо програму.
        // Інакше виводимо результат та перезапускаємо програму.
        if (res.equals(Constants.DB_ABSENT_MSG)) {
            // Виводимо результат
            view.getOutput(res);
            // Закриваємо програму
            System.exit(0);
        } else {
            // Виводимо результат
            view.getOutput(res);
            // Перезапускаємо програму
            AppStarter.startApp();
        }
    }
}
