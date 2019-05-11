
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class createrouteDao {
    
    public boolean check(createroute original){
        boolean flag = false;
        
         
        
        Configuration cf = null;
        SessionFactory sf= null;
        Session session = null;
        Transaction tx;
        
        try{
            cf = new Configuration();
            
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf =  cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(original);
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
    
}
