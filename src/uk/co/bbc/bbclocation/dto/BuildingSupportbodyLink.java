package uk.co.bbc.bbclocation.dto;

import java.sql.Timestamp;

public class BuildingSupportbodyLink
{
    int BuildingSupportbodyLinkID;
    int BuildingID;
    int SupportBodyID;
    boolean Active;
    Timestamp CreatedDate;
    String CreatedBy;
    Timestamp ModifiedDate;
    String ModifiedBy;
    
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
    
    public int getBuildingSupportbodyLinkID() {
        return this.BuildingSupportbodyLinkID;
    }
    
    public int getBuildingID() {
        return this.BuildingID;
    }
    
    public void setBuildingSupportbodyLinkID(final int buildingSupportbodyLinkID) {
        this.BuildingSupportbodyLinkID = buildingSupportbodyLinkID;
    }
    
    public void setBuildingID(final int buildingID) {
        this.BuildingID = buildingID;
    }
    
    public int getSupportBodyID() {
        return this.SupportBodyID;
    }
    
    public void setSupportBodyID(final int supportBodyID) {
        this.SupportBodyID = supportBodyID;
    }
}
