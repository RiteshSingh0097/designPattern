package com.company.patterns.singleton;

import java.io.*;

public class Main {

    public static void main(String... args) throws IOException, ClassNotFoundException {
        // write your code here

        DateUtil dateUtil = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/home/ritesh/Desktop/singleton/dateUtil.ser")));
        oos.writeObject(dateUtil);
        oos.close();

        DateUtil dateUtil2;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/home/ritesh/Desktop/singleton/dateUtil.ser")));
        dateUtil2 = (DateUtil) ois.readObject();
        ois.close();

        System.out.println(dateUtil.equals(dateUtil2));
    }
}
