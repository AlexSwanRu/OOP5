/*
1.Научить приложение обрабатывать команду READ_ALL - чтение списка
2. Доработать метод UPDATE - обновить только то, что введено непустым
3. валидировать имя и фамилию на содержание пробела  и на пустое значение,
не пустой id(чтобы нельзя было ввестипустой id, ФИО  c пробелами)

 */
package notebook;

import notebook.controller.UserController;
import notebook.model.repository.GBRepository;
import notebook.model.repository.impl.UserRepository;
import notebook.view.UserView;

import static notebook.util.DBConnector.DB_PATH;
import static notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository repository = new UserRepository(DB_PATH);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}
