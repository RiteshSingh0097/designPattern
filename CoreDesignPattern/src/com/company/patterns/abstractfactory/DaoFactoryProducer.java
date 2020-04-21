package com.company.patterns.abstractfactory;

public class DaoFactoryProducer {
    public static DaoAbstractFactory produce(String factoryType){
        DaoAbstractFactory daf = null;

        if (factoryType.equals("xml")){
            daf = new XMLDAOFactory();
        }else if (factoryType.equals("db")){
            daf = new DbDAOFactory();
        }
        return daf;
    }
}
