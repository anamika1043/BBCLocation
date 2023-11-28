package uk.co.bbc.bbclocation.dto;

import java.sql.Timestamp;

public class IPAddress
{
    private int IPAddressID;
    private String IPAddress;
    private String Location;
    private String Site;
    private boolean Active;
    private Timestamp CreatedDate;
    private Timestamp ModifiedDate;
    
    public int getIPAddressID() {
        return this.IPAddressID;
    }
    
    public void setIPAddressID(final int iPAddressID) {
        this.IPAddressID = iPAddressID;
    }
    
    public String getIPAddress() {
        return this.IPAddress;
    }
    
    public void setIPAddress(final String iPAddress) {
        this.IPAddress = iPAddress;
    }
    
    public String getLocation() {
        return this.Location;
    }
    
    public void setLocation(final String location) {
        this.Location = location;
    }
    
    public String getSite() {
        return this.Site;
    }
    
    public void setSite(final String site) {
        this.Site = site;
    }
    
    public boolean isActive() {
        return this.Active;
    }
    
    public void setActive(final boolean active) {
        this.Active = active;
    }
    
    public Timestamp getCreatedDate() {
        return this.CreatedDate;
    }
    
    public void setCreatedDate(final Timestamp createdDate) {
        this.CreatedDate = createdDate;
    }
    
    public Timestamp getModifiedDate() {
        return this.ModifiedDate;
    }
    
    public void setModifiedDate(final Timestamp modifiedDate) {
        this.ModifiedDate = modifiedDate;
    }
}
