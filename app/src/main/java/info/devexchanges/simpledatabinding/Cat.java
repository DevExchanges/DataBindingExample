package info.devexchanges.simpledatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Cat extends BaseObservable {
    private String name;
    private int age;
    private String owner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(info.devexchanges.simpledatabinding.BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(info.devexchanges.simpledatabinding.BR.age);
    }

    @Bindable
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
        notifyPropertyChanged(info.devexchanges.simpledatabinding.BR.owner);
    }
}
