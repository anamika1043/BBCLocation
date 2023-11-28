package uk.co.bbc.bbclocation.dto;

import java.sql.Timestamp;

public class BuildingServerLink
{
    int BuildingServerLinkID;
    int BuildingID;
    int ServerID;
    boolean Active;
    Timestamp CreatedDate;
    String CreatedBy;
    Timestamp ModifiedDate;
    String ModifiedBy;
    
    public int getBuildingServerLinkID() {
        return this.BuildingServerLinkID;
    }
    
    public int getBuildingID() {
        return this.BuildingID;
    }
    
    public int getServerID() {
        return this.ServerID;
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
    
    public void setBuildingServerLinkID(final int buildingServerLinkID) {
        this.BuildingServerLinkID = buildingServerLinkID;
    }
    
    public void setBuildingID(final int buildingID) {
        this.BuildingID = buildingID;
    }
    
    public void setServerID(final int serverID) {
        this.ServerID = serverID;
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
