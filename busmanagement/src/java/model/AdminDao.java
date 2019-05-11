
package model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdminDao {
    
    public boolean check(Admin original){
        boolean flag = false;
        
        Admin db = null;
        
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


            db = (Admin)session.get(Admin.class,original.getName());
            
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
    
}
