package uk.co.bbc.bbclocation.dto;

import java.sql.Timestamp;

public class ServerUsage
{
    private int ID;
    private int ServerID;
    private int TotalSize;
    private int FreeSpace;
    private Timestamp CreatedDate;
    private Timestamp ModifiedDate;
    
    public int getID() {
        return this.ID;
    }
    
    public void setID(final int iD) {
        this.ID = iD;
    }
    
    public int getServerID() {
        return this.ServerID;
    }
    
    public void setServerID(final int serverID) {
        this.ServerID = serverID;
    }
    
    public int getTotalSize() {
        return this.TotalSize;
    }
    
    public void setTotalSize(final int totalSize) {
        this.TotalSize = totalSize;
    }
    
    public int getFreeSpace() {
        return this.FreeSpace;
    }
    
    public void setFreeSpace(final int freeSpace) {
        this.FreeSpace = freeSpace;
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
