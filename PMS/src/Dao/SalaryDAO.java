/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Models.Salary;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pazo
 */
public class SalaryDAO {
     public String SaveSalary(Salary sal){
        String msg;
        try {
            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = sess.beginTransaction();
            sess.save(sal);
            tx.commit();
            sess.close();
            msg = "Salary Successfully SAVED";
        } catch (HibernateException e) {
            msg= e.getMessage();
        }
        return msg;
    }
    
    public String UpdateSalary(Salary sal){
        String msg;
        try {
            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = sess.beginTransaction();
            sess.update(sal);
            tx.commit();
            sess.close();
            msg = "Salary Successfully UPDATED";
        } catch (HibernateException e) {
            msg= e.getMessage();
        }
        return msg;
    }
    
    public String DeleteSalary(Salary sal){
        String msg;
        try {
            Session sess = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = sess.beginTransaction();
            sess.delete(sal);
            tx.commit();
            sess.close();
            msg = "Salary Successfully DELETED";
        } catch (HibernateException e) {
            msg= e.getMessage();
        }
        return msg;
    }
    
    public List<Salary> findAllSalary(){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query = ss.createQuery("from Salary ORDER BY SalaryId ASC");
        List<Salary> Salarylist = query.list();
        ss.close();
        return Salarylist;
    }
}
