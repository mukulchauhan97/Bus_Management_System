
package model;

import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class signDAO {
    public boolean check(sign1 s)
    {
        boolean flag=false;
        
        Configuration cf = null;
        SessionFactory sf= null;
        Session session = null;
        Transaction tx=null;
        
        try{
            cf = new Configuration();
            
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf =  cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(s);
            flag  = true;
            tx.commit();
     
        }
        
        catch(Exception e)
        {
            System.out.println(e);
            flag = false;
            e.printStackTrace();
            
               
        }
        finally
        {
            session.close();
            sf.close();
        }
        
        return flag;
    }
    
    public boolean checkStu(sign1 original)
    {
        boolean flag=false;
        
        Configuration cf = null;
        SessionFactory sf= null;
        Session session = null;
        Transaction tx=null;
        ArrayList<sign1> results = null;
        sign1 db = null;
        try{
            cf = new Configuration();
            
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf =  cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();


            db = (sign1)session.get(sign1.class,original.getRno());
            
            tx.commit();
            
            if(db!=null)
            {
                return original.equals(db);
                
            }
            else
            {
                return false;
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
            flag = false;
            e.printStackTrace();
            
               
        }
        finally
        {
            session.close();
            sf.close();
        }
        
        return flag;
}
 
    
    public ArrayList<sign1> getProfile(String rno){
        
        boolean flag=false;
        
        Configuration cf = null;
        SessionFactory sf= null;
        Session session = null;
        Transaction tx=null;
        ArrayList<sign1> results = null;
        try{
            cf = new Configuration();
            
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf =  cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            String hql = "FROM sign1 where rno = :r_name";

            Query query = session.createQuery(hql);
            
            query.setParameter("r_name",rno);

            results = (ArrayList<sign1>) query.list();
            
            tx.commit();
     
        }
        catch(Exception e)
        {
            System.out.println(e);
            flag = false;
            e.printStackTrace();
        }
        finally
        {
            session.close();
            sf.close();
        }
        
        return results;
    }
    
}
