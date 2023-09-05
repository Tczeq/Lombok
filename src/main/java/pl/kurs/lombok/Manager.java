package pl.kurs.lombok;

import lombok.NonNull;

public class Manager extends Employee{
    private double bonus;

    public Manager(@NonNull String name, String lastName, double salary, String pesel, double bonus) {
        super(name, lastName, salary, pesel);
        this.bonus = bonus;
    }

    public Manager(@NonNull String name, String pesel, double bonus) {
        super(name, pesel);
        this.bonus = bonus;
    }
}
