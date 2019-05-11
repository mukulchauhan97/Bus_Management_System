
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class route {
   @Id
    private String rcode;
    private String rname;
    private String ppoint;
    private String destination;
    private String dname;
    private String time;

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getPpoint() {
        return ppoint;
    }

    public void setPpoint(String ppoint) {
        this.ppoint = ppoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
     public boolean equals(Object o)
    {
        route d =(route) o;
        if(rcode.equals(d.getRcode()) && rname.equals(d.getRname()) && ppoint.equals(d.getPpoint()) && destination.equals(d.getDestination()) && dname.equals(d.getDname()) && time.equals(d.getTime()) && time.equals(d.getTime()))
        {
           return true;
        }
        else
        {
            return false;
        }
   }
}
