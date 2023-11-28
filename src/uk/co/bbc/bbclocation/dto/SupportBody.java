package uk.co.bbc.bbclocation.dto;

import java.sql.Timestamp;

public class SupportBody
{
    int SupportBodyID;
    String SupportBodyName;
    String SupportBodyDesc;
    boolean Active;
    Timestamp CreatedDate;
    String CreatedBy;
    Timestamp ModifiedDate;
    String ModifiedBy;
    
    public int getSupportBodyID() {
        return this.SupportBodyID;
    }
    
    public String getSupportBodyName() {
        return this.SupportBodyName;
    }
    
    public String getSupportBodyDesc() {
        return this.SupportBodyDesc;
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
    
    public void setSupportBodyID(final int supportBodyID) {
        this.SupportBodyID = supportBodyID;
    }
    
    public void setSupportBodyName(final String supportBodyName) {
        this.SupportBodyName = supportBodyName;
    }
    
    public void setSupportBodyDesc(final String supportBodyDesc) {
        this.SupportBodyDesc = supportBodyDesc;
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
}
