package com.company.patterns.abstractfactory;

public class DbEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Employee to DB");
    }
}
