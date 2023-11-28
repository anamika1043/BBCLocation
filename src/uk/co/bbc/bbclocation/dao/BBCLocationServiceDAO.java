package uk.co.bbc.bbclocation.dao;

import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import uk.co.bbc.bbclocation.dto.Server;
import uk.co.bbc.bbclocation.dto.ServerUsage;
import java.util.Iterator;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import uk.co.bbc.bbclocation.dto.Location;
import uk.co.bbc.bbclocation.dto.Building;
import uk.co.bbc.bbclocation.dto.IPAddress;
import uk.co.bbc.bbclocation.dto.BuildingServerLink;
import uk.co.bbc.bbclocation.dto.BuildingSupportbodyLink;
import uk.co.bbc.bbclocation.dto.BuildingSupportbodyExceptionLink;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import uk.co.bbc.framework.BBCCommonFunctions;
import uk.co.bbc.bbclocation.dto.SupportBody;
import java.util.ArrayList;
import java.sql.Connection;
import org.apache.log4j.Logger;

public class BBCLocationServiceDAO
{
    private static final Logger logger;
    
    static {
        logger = Logger.getLogger(BBCLocationServiceDAO.class.getName());
    }
    
    public ArrayList<SupportBody> getSupportBody(final Connection connection) throws Exception {
        final ArrayList<SupportBody> data = new ArrayList<SupportBody>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM bbclocation_supportbody";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                final SupportBody supportBody = new SupportBody();
                supportBody.setSupportBodyID(rs.getInt(1));
                supportBody.setSupportBodyName(rs.getString(2));
                supportBody.setSupportBodyDesc(rs.getString(3));
                supportBody.setActive(rs.getBoolean(4));
                supportBody.setCreatedDate(rs.getTimestamp(5));
                supportBody.setCreatedBy(rs.getString(6));
                supportBody.setModifiedDate(rs.getTimestamp(7));
                supportBody.setModifiedBy(rs.getString(8));
                data.add(supportBody);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<BuildingSupportbodyExceptionLink> getSupportBodyExceptionByStatus(final Connection connection, final boolean status) throws Exception {
        final ArrayList<BuildingSupportbodyExceptionLink> data = new ArrayList<BuildingSupportbodyExceptionLink>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM bbclocation_supportbodyexceptionlink where Active =?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setBoolean(1, status);
            rs = ps.executeQuery();
            while (rs.next()) {
                final BuildingSupportbodyExceptionLink buildingSupportbodyExceptionLink = new BuildingSupportbodyExceptionLink();
                buildingSupportbodyExceptionLink.setBuildingDivisionSupportBodyID(rs.getInt(1));
                buildingSupportbodyExceptionLink.setBuildingID(rs.getInt(2));
                buildingSupportbodyExceptionLink.setDepartmentID(rs.getInt(3));
                buildingSupportbodyExceptionLink.setSupportBodyID(rs.getInt(4));
                buildingSupportbodyExceptionLink.setActive(rs.getBoolean(5));
                buildingSupportbodyExceptionLink.setCreatedDate(rs.getTimestamp(6));
                buildingSupportbodyExceptionLink.setCreatedBy(rs.getString(7));
                buildingSupportbodyExceptionLink.setModifiedDate(rs.getTimestamp(8));
                buildingSupportbodyExceptionLink.setModifiedBy(rs.getString(9));
                data.add(buildingSupportbodyExceptionLink);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<SupportBody> getSupportBodyByStatus(final Connection connection, final boolean status) throws Exception {
        final ArrayList<SupportBody> data = new ArrayList<SupportBody>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM bbclocation_supportbody where Active =?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setBoolean(1, status);
            rs = ps.executeQuery();
            while (rs.next()) {
                final SupportBody supportBody = new SupportBody();
                supportBody.setSupportBodyID(rs.getInt(1));
                supportBody.setSupportBodyName(rs.getString(2));
                supportBody.setSupportBodyDesc(rs.getString(3));
                supportBody.setActive(rs.getBoolean(4));
                supportBody.setCreatedDate(rs.getTimestamp(5));
                supportBody.setCreatedBy(rs.getString(6));
                supportBody.setModifiedDate(rs.getTimestamp(7));
                supportBody.setModifiedBy(rs.getString(8));
                data.add(supportBody);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<BuildingSupportbodyLink> getBuildingtoSupportBody(final Connection connection) throws Exception {
        final ArrayList<BuildingSupportbodyLink> data = new ArrayList<BuildingSupportbodyLink>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM bbclocation_buildingsupportbodylink";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                final BuildingSupportbodyLink buildingSupportbodyLink = new BuildingSupportbodyLink();
                buildingSupportbodyLink.setBuildingSupportbodyLinkID(rs.getInt(1));
                buildingSupportbodyLink.setBuildingID(rs.getInt(2));
                buildingSupportbodyLink.setSupportBodyID(rs.getInt(3));
                buildingSupportbodyLink.setActive(rs.getBoolean(4));
                buildingSupportbodyLink.setCreatedDate(rs.getTimestamp(5));
                buildingSupportbodyLink.setCreatedBy(rs.getString(6));
                buildingSupportbodyLink.setModifiedDate(rs.getTimestamp(7));
                buildingSupportbodyLink.setModifiedBy(rs.getString(8));
                data.add(buildingSupportbodyLink);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<BuildingServerLink> getBuildingtoServer(final Connection connection) throws Exception {
        final ArrayList<BuildingServerLink> data = new ArrayList<BuildingServerLink>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM bbclocation_buildingserverlink";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                final BuildingServerLink buildingServerLink = new BuildingServerLink();
                buildingServerLink.setBuildingServerLinkID(rs.getInt(1));
                buildingServerLink.setBuildingID(rs.getInt(2));
                buildingServerLink.setServerID(rs.getInt(3));
                buildingServerLink.setActive(rs.getBoolean(4));
                buildingServerLink.setCreatedDate(rs.getTimestamp(5));
                buildingServerLink.setCreatedBy(rs.getString(6));
                buildingServerLink.setModifiedDate(rs.getTimestamp(7));
                buildingServerLink.setModifiedBy(rs.getString(8));
                data.add(buildingServerLink);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<IPAddress> getAllIPAddress(final Connection connection) throws Exception {
        final ArrayList<IPAddress> data = new ArrayList<IPAddress>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM bbclocation_ipaddress";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                final IPAddress ipAddress = new IPAddress();
                ipAddress.setIPAddressID(rs.getInt(1));
                ipAddress.setIPAddress(rs.getString(2));
                ipAddress.setLocation(rs.getString(3));
                ipAddress.setSite(rs.getString(4));
                ipAddress.setActive(rs.getBoolean(5));
                ipAddress.setCreatedDate(rs.getTimestamp(6));
                ipAddress.setModifiedDate(rs.getTimestamp(7));
                data.add(ipAddress);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<SupportBody> getSupportbody(final Connection connection, final String name) throws Exception {
        final ArrayList<SupportBody> data = new ArrayList<SupportBody>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM bbclocation_supportbody where SupportBodyName like ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                final SupportBody supportBody = new SupportBody();
                supportBody.setSupportBodyID(rs.getInt(1));
                supportBody.setSupportBodyName(rs.getString(2));
                supportBody.setSupportBodyDesc(rs.getString(3));
                supportBody.setActive(rs.getBoolean(4));
                supportBody.setCreatedDate(rs.getTimestamp(5));
                supportBody.setCreatedBy(rs.getString(6));
                supportBody.setModifiedDate(rs.getTimestamp(7));
                supportBody.setModifiedBy(rs.getString(8));
                data.add(supportBody);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Building> getBuilding(final Connection connection, final boolean status) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Building> data = new ArrayList<Building>();
        try {
            String query = "SELECT * FROM bbclocation_building where Active = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setBoolean(1, status);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Building building = new Building();
                building.setBuildingID(rs.getInt(1));
                building.setSAPBaseCode(rs.getString(2));
                building.setBuilding(rs.getString(3));
                building.setPostCode(rs.getString(4));
                building.setCity(rs.getString(5));
                building.setCountry(rs.getString(6));
                building.setActive(rs.getBoolean(7));
                building.setCreatedDate(rs.getTimestamp(8));
                building.setCreatedBy(rs.getString(9));
                building.setModifiedDate(rs.getTimestamp(10));
                building.setModifiedBy(rs.getString(11));
                data.add(building);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Building> getBuildingByType(final Connection connection, final String type) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Building> data = new ArrayList<Building>();
        try {
            String query = "SELECT * FROM bbclocation_building where BuildingType = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, type);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Building building = new Building();
                building.setBuildingID(rs.getInt(1));
                building.setSAPBaseCode(rs.getString(2));
                building.setBuilding(rs.getString(3));
                building.setPostCode(rs.getString(4));
                building.setCity(rs.getString(5));
                building.setCountry(rs.getString(6));
                building.setActive(rs.getBoolean(7));
                building.setCreatedDate(rs.getTimestamp(8));
                building.setCreatedBy(rs.getString(9));
                building.setModifiedDate(rs.getTimestamp(10));
                building.setModifiedBy(rs.getString(11));
                data.add(building);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Building> getBuildingByID(final Connection connection, final String id) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Building> data = new ArrayList<Building>();
        try {
            String query = "SELECT * FROM bbclocation_building where SAPBaseCode = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Building building = new Building();
                building.setBuildingID(rs.getInt(1));
                building.setSAPBaseCode(rs.getString(2));
                building.setBuilding(rs.getString(3));
                building.setPostCode(rs.getString(4));
                building.setCity(rs.getString(5));
                building.setCountry(rs.getString(6));
                building.setActive(rs.getBoolean(7));
                building.setCreatedDate(rs.getTimestamp(8));
                building.setCreatedBy(rs.getString(9));
                building.setModifiedDate(rs.getTimestamp(10));
                building.setModifiedBy(rs.getString(11));
                data.add(building);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Building> getBuilding(final Connection connection) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Building> data = new ArrayList<Building>();
        try {
            String query = "SELECT * FROM bbclocation_building";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Building building = new Building();
                building.setBuildingID(rs.getInt(1));
                building.setSAPBaseCode(rs.getString(2));
                building.setBuilding(rs.getString(3));
                building.setPostCode(rs.getString(4));
                building.setCity(rs.getString(5));
                building.setCountry(rs.getString(6));
                building.setActive(rs.getBoolean(7));
                building.setCreatedDate(rs.getTimestamp(8));
                building.setCreatedBy(rs.getString(9));
                building.setModifiedDate(rs.getTimestamp(10));
                building.setModifiedBy(rs.getString(11));
                data.add(building);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Building> getBuildingByDay(final Connection connection, final String table) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Building> data = new ArrayList<Building>();
        try {
            String query = "SELECT * FROM " + table;
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Building building = new Building();
                building.setBuildingID(rs.getInt(1));
                building.setSAPBaseCode(rs.getString(2));
                building.setBuilding(rs.getString(3));
                building.setPostCode(rs.getString(4));
                building.setCity(rs.getString(5));
                building.setCountry(rs.getString(6));
                building.setActive(rs.getBoolean(7));
                building.setCreatedDate(rs.getTimestamp(8));
                building.setCreatedBy(rs.getString(9));
                building.setModifiedDate(rs.getTimestamp(10));
                building.setModifiedBy(rs.getString(11));
                building.setDoNotDisable(rs.getBoolean(12));
                data.add(building);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Location> getLocation(final Connection connection, final String status) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Location> data = new ArrayList<Location>();
        try {
            String query = "SELECT DISTINCT(City), Country FROM bbclocation_building where Active = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            if (status.equalsIgnoreCase("Disabled")) {
                ps.setBoolean(1, false);
            }
            else {
                ps.setBoolean(1, true);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                final Location location = new Location();
                location.setLocation(rs.getString(1));
                location.setCountry(rs.getString(2));
                data.add(location);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Location> getLocation(final Connection connection) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Location> data = new ArrayList<Location>();
        try {
            String query = "SELECT DISTINCT(City), Country FROM bbclocation_building where Active = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setBoolean(1, true);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Location location = new Location();
                location.setLocation(rs.getString(1));
                location.setCountry(rs.getString(2));
                data.add(location);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Building> getServerBuildingLink(final Connection connection, final String serverid) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Building> data = new ArrayList<Building>();
        try {
            String query = "SELECT bbclocation_building.* FROM bbclocation_building INNER JOIN bbclocation_buildingserverlink ON bbclocation_building.BuildingID=bbclocation_buildingserverlink.BuildingID where bbclocation_buildingserverlink.ServerID = ? and bbclocation_buildingserverlink.Active = ? and bbclocation_building.Active = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, serverid);
            ps.setBoolean(2, true);
            ps.setBoolean(3, true);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Building building = new Building();
                building.setBuildingID(rs.getInt(1));
                building.setSAPBaseCode(rs.getString(2));
                building.setBuilding(rs.getString(3));
                building.setPostCode(rs.getString(4));
                building.setCity(rs.getString(5));
                building.setCountry(rs.getString(6));
                building.setActive(rs.getBoolean(7));
                data.add(building);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Building> getSupportBodyBuildingLink(final Connection connection, final String supportbodyid) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Building> data = new ArrayList<Building>();
        try {
            String query = "SELECT DISTINCT bbclocation_building.* FROM bbclocation_building INNER JOIN bbclocation_buildingsupportbodylink ON bbclocation_building.BuildingID=bbclocation_buildingsupportbodylink.BuildingID where bbclocation_buildingsupportbodylink.SupportBodyID = ? and bbclocation_buildingsupportbodylink.Active = ? and bbclocation_building.Active = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, supportbodyid);
            ps.setBoolean(2, true);
            ps.setBoolean(3, true);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Building building = new Building();
                building.setBuildingID(rs.getInt(1));
                building.setSAPBaseCode(rs.getString(2));
                building.setBuilding(rs.getString(3));
                building.setPostCode(rs.getString(4));
                building.setCity(rs.getString(5));
                building.setCountry(rs.getString(6));
                building.setActive(rs.getBoolean(7));
                data.add(building);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<BuildingSupportbodyExceptionLink> getSupportBodyBuildingExceptionLink(final Connection connection, final String supportbodyid) throws Exception {
        final ArrayList<BuildingSupportbodyExceptionLink> data = new ArrayList<BuildingSupportbodyExceptionLink>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM bbclocation_supportbodyexceptionlink where SupportBodyID =?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(supportbodyid));
            rs = ps.executeQuery();
            while (rs.next()) {
                final BuildingSupportbodyExceptionLink buildingSupportbodyExceptionLink = new BuildingSupportbodyExceptionLink();
                buildingSupportbodyExceptionLink.setBuildingDivisionSupportBodyID(rs.getInt(1));
                buildingSupportbodyExceptionLink.setBuildingID(rs.getInt(2));
                buildingSupportbodyExceptionLink.setDepartmentID(rs.getInt(3));
                buildingSupportbodyExceptionLink.setSupportBodyID(rs.getInt(4));
                buildingSupportbodyExceptionLink.setActive(rs.getBoolean(5));
                buildingSupportbodyExceptionLink.setCreatedDate(rs.getTimestamp(6));
                buildingSupportbodyExceptionLink.setCreatedBy(rs.getString(7));
                buildingSupportbodyExceptionLink.setModifiedDate(rs.getTimestamp(8));
                buildingSupportbodyExceptionLink.setModifiedBy(rs.getString(9));
                data.add(buildingSupportbodyExceptionLink);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public int createServer(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        int result = 0;
        try {
            String query = "INSERT INTO bbclocation_server(ServerType, ServerName, GroupName, Active, CreatedDate, CreatedBy, ModifiedDate, ModifiedBy, DoNotAssign) VALUES(?,?,?,?,?,?,?,?,?)";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query, 1);
            ps.setString(1, data.getString("ServerType"));
            ps.setString(2, data.getString("ServerName"));
            ps.setString(3, data.getString("GroupName"));
            ps.setBoolean(4, (boolean)data.get("Active"));
            ps.setTimestamp(5, this.stringToTimestamp(data.getString("createdDate")));
            ps.setString(6, data.getString("createdBy"));
            ps.setTimestamp(7, this.stringToTimestamp(data.getString("lastModifiedDate")));
            ps.setString(8, data.getString("lastModifiedBy"));
            ps.setBoolean(9, (boolean)data.get("DoNotAssign"));
            ps.execute();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            ps.close();
            rs.close();
        }
        ps.close();
        rs.close();
        return result;
    }
    
    public int createBuildingServerLink(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        int result = 0;
        try {
            String query = "INSERT INTO bbclocation_buildingserverlink(BuildingID, ServerID, Active, CreatedDate, CreatedBy, ModifiedDate, ModifiedBy) VALUES(?,?,?,?,?,?,?)";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query, 1);
            final JSONArray associatedBuidings = new JSONArray(data.get("AssociatedBuildings").toString());
            for (int i = 0; i < associatedBuidings.length(); ++i) {
                final JSONObject links = associatedBuidings.getJSONObject(i);
                ps.setInt(1, links.getInt("buildingID"));
                ps.setInt(2, data.getInt("ServerID"));
                ps.setBoolean(3, (boolean)data.get("Active"));
                ps.setTimestamp(4, this.stringToTimestamp(data.getString("createdDate")));
                ps.setString(5, data.getString("createdBy"));
                ps.setTimestamp(6, this.stringToTimestamp(data.getString("lastModifiedDate")));
                ps.setString(7, data.getString("lastModifiedBy"));
                ps.addBatch();
            }
            if (ps != null) {
                ps.executeBatch();
            }
            result = 1;
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            ps.close();
        }
        ps.close();
        return result;
    }
    
    public int modifyServer(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        int result = 0;
        try {
            String query = "UPDATE bbclocation_server set ServerType = ?, ServerName = ?, GroupName = ?, Active = ?, ModifiedDate = ?, ModifiedBy = ? , DoNotAssign = ? where ServerID = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, data.getString("ServerType"));
            ps.setString(2, data.getString("ServerName"));
            ps.setString(3, data.getString("GroupName"));
            ps.setBoolean(4, (boolean)data.get("Active"));
            ps.setTimestamp(5, this.stringToTimestamp(data.getString("lastModifiedDate")));
            ps.setString(6, data.getString("lastModifiedBy"));
            ps.setBoolean(7, (boolean)data.get("DoNotAssign"));
            ps.setInt(8, data.getInt("ServerID"));
            result = ps.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            ps.close();
        }
        ps.close();
        return result;
    }
    
    public int modifyBuildingServerLink(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        PreparedStatement updateps = null;
        PreparedStatement deleteps = null;
        PreparedStatement insertps = null;
        ResultSet rs = null;
        int result = 0;
        try {
            String selectquery = "select * from bbclocation_buildingserverlink where ServerID = ?";
            String updatequery = "UPDATE bbclocation_buildingserverlink set Active = ?, ModifiedDate = ?, ModifiedBy = ? where ServerID = ? and BuildingID = ?";
            String insertquery = "INSERT INTO bbclocation_buildingserverlink(BuildingID, ServerID, Active, CreatedDate, CreatedBy, ModifiedDate, ModifiedBy) VALUES(?,?,?,?,?,?,?)";
            String deletequery = "delete from bbclocation_buildingserverlink where ServerID = ? and BuildingID = ?";
            JSONArray buildingdata = new JSONArray();
            buildingdata = (JSONArray)data.get("AssociatedBuildings");
            selectquery = BBCCommonFunctions.convertQueryToDBSpecific(selectquery, connection);
            ps = connection.prepareStatement(selectquery);
            insertquery = BBCCommonFunctions.convertQueryToDBSpecific(insertquery, connection);
            insertps = connection.prepareStatement(insertquery);
            updatequery = BBCCommonFunctions.convertQueryToDBSpecific(updatequery, connection);
            updateps = connection.prepareStatement(updatequery);
            deletequery = BBCCommonFunctions.convertQueryToDBSpecific(deletequery, connection);
            deleteps = connection.prepareStatement(deletequery);
            final int serverid = (int)data.get("ServerID");
            ps.setInt(1, serverid);
            rs = ps.executeQuery();
            final ArrayList<Integer> foundlinks = new ArrayList<Integer>();
            int update = 0;
            int disable = 0;
            int insert = 0;
            while (rs.next()) {
                final int buildingIDDB = rs.getInt("BuildingID");
                int disableflag = 1;
                for (int i = 0; i < buildingdata.length(); ++i) {
                    final JSONObject bLinks = new JSONObject(buildingdata.get(i).toString());
                    final int buildingID = (int)bLinks.get("buildingID");
                    bLinks.put("lastModifiedDate", (Object)data.getString("lastModifiedDate"));
                    bLinks.put("lastModifiedBy", (Object)data.getString("lastModifiedBy"));
                    bLinks.put("Active", true);
                    if (buildingIDDB == buildingID) {
                        update = 1;
                        disableflag = 0;
                        foundlinks.add(buildingIDDB);
                        updateps.setBoolean(1, (boolean)data.get("Active"));
                        updateps.setTimestamp(2, this.stringToTimestamp(data.getString("lastModifiedDate")));
                        updateps.setString(3, data.getString("lastModifiedBy"));
                        updateps.setInt(4, serverid);
                        updateps.setInt(5, buildingIDDB);
                        updateps.addBatch();
                        break;
                    }
                    disableflag = 1;
                }
                if (disableflag == 1) {
                    deleteps.setInt(1, serverid);
                    deleteps.setInt(2, buildingIDDB);
                    deleteps.addBatch();
                    disable = 1;
                }
            }
            for (int j = 0; j < buildingdata.length(); ++j) {
                final JSONObject bLink = new JSONObject(buildingdata.get(j).toString());
                final int buildingID2 = (int)bLink.get("buildingID");
                bLink.put("createdDate", (Object)data.getString("createdDate"));
                bLink.put("createdBy", (Object)data.getString("createdBy"));
                bLink.put("lastModifiedDate", (Object)data.getString("lastModifiedDate"));
                bLink.put("lastModifiedBy", (Object)data.getString("lastModifiedBy"));
                bLink.put("Active", true);
                if (!foundlinks.contains(buildingID2)) {
                    insertps.setInt(1, buildingID2);
                    insertps.setInt(2, data.getInt("ServerID"));
                    insertps.setBoolean(3, (boolean)data.get("Active"));
                    insertps.setTimestamp(4, this.stringToTimestamp(data.getString("createdDate")));
                    insertps.setString(5, data.getString("createdBy"));
                    insertps.setTimestamp(6, this.stringToTimestamp(data.getString("lastModifiedDate")));
                    insertps.setString(7, data.getString("lastModifiedBy"));
                    insertps.addBatch();
                    insert = 1;
                }
            }
            if (insert == 1) {
                insertps.executeBatch();
            }
            if (update == 1) {
                updateps.executeBatch();
            }
            if (disable == 1) {
                deleteps.executeBatch();
            }
            result = 1;
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
            updateps.close();
            insertps.close();
            deleteps.close();
        }
        rs.close();
        ps.close();
        updateps.close();
        insertps.close();
        deleteps.close();
        return result;
    }
    
    public int createSupportBody(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        int result = 0;
        try {
            String query = "INSERT INTO bbclocation_supportbody(SupportBodyName, SupportBodyDesc, Active, CreatedDate, CreatedBy, ModifiedDate, ModifiedBy) VALUES(?,?,?,?,?,?,?)";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query, 1);
            ps.setString(1, data.getString("SupportBodyName"));
            ps.setString(2, data.getString("SupportBodyDesc"));
            ps.setBoolean(3, (boolean)data.get("Active"));
            ps.setTimestamp(4, this.stringToTimestamp(data.getString("createdDate")));
            ps.setString(5, data.getString("createdBy"));
            ps.setTimestamp(6, this.stringToTimestamp(data.getString("lastModifiedDate")));
            ps.setString(7, data.getString("lastModifiedBy"));
            ps.execute();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            ps.close();
            rs.close();
        }
        ps.close();
        rs.close();
        return result;
    }
    
    public int createBuildingSupportBodyLink(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        int result = 0;
        try {
            String query = "INSERT INTO bbclocation_buildingsupportbodylink(BuildingID, SupportBodyID, Active, CreatedDate, CreatedBy, ModifiedDate, ModifiedBy) VALUES(?,?,?,?,?,?,?)";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query, 1);
            final JSONArray associatedBuidings = new JSONArray(data.get("AssociatedBuildings").toString());
            for (int i = 0; i < associatedBuidings.length(); ++i) {
                final JSONObject links = associatedBuidings.getJSONObject(i);
                ps.setInt(1, links.getInt("buildingID"));
                ps.setInt(2, data.getInt("SupportBodyID"));
                ps.setBoolean(3, (boolean)data.get("Active"));
                ps.setTimestamp(4, this.stringToTimestamp(data.getString("createdDate")));
                ps.setString(5, data.getString("createdBy"));
                ps.setTimestamp(6, this.stringToTimestamp(data.getString("lastModifiedDate")));
                ps.setString(7, data.getString("lastModifiedBy"));
                ps.addBatch();
            }
            if (ps != null) {
                ps.executeBatch();
            }
            result = 1;
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            ps.close();
        }
        ps.close();
        return result;
    }
    
    public int createBuildingSupportBodyExceptionLink(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        int result = 0;
        try {
            String query = "INSERT INTO bbclocation_supportbodyexceptionlink(BuildingID, DepartmentID, SupportBodyID, Active, CreatedDate, CreatedBy, ModifiedDate, ModifiedBy) VALUES(?,?,?,?,?,?,?,?)";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query, 1);
            final JSONArray associatedDivisionBuildings = new JSONArray(data.get("AssociatedDivisionBuildings").toString());
            for (int i = 0; i < associatedDivisionBuildings.length(); ++i) {
                final JSONObject links = new JSONObject(associatedDivisionBuildings.get(i).toString());
                final JSONArray selectedDepartment = new JSONArray(links.get("selectedDepartment").toString());
                final JSONArray selectedBuilding = new JSONArray(links.get("selectedBuilding").toString());
                for (int k = 0; k < selectedDepartment.length(); ++k) {
                    final JSONObject departmentlinks = selectedDepartment.getJSONObject(k);
                    for (int j = 0; j < selectedBuilding.length(); ++j) {
                        final JSONObject buildinglinks = selectedBuilding.getJSONObject(j);
                        ps.setInt(1, buildinglinks.getInt("buildingID"));
                        ps.setInt(2, departmentlinks.getInt("depID"));
                        ps.setInt(3, data.getInt("SupportBodyID"));
                        ps.setBoolean(4, (boolean)data.get("Active"));
                        ps.setTimestamp(5, this.stringToTimestamp(data.getString("createdDate")));
                        ps.setString(6, data.getString("createdBy"));
                        ps.setTimestamp(7, this.stringToTimestamp(data.getString("lastModifiedDate")));
                        ps.setString(8, data.getString("lastModifiedBy"));
                        ps.addBatch();
                    }
                }
            }
            if (ps != null) {
                ps.executeBatch();
            }
            result = 1;
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            ps.close();
        }
        ps.close();
        return result;
    }
    
    public int modifySupportBody(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        int result = 0;
        try {
            String query = "UPDATE bbclocation_supportbody set SupportBodyName = ?, SupportBodyDesc = ?, Active = ?, ModifiedDate = ?, ModifiedBy = ? where SupportBodyID = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, data.getString("SupportBodyName"));
            ps.setString(2, data.getString("SupportBodyDesc"));
            ps.setBoolean(3, (boolean)data.get("Active"));
            ps.setTimestamp(4, this.stringToTimestamp(data.getString("lastModifiedDate")));
            ps.setString(5, data.getString("lastModifiedBy"));
            ps.setInt(6, data.getInt("SupportBodyID"));
            result = ps.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            ps.close();
        }
        ps.close();
        return result;
    }
    
    public int modifyBuildingSupportBodyLink(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        PreparedStatement updateps = null;
        PreparedStatement deleteps = null;
        PreparedStatement insertps = null;
        ResultSet rs = null;
        int result = 0;
        try {
            String selectquery = "select * from bbclocation_buildingsupportbodylink where SupportBodyID = ?";
            String updatequery = "UPDATE bbclocation_buildingsupportbodylink set Active = ?, ModifiedDate = ?, ModifiedBy = ? where SupportBodyID = ? and BuildingID = ?";
            String insertquery = "INSERT INTO bbclocation_buildingsupportbodylink(BuildingID, SupportBodyID, Active, CreatedDate, CreatedBy, ModifiedDate, ModifiedBy) VALUES(?,?,?,?,?,?,?)";
            String deletequery = "delete from bbclocation_buildingsupportbodylink where SupportBodyID = ? and BuildingID = ?";
            JSONArray buildingdata = new JSONArray();
            buildingdata = (JSONArray)data.get("AssociatedBuildings");
            selectquery = BBCCommonFunctions.convertQueryToDBSpecific(selectquery, connection);
            ps = connection.prepareStatement(selectquery);
            insertquery = BBCCommonFunctions.convertQueryToDBSpecific(insertquery, connection);
            insertps = connection.prepareStatement(insertquery);
            updatequery = BBCCommonFunctions.convertQueryToDBSpecific(updatequery, connection);
            updateps = connection.prepareStatement(updatequery);
            deletequery = BBCCommonFunctions.convertQueryToDBSpecific(deletequery, connection);
            deleteps = connection.prepareStatement(deletequery);
            final int supportbodyid = (int)data.get("SupportBodyID");
            ps.setInt(1, supportbodyid);
            rs = ps.executeQuery();
            final ArrayList<Integer> foundlinks = new ArrayList<Integer>();
            int update = 0;
            int disable = 0;
            int insert = 0;
            while (rs.next()) {
                final int buildingIDDB = rs.getInt("BuildingID");
                int disableflag = 1;
                for (int i = 0; i < buildingdata.length(); ++i) {
                    final JSONObject bLinks = new JSONObject(buildingdata.get(i).toString());
                    final int buildingID = (int)bLinks.get("buildingID");
                    bLinks.put("lastModifiedDate", (Object)data.getString("lastModifiedDate"));
                    bLinks.put("lastModifiedBy", (Object)data.getString("lastModifiedBy"));
                    bLinks.put("Active", true);
                    if (buildingIDDB == buildingID) {
                        update = 1;
                        disableflag = 0;
                        foundlinks.add(buildingIDDB);
                        updateps.setBoolean(1, (boolean)data.get("Active"));
                        updateps.setTimestamp(2, this.stringToTimestamp(data.getString("lastModifiedDate")));
                        updateps.setString(3, data.getString("lastModifiedBy"));
                        updateps.setInt(4, supportbodyid);
                        updateps.setInt(5, buildingIDDB);
                        updateps.addBatch();
                        break;
                    }
                    disableflag = 1;
                }
                if (disableflag == 1) {
                    deleteps.setInt(1, supportbodyid);
                    deleteps.setInt(2, buildingIDDB);
                    deleteps.addBatch();
                    disable = 1;
                }
            }
            for (int j = 0; j < buildingdata.length(); ++j) {
                final JSONObject bLink = new JSONObject(buildingdata.get(j).toString());
                final int buildingID2 = (int)bLink.get("buildingID");
                bLink.put("createdDate", (Object)data.getString("createdDate"));
                bLink.put("createdBy", (Object)data.getString("createdBy"));
                bLink.put("lastModifiedDate", (Object)data.getString("lastModifiedDate"));
                bLink.put("lastModifiedBy", (Object)data.getString("lastModifiedBy"));
                bLink.put("Active", true);
                if (!foundlinks.contains(buildingID2)) {
                    insertps.setInt(1, buildingID2);
                    insertps.setInt(2, data.getInt("SupportBodyID"));
                    insertps.setBoolean(3, (boolean)data.get("Active"));
                    insertps.setTimestamp(4, this.stringToTimestamp(data.getString("createdDate")));
                    insertps.setString(5, data.getString("createdBy"));
                    insertps.setTimestamp(6, this.stringToTimestamp(data.getString("lastModifiedDate")));
                    insertps.setString(7, data.getString("lastModifiedBy"));
                    insertps.addBatch();
                    insert = 1;
                }
            }
            if (insert == 1) {
                insertps.executeBatch();
            }
            if (update == 1) {
                updateps.executeBatch();
            }
            if (disable == 1) {
                deleteps.executeBatch();
            }
            result = 1;
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
            updateps.close();
            insertps.close();
            deleteps.close();
        }
        rs.close();
        ps.close();
        updateps.close();
        insertps.close();
        deleteps.close();
        return result;
    }
    
    public int modifyBuildingSupportBodyExceptionLink(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement deleteps = null;
        PreparedStatement insertps = null;
        int result = 0;
        try {
            String insertquery = "INSERT INTO bbclocation_supportbodyexceptionlink(BuildingID, DepartmentID, SupportBodyID, Active, CreatedDate, CreatedBy, ModifiedDate, ModifiedBy) VALUES(?,?,?,?,?,?,?,?)";
            String deletequery = "delete from bbclocation_supportbodyexceptionlink where SupportBodyID = ?";
            final JSONArray associatedDivisionBuildings = new JSONArray(data.get("AssociatedDivisionBuildings").toString());
            insertquery = BBCCommonFunctions.convertQueryToDBSpecific(insertquery, connection);
            insertps = connection.prepareStatement(insertquery);
            deletequery = BBCCommonFunctions.convertQueryToDBSpecific(deletequery, connection);
            deleteps = connection.prepareStatement(deletequery);
            final int supportbodyid = (int)data.get("SupportBodyID");
            deleteps.setInt(1, supportbodyid);
            deleteps.executeUpdate();
            final HashSet<String> resultSet = new HashSet<String>();
            final int supportBodyID = data.getInt("SupportBodyID");
            for (int i = 0; i < associatedDivisionBuildings.length(); ++i) {
                final JSONObject mappingLinks = new JSONObject(associatedDivisionBuildings.get(i).toString());
                JSONArray selectedBuildingData = new JSONArray();
                selectedBuildingData = (JSONArray)mappingLinks.get("selectedBuilding");
                JSONArray selectedDepartmentData = new JSONArray();
                selectedDepartmentData = (JSONArray)mappingLinks.get("selectedDepartment");
                for (int k = 0; k < selectedDepartmentData.length(); ++k) {
                    final JSONObject departmentData = new JSONObject(selectedDepartmentData.get(k).toString());
                    final int departmentID = (int)departmentData.get("depID");
                    for (int j = 0; j < selectedBuildingData.length(); ++j) {
                        final JSONObject buildingData = new JSONObject(selectedBuildingData.get(j).toString());
                        final int buildingID = (int)buildingData.get("buildingID");
                        mappingLinks.put("createdDate", (Object)data.getString("createdDate"));
                        mappingLinks.put("createdBy", (Object)data.getString("createdBy"));
                        mappingLinks.put("lastModifiedDate", (Object)data.getString("lastModifiedDate"));
                        mappingLinks.put("lastModifiedBy", (Object)data.getString("lastModifiedBy"));
                        mappingLinks.put("Active", true);
                        resultSet.add(String.valueOf(buildingID) + "|" + departmentID + "|" + supportBodyID);
                    }
                }
            }
            final Iterator<String> iterator = resultSet.iterator();
            while (iterator.hasNext()) {
                final String[] resultArr = iterator.next().split("\\|");
                insertps.setInt(1, Integer.parseInt(resultArr[0]));
                insertps.setInt(2, Integer.parseInt(resultArr[1]));
                insertps.setInt(3, Integer.parseInt(resultArr[2]));
                insertps.setBoolean(4, (boolean)data.get("Active"));
                insertps.setTimestamp(5, this.stringToTimestamp(data.getString("createdDate")));
                insertps.setString(6, data.getString("createdBy"));
                insertps.setTimestamp(7, this.stringToTimestamp(data.getString("lastModifiedDate")));
                insertps.setString(8, data.getString("lastModifiedBy"));
                insertps.addBatch();
            }
            if (resultSet.size() > 0) {
                insertps.executeBatch();
            }
            result = 1;
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            insertps.close();
            deleteps.close();
        }
        insertps.close();
        deleteps.close();
        return result;
    }
    
    public ArrayList<Building> getBuildingCityLink(final Connection connection, final String city) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Building> data = new ArrayList<Building>();
        try {
            String query = "SELECT * FROM bbclocation_building where City = ? and Active = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, city);
            ps.setBoolean(2, true);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Building building = new Building();
                building.setBuildingID(rs.getInt(1));
                building.setSAPBaseCode(rs.getString(2));
                building.setBuilding(rs.getString(3));
                building.setPostCode(rs.getString(4));
                building.setCity(rs.getString(5));
                building.setCountry(rs.getString(6));
                building.setActive(rs.getBoolean(7));
                building.setCreatedDate(rs.getTimestamp(8));
                building.setCreatedBy(rs.getString(9));
                building.setModifiedDate(rs.getTimestamp(10));
                building.setModifiedBy(rs.getString(11));
                data.add(building);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Location> getLocationCountryLink(final Connection connection, final String countrycode) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Location> data = new ArrayList<Location>();
        try {
            String query = "SELECT DISTINCT(City) FROM bbclocation_building where Country = ? and Active = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, countrycode);
            ps.setBoolean(2, true);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Location location = new Location();
                location.setLocation(rs.getString(1));
                location.setCountry(countrycode);
                data.add(location);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<ServerUsage> getServerUsage(final Connection connection) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<ServerUsage> data = new ArrayList<ServerUsage>();
        try {
            String query = "SELECT * FROM bbclocation_serverusage";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                final ServerUsage serverUsage = new ServerUsage();
                serverUsage.setID(rs.getInt(1));
                serverUsage.setServerID(rs.getInt(2));
                serverUsage.setTotalSize(rs.getInt(3));
                serverUsage.setFreeSpace(rs.getInt(4));
                serverUsage.setCreatedDate(rs.getTimestamp(5));
                serverUsage.setModifiedDate(rs.getTimestamp(6));
                data.add(serverUsage);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Server> getServer(final Connection connection) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Server> data = new ArrayList<Server>();
        try {
            String query = "SELECT * FROM bbclocation_server";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Server server = new Server();
                server.setServerID(rs.getInt(1));
                server.setServerType(rs.getString(2));
                server.setServerName(rs.getString(3));
                server.setGroupName(rs.getString(4));
                server.setActive(rs.getBoolean(5));
                server.setCreatedDate(rs.getTimestamp(6));
                server.setCreatedBy(rs.getString(7));
                server.setModifiedDate(rs.getTimestamp(8));
                server.setModifiedBy(rs.getString(9));
                server.setDoNotAssign(rs.getBoolean(10));
                data.add(server);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Server> getServerByStatus(final Connection connection, final boolean status) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Server> data = new ArrayList<Server>();
        try {
            String query = "SELECT * FROM bbclocation_server where Active = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setBoolean(1, status);
            rs = ps.executeQuery();
            while (rs.next()) {
                final Server server = new Server();
                server.setServerID(rs.getInt(1));
                server.setServerType(rs.getString(2));
                server.setServerName(rs.getString(3));
                server.setGroupName(rs.getString(4));
                server.setActive(rs.getBoolean(5));
                server.setCreatedDate(rs.getTimestamp(6));
                server.setCreatedBy(rs.getString(7));
                server.setModifiedDate(rs.getTimestamp(8));
                server.setModifiedBy(rs.getString(9));
                server.setDoNotAssign(rs.getBoolean(10));
                data.add(server);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<Server> getServerList(final Connection connection, final String servername) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<Server> data = new ArrayList<Server>();
        try {
            String query = "SELECT * FROM bbclocation_server where ServerName like ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + servername + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                final Server server = new Server();
                server.setServerID(rs.getInt(1));
                server.setServerType(rs.getString(2));
                server.setServerName(rs.getString(3));
                server.setGroupName(rs.getString(4));
                server.setActive(rs.getBoolean(5));
                server.setCreatedDate(rs.getTimestamp(6));
                server.setCreatedBy(rs.getString(7));
                server.setModifiedDate(rs.getTimestamp(8));
                server.setModifiedBy(rs.getString(9));
                server.setDoNotAssign(rs.getBoolean(10));
                data.add(server);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public ArrayList<SupportBody> getBuildingSupportbodyLink(final Connection connection, final String buildingid) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        final ArrayList<SupportBody> data = new ArrayList<SupportBody>();
        try {
            String query = "SELECT bbclocation_supportbody.SupportBodyID, bbclocation_supportbody.SupportBodyName, bbclocation_supportbody.SupportBodyDesc, bbclocation_supportbody.Active, bbclocation_supportbody.CreatedDate, bbclocation_supportbody.CreatedBy, bbclocation_supportbody.ModifiedDate, bbclocation_supportbody.ModifiedBy FROM bbclocation_buildingsupportbodylink INNER JOIN bbclocation_supportbody ON bbclocation_buildingsupportbodylink.SupportBodyID=bbclocation_supportbody.SupportBodyID where bbclocation_buildingsupportbodylink.Active = ? and bbclocation_buildingsupportbodylink.BuildingID = ? and bbclocation_supportbody.Active = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setBoolean(1, true);
            ps.setString(2, buildingid);
            ps.setBoolean(3, true);
            rs = ps.executeQuery();
            while (rs.next()) {
                final SupportBody supportBody = new SupportBody();
                supportBody.setSupportBodyID(rs.getInt(1));
                supportBody.setSupportBodyName(rs.getString(2));
                supportBody.setSupportBodyDesc(rs.getString(3));
                supportBody.setActive(rs.getBoolean(4));
                supportBody.setCreatedDate(rs.getTimestamp(5));
                supportBody.setCreatedBy(rs.getString(6));
                supportBody.setModifiedDate(rs.getTimestamp(7));
                supportBody.setModifiedBy(rs.getString(8));
                data.add(supportBody);
            }
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            rs.close();
            ps.close();
        }
        rs.close();
        ps.close();
        return data;
    }
    
    public int createBuilding(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        int result = 0;
        try {
            String query = "INSERT INTO bbclocation_building(SAPBaseCode, Building, PostCode,City, Country, Active, CreatedDate, CreatedBy, ModifiedDate, ModifiedBy, DoNotDisable, BuildingType) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query, 1);
            ps.setString(1, data.getString("SAPBaseCode"));
            ps.setString(2, data.getString("Building"));
            ps.setString(3, data.getString("PostCode"));
            ps.setString(4, data.getString("City"));
            ps.setString(5, data.getString("Country"));
            ps.setBoolean(6, (boolean)data.get("Active"));
            ps.setTimestamp(7, this.stringToTimestamp(data.getString("createdDate")));
            ps.setString(8, data.getString("createdBy"));
            ps.setTimestamp(9, this.stringToTimestamp(data.getString("lastModifiedDate")));
            ps.setString(10, data.getString("lastModifiedBy"));
            ps.setBoolean(11, true);
            ps.setString(12, "NonSAP");
            ps.execute();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            ps.close();
            rs.close();
        }
        ps.close();
        rs.close();
        return result;
    }
    
    public int modifyBuilding(final Connection connection, final JSONObject data) throws Exception {
        PreparedStatement ps = null;
        int result = 0;
        try {
            String query = "UPDATE bbclocation_building set Building = ?, PostCode = ?, City = ?, Country = ?, Active = ?, ModifiedDate = ?, ModifiedBy = ? where BuildingID = ?";
            query = BBCCommonFunctions.convertQueryToDBSpecific(query, connection);
            ps = connection.prepareStatement(query);
            ps.setString(1, data.getString("Building"));
            ps.setString(2, data.getString("PostCode"));
            ps.setString(3, data.getString("City"));
            ps.setString(4, data.getString("Country"));
            ps.setBoolean(5, (boolean)data.get("Active"));
            ps.setTimestamp(6, this.stringToTimestamp(data.getString("lastModifiedDate")));
            ps.setString(7, data.getString("lastModifiedBy"));
            ps.setInt(8, data.getInt("BuildingID"));
            result = ps.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
            throw e;
        }
        finally {
            ps.close();
        }
        ps.close();
        return result;
    }
    
    public Timestamp stringToTimestamp(final String time) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        Date parsedDate = null;
        try {
            parsedDate = dateFormat.parse(time);
        }
        catch (Exception e) {
            BBCLocationServiceDAO.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        return new Timestamp(parsedDate.getTime());
    }
    
    public List<HashMap<String, Object>> convertResultSetToList(final ResultSet rs) throws SQLException {
        final ResultSetMetaData md = rs.getMetaData();
        final int columns = md.getColumnCount();
        final List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        while (rs.next()) {
            final HashMap<String, Object> row = new HashMap<String, Object>(columns);
            for (int i = 1; i <= columns; ++i) {
                row.put(md.getColumnName(i), rs.getObject(i));
            }
            list.add(row);
        }
        return list;
    }
}
