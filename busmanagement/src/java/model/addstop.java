
package model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class addstop {
    
    @Id
    private String stoppage;
    
    private String time;

    public String getStoppage() {
        return stoppage;
    }

    public void setStoppage(String stoppage) {
        this.stoppage = stoppage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.stoppage);
        hash = 71 * hash + Objects.hashCode(this.time);
        return hash;
    }
    
    
    
    @Override
    public boolean equals(Object ob)
    {
        addstop u = (addstop)ob;
        
        if(this.stoppage.equals(u.getStoppage()) && this.time.equals(u.getTime()))
        {
            return true;
            
        }
        else
        {
            return false;
        }
    }
}
