package org.example.app.service;

import org.example.app.controller.ContactController;
import org.example.app.exceptions.OptionException;
import org.example.app.repository.impl.UserRepository;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.*;

public class AppService {

    UserRepository repository = new UserRepository();
    UserService service = new UserService(repository);
    UserView view = new UserView();
    ContactController controller = new ContactController(service, view);

    public void handleOption(int option) {
        switch (option) {
            case 1 -> controller.createContact();
            case 2 -> controller.readContacts();
            case 3 -> controller.updateContact();
            case 4 -> controller.deleteContact();
            case 5 -> controller.readContactById();
            case 0 -> new AppView().getOutput(Integer.toString(option));
            default -> {
                try {
                    throw new OptionException(Constants.INCORRECT_OPTION_MSG);
                } catch (OptionException e) {
                    new AppView().getOutput(e.getMessage());
                    AppStarter.startApp();
                }
            }
        }
    }
}