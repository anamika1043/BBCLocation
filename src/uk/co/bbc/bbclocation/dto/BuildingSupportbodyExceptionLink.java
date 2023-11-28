package uk.co.bbc.bbclocation.dto;

import java.sql.Timestamp;

public class BuildingSupportbodyExceptionLink
{
    private int BuildingDivisionSupportBodyID;
    private int BuildingID;
    private int SupportBodyID;
    private boolean Active;
    private Timestamp CreatedDate;
    private String CreatedBy;
    private Timestamp ModifiedDate;
    private String ModifiedBy;
    private int DepartmentID;
    
    public int getBuildingDivisionSupportBodyID() {
        return this.BuildingDivisionSupportBodyID;
    }
    
    public void setBuildingDivisionSupportBodyID(final int buildingDivisionSupportBodyID) {
        this.BuildingDivisionSupportBodyID = buildingDivisionSupportBodyID;
    }
    
    public int getBuildingID() {
        return this.BuildingID;
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
    
    public String getCreatedBy() {
        return this.CreatedBy;
    }
    
    public void setCreatedBy(final String createdBy) {
        this.CreatedBy = createdBy;
    }
    
    public Timestamp getModifiedDate() {
        return this.ModifiedDate;
    }
    
    public void setModifiedDate(final Timestamp modifiedDate) {
        this.ModifiedDate = modifiedDate;
    }
    
    public String getModifiedBy() {
        return this.ModifiedBy;
    }
    
    public void setModifiedBy(final String modifiedBy) {
        this.ModifiedBy = modifiedBy;
    }
    
    public int getDepartmentID() {
        return this.DepartmentID;
    }
    
    public void setDepartmentID(final int departmentID) {
        this.DepartmentID = departmentID;
    }
}
