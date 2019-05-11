
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class sign1 {
    @Id
    private String  rno;
    
    private String  fname;
    private String  lname;
    
    private String  email;
    private String  pp;
    private String  mobile;
    private String  pwd;
    private String  routename;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }
    public boolean equals(Object o)
    {
        sign1 s = (sign1)o;
        if( rno.equals(s.getRno()) && pwd.equals(s.getPwd()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
}
