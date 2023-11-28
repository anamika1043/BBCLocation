package uk.co.bbc.bbclocation.dto;

import java.sql.Timestamp;

public class Building
{
    private int BuildingID;
    private String SAPBaseCode;
    private String Building;
    private String PostCode;
    private String City;
    private String Country;
    private boolean Active;
    private Timestamp CreatedDate;
    private String CreatedBy;
    private Timestamp ModifiedDate;
    private String ModifiedBy;
    private boolean DoNotDisable;
    
    public int getBuildingID() {
        return this.BuildingID;
    }
    
    public String getSAPBaseCode() {
        return this.SAPBaseCode;
    }
    
    public String getBuilding() {
        return this.Building;
    }
    
    public String getPostCode() {
        return this.PostCode;
    }
    
    public String getCity() {
        return this.City;
    }
    
    public String getCountry() {
        return this.Country;
    }
    
    public boolean isActive() {
        return this.Active;
    }
    
    public Timestamp getCreatedDate() {
        return this.CreatedDate;
    }
    
    public String getCreatedBy() {
        return this.CreatedBy;
    }
    
    public Timestamp getModifiedDate() {
        return this.ModifiedDate;
    }
    
    public String getModifiedBy() {
        return this.ModifiedBy;
    }
    
    public void setBuildingID(final int buildingID) {
        this.BuildingID = buildingID;
    }
    
    public void setSAPBaseCode(final String sAPBaseCode) {
        this.SAPBaseCode = sAPBaseCode;
    }
    
    public void setBuilding(final String building) {
        this.Building = building;
    }
    
    public void setPostCode(final String postCode) {
        this.PostCode = postCode;
    }
    
    public void setCity(final String city) {
        this.City = city;
    }
    
    public void setCountry(final String country) {
        this.Country = country;
    }
    
    public void setActive(final boolean active) {
        this.Active = active;
    }
    
    public void setCreatedDate(final Timestamp createdDate) {
        this.CreatedDate = createdDate;
    }
    
    public void setCreatedBy(final String createdBy) {
        this.CreatedBy = createdBy;
    }
    
    public void setModifiedDate(final Timestamp modifiedDate) {
        this.ModifiedDate = modifiedDate;
    }
    
    public void setModifiedBy(final String modifiedBy) {
        this.ModifiedBy = modifiedBy;
    }
    
    public boolean isDoNotDisable() {
        return this.DoNotDisable;
    }
    
    public void setDoNotDisable(final boolean doNotDisable) {
        this.DoNotDisable = doNotDisable;
    }
}
