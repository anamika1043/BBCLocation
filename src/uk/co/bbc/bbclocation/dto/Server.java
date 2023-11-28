package uk.co.bbc.bbclocation.dto;

import java.sql.Timestamp;

public class Server
{
    int ServerID;
    String ServerType;
    String ServerName;
    String GroupName;
    boolean Active;
    boolean DoNotAssign;
    Timestamp CreatedDate;
    String CreatedBy;
    Timestamp ModifiedDate;
    String ModifiedBy;
    
    public int getServerID() {
        return this.ServerID;
    }
    
    public String getServerType() {
        return this.ServerType;
    }
    
    public String getServerName() {
        return this.ServerName;
    }
    
    public String getGroupName() {
        return this.GroupName;
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
    
    public void setServerID(final int serverID) {
        this.ServerID = serverID;
    }
    
    public void setServerType(final String serverType) {
        this.ServerType = serverType;
    }
    
    public void setServerName(final String serverName) {
        this.ServerName = serverName;
    }
    
    public void setGroupName(final String groupName) {
        this.GroupName = groupName;
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
    
    public boolean isDoNotAssign() {
        return this.DoNotAssign;
    }
    
    public void setDoNotAssign(final boolean doNotAssign) {
        this.DoNotAssign = doNotAssign;
    }
}
