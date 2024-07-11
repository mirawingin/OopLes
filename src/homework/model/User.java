package homework.model;

/*
// код c homework
// Проблемы: Нарушение SRP, прямая зависимость от Persister, смешение ответственностей
public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void save() {
        Persister persister = new Persister(this);
        persister.save();
    }

    public void report() {
        System.out.println("Report for user: " + name);
    }
}
*/

import homework.interfaces.IUser;

// Новый код
// Улучшения: Соблюдение SRP, использование интерфейса
public class User implements IUser {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
