package Lesson4.controller;

import Lesson4.model.BaseModel;
import Lesson4.service.BaseService;
import Lesson4.view.BaseView;

import java.util.List;

public abstract class BaseController<T extends BaseModel> {
    protected BaseService<T> service;
    protected BaseView<T> view;

    public BaseController(BaseService<T> service, BaseView<T> view) {
        this.service = service;
        this.view = view;
    }

    public void create(T item) {
        service.add(item);
    }

    public void update(T item) {
        service.update(item);
    }

    public void delete(int id) {
        service.delete(id);
    }

    public T getById(int id) {
        return service.getById(id);
    }

    public List<T> getAll() {
        return service.getAll();
    }

    public void displayAll() {
        List<T> items = service.getAll();
        view.display(items);
    }
}
