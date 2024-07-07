package Lesson4.service;

import Lesson4.model.BaseModel;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseService<T extends BaseModel> {
    protected List<T> repository = new ArrayList<>();

    public void add(T item) {
        repository.add(item);
    }

    public void update(T item) {
        // Ищем элемент по ID и обновляем его
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getId() == item.getId()) {
                repository.set(i, item);
                break;
            }
        }
    }

    public void delete(int id) {
        repository.removeIf(item -> item.getId() == id);
    }

    public T getById(int id) {
        for (T item : repository) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public List<T> getAll() {
        return new ArrayList<>(repository);
    }
}