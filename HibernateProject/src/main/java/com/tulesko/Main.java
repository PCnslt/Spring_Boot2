//package com.tulesko;
//
//import jakarta.transaction.*;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class Main {
//    public static void main(String[] args) throws HeuristicRollbackException, SystemException, HeuristicMixedException, RollbackException {
//
//        Student s1 = new Student();
//        s1.setsName("Adam");
//        s1.setRollNo(104);
//        s1.setsAge(39);
//
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.tulesko.Student.class);
//        cfg.configure();
//
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(s1);
//
//        transaction.commit();
//
//        session.close();
//        sf.close();
//
//        System.out.println(s1.toString());
//
//
//    }
//}

package com.tulesko;

import jakarta.transaction.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) throws HeuristicRollbackException, SystemException, HeuristicMixedException, RollbackException {

        Student s2 = null;

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.tulesko.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        s2 = session.find(Student.class, 102);

        session.close();
        sf.close();

        System.out.println(s2);


    }
}