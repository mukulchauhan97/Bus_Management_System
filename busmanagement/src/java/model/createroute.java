
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class createroute {
    
    @Id
    private String route;
    
    private String regno;
    private String dname;
    private String dno;
    private String  bno;
    private String spoint;
    
    private String tcost;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getSpoint() {
        return spoint;
    }

    public void setSpoint(String spoint) {
        this.spoint = spoint;
    }

    public String getTcost() {
        return tcost;
    }

    public void setTcost(String tcost) {
        this.tcost = tcost;
    }

   public boolean equals(Object o){
       
       createroute cr = (createroute) o;
       if(route.equals(cr.getRoute()) && regno.equals(cr.getRegno()) && dname.equals(cr.getDname()) && dno.equals(cr.getDno()) && bno.equals(cr.getBno()) && spoint.equals(cr.getSpoint()) && tcost.equals(cr.getTcost()))
       {
           return true;
       }
       else
       {
           return false;
       }
   }
    
    
}
