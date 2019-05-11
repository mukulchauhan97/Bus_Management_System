
package model;

import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class routeDAO {
      public boolean add(route r)
    {
         boolean flag=false;
        try {
       Configuration cf = new Configuration();
        cf.configure("cfgpackage/hibernate.cfg.xml");
        SessionFactory sf = cf.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(r);
        flag=true;
         tx.commit();
        session.close();
        sf.close();
        }
        catch(Exception e)
        {
         e.printStackTrace();   
        }
        
        return flag;
    }
      public boolean delete1(String code,String name)
      {
           boolean flag=false;
        try 
        {
            Configuration cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            SessionFactory sf = cf.buildSessionFactory();
            Session session1 =sf.openSession();
            session1 =sf.openSession();
            Transaction tx = session1.beginTransaction();
             String sql = "delete from route where rcode='"+code+"' and rname='"+name+"'";
            Query query = session1.createQuery(sql);
           int i= query.executeUpdate();
            tx.commit();
           if(i!=0)
           {
               flag=true;
           }
        session1.close();
        sf.close();
        
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
      
        return flag;
      }
      
      public ArrayList<route> getRoute(String rname){
           boolean flag=false;
        
        Configuration cf = null;
        SessionFactory sf= null;
        Session session = null;
        Transaction tx=null;
        ArrayList<route> results = null;
        try{
            cf = new Configuration();
            
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf =  cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            String hql = "FROM route where rcode = :r_name";

            Query query = session.createQuery(hql);
            
            query.setParameter("r_name",rname);

            results = (ArrayList<route>) query.list();
            
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
      public ArrayList<route> search(String rname)
      {
                 
        Configuration cf = null;
        SessionFactory sf= null;
        Session session = null;
        Transaction tx=null;
        ArrayList<route> results = null;
        try{
            cf = new Configuration();
            
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf =  cf.buildSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            String hql = "FROM route where rcode= :r_name";

            Query query = session.createQuery(hql);
            
            query.setParameter("r_name",rname);
            
            System.out.println("rname "+rname);
            
            results = (ArrayList<route>) query.list();
            
            tx.commit();
     
        }
        catch(Exception e)
        {
            System.out.println(e);
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
