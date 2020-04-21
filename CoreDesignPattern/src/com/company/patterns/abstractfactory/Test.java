package com.company.patterns.abstractfactory;

public class Test {

    public static void main(String[] args) {
        DaoAbstractFactory daoAbstractFactory = DaoFactoryProducer.produce("db");
        Dao dao = daoAbstractFactory.createDao("dept");
        dao.save();

    }
}
