/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class user {
    private String uname;
    private String pwd;
    public void setName(String username)
    {
        this.uname=uname;
        
    }
    public String getName()
    {
        return this.uname;
    }
    public String setpass(String pwd)
    {
        return this.pwd=pwd;
    }
    public String getpass()
    {
        return this.pwd;
    }
    public boolean equals(Object o)
    {
        user u=(user) o;
        if(uname.equals(u.getName()) && pwd.equals(u.getpass()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

