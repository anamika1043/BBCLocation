package uk.co.bbc.bbclocation.dto;

public class Location
{
    String location;
    String country;
    
    public String getLocation() {
        return this.location;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public void setLocation(final String location) {
        this.location = location;
    }
    
    public void setCountry(final String country) {
        this.country = country;
    }
}
