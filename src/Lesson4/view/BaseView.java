package Lesson4.view;

import Lesson4.model.BaseModel;
import java.util.List;

public abstract class BaseView<T extends BaseModel> {
    public void display(List<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
