package com.homedeve.dto;

/**
 *
 * @author Camel
 */
public class Personne {
    private String lastname;
    private String firstname;

    public Personne(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    
    public String getFullName() {
        
        String fullName = firstname+" "+lastname;
        
        return fullName;
        
    }
    
    
    
    
    
    
}
