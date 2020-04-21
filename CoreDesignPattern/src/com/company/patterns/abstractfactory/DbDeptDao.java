package com.company.patterns.abstractfactory;

public class DbDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Department to DB");
    }
}
