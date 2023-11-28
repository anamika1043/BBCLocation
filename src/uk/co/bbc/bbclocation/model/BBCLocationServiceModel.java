package uk.co.bbc.bbclocation.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.io.InputStream;
import java.util.Properties;
import uk.co.bbc.framework.BBCCommonFunctions;
import org.json.JSONObject;
import uk.co.bbc.bbclocation.dto.ServerUsage;
import uk.co.bbc.bbclocation.dto.Server;
import uk.co.bbc.bbclocation.dto.Location;
import uk.co.bbc.bbclocation.dto.IPAddress;
import uk.co.bbc.bbclocation.dto.Building;
import uk.co.bbc.bbclocation.dto.BuildingServerLink;
import uk.co.bbc.bbclocation.dto.BuildingSupportbodyLink;
import uk.co.bbc.bbclocation.dto.BuildingSupportbodyExceptionLink;
import java.sql.Connection;
import uk.co.bbc.bbclocation.dao.BBCLocationServiceDAO;
import uk.co.bbc.framework.ConnManager;
import uk.co.bbc.bbclocation.dto.SupportBody;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class BBCLocationServiceModel
{
    private String server;
    private String dbserver;
    private static final Logger logger;
    
    static {
        logger = Logger.getLogger(BBCLocationServiceModel.class.getName());
    }
    
    public BBCLocationServiceModel() {
        this.readProperties();
    }
    
    public ArrayList<SupportBody> getSupportBody() throws Exception {
        ArrayList<SupportBody> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getSupportBody(connection);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<BuildingSupportbodyExceptionLink> getSupportBodyExceptionByStatus(final String status) throws Exception {
        ArrayList<BuildingSupportbodyExceptionLink> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            if (status.equalsIgnoreCase("Enabled") || status.equalsIgnoreCase("Active")) {
                data = obj.getSupportBodyExceptionByStatus(connection, true);
            }
            else if (status.equalsIgnoreCase("Disabled") || status.equalsIgnoreCase("Inactive")) {
                data = obj.getSupportBodyExceptionByStatus(connection, false);
            }
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<SupportBody> getSupportBodyByStatus(final String status) throws Exception {
        ArrayList<SupportBody> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            if (status.equalsIgnoreCase("Enabled") || status.equalsIgnoreCase("Active")) {
                data = obj.getSupportBodyByStatus(connection, true);
            }
            else if (status.equalsIgnoreCase("Disabled") || status.equalsIgnoreCase("Inactive")) {
                data = obj.getSupportBodyByStatus(connection, false);
            }
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<BuildingSupportbodyLink> getBuildingtoSupportBody() throws Exception {
        ArrayList<BuildingSupportbodyLink> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getBuildingtoSupportBody(connection);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<BuildingServerLink> getBuildingtoServer() throws Exception {
        ArrayList<BuildingServerLink> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getBuildingtoServer(connection);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Building> getBuilding() throws Exception {
        ArrayList<Building> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getBuilding(connection);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Building> getBuildingByDay(final String day) throws Exception {
        ArrayList<Building> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            if (day.equalsIgnoreCase("today")) {
                data = obj.getBuildingByDay(connection, "bbclocation_building");
            }
            else if (day.equalsIgnoreCase("yesterday")) {
                data = obj.getBuildingByDay(connection, "bbclocation_building_backup");
            }
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Building> getBuildingByType(final String type) throws Exception {
        ArrayList<Building> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            if (type.equalsIgnoreCase("SAP") || type.equalsIgnoreCase("Staff")) {
                data = obj.getBuildingByType(connection, "SAP");
            }
            else {
                data = obj.getBuildingByType(connection, "NonSAP");
            }
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Building> getBuildingByID(final String id) throws Exception {
        ArrayList<Building> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getBuildingByID(connection, id);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Building> getBuilding(final String status) throws Exception {
        ArrayList<Building> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            if (status.equalsIgnoreCase("Disabled")) {
                data = obj.getBuilding(connection, false);
            }
            else {
                data = obj.getBuilding(connection, true);
            }
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<IPAddress> getAllIPAddress() throws Exception {
        ArrayList<IPAddress> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getAllIPAddress(connection);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Location> getLocation() throws Exception {
        ArrayList<Location> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getLocation(connection);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Location> getLocation(final String status) throws Exception {
        ArrayList<Location> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getLocation(connection, status);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Server> getServer() throws Exception {
        ArrayList<Server> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getServer(connection);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Server> getServerByStatus(final String status) throws Exception {
        ArrayList<Server> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            if (status.equalsIgnoreCase("Enabled") || status.equalsIgnoreCase("Active")) {
                data = obj.getServerByStatus(connection, true);
            }
            else if (status.equalsIgnoreCase("Disabled") || status.equalsIgnoreCase("Inactive")) {
                data = obj.getServerByStatus(connection, false);
            }
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<ServerUsage> getServerUsage() throws Exception {
        ArrayList<ServerUsage> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getServerUsage(connection);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Building> getSupportBodyBuildingLink(final String supportbodyid) throws Exception {
        ArrayList<Building> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getSupportBodyBuildingLink(connection, supportbodyid);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<BuildingSupportbodyExceptionLink> getSupportBodyBuildingExceptionLink(final String supportbodyid) throws Exception {
        ArrayList<BuildingSupportbodyExceptionLink> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getSupportBodyBuildingExceptionLink(connection, supportbodyid);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Building> getServerBuildingLink(final String serverid) throws Exception {
        ArrayList<Building> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getServerBuildingLink(connection, serverid);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<SupportBody> getBuildingSupportbodyLink(final String buildingid) throws Exception {
        ArrayList<SupportBody> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getBuildingSupportbodyLink(connection, buildingid);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<SupportBody> getSupportbody(final String name) throws Exception {
        ArrayList<SupportBody> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getSupportbody(connection, name);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Server> getServerList(final String servername) throws Exception {
        ArrayList<Server> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getServerList(connection, servername);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public int createServer(final JSONObject input) throws Exception {
        Connection connection = null;
        int result;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            result = obj.createServer(connection, input);
            input.put("ServerID", result);
            obj.createBuildingServerLink(connection, input);
            connection.commit();
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            result = 0;
            connection.rollback();
            return result;
        }
        finally {
            connection.close();
        }
        connection.close();
        return result;
    }
    
    public int modifyServer(final JSONObject input) throws Exception {
        int result = 0;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            obj.modifyServer(connection, input);
            obj.modifyBuildingServerLink(connection, input);
            connection.commit();
            result = 1;
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            result = 0;
            connection.rollback();
            return result;
        }
        finally {
            connection.close();
        }
        connection.close();
        return result;
    }
    
    public int createSupportBody(final JSONObject input) throws Exception {
        Connection connection = null;
        int result;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            result = obj.createSupportBody(connection, input);
            input.put("SupportBodyID", result);
            obj.createBuildingSupportBodyLink(connection, input);
            connection.commit();
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            result = 0;
            connection.rollback();
            return result;
        }
        finally {
            connection.close();
        }
        connection.close();
        return result;
    }
    
    public int modifySupportBody(final JSONObject input) throws Exception {
        int result = 0;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            obj.modifySupportBody(connection, input);
            obj.modifyBuildingSupportBodyLink(connection, input);
            connection.commit();
            result = 1;
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            result = 0;
            connection.rollback();
            return result;
        }
        finally {
            connection.close();
        }
        connection.close();
        return result;
    }
    
    public int createSupportBodyException(final JSONObject input) throws Exception {
        Connection connection = null;
        int result;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            final String supportbodyid = input.getString("SupportBodyID");
            if (input.getString("SupportBodyID") == null || input.getString("SupportBodyID").isEmpty()) {
                result = obj.createSupportBody(connection, input);
                input.put("SupportBodyID", result);
            }
            else {
                obj.modifySupportBody(connection, input);
                result = Integer.parseInt(supportbodyid);
            }
            obj.createBuildingSupportBodyExceptionLink(connection, input);
            connection.commit();
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            result = 0;
            connection.rollback();
            return result;
        }
        finally {
            connection.close();
        }
        connection.close();
        return result;
    }
    
    public int modifySupportBodyException(final JSONObject input) throws Exception {
        int result = 0;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            obj.modifySupportBody(connection, input);
            obj.modifyBuildingSupportBodyExceptionLink(connection, input);
            connection.commit();
            result = 1;
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            result = 0;
            connection.rollback();
            return result;
        }
        finally {
            connection.close();
        }
        connection.close();
        return result;
    }
    
    public ArrayList<Location> getLocationCountryLink(final String countrycode) throws Exception {
        ArrayList<Location> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getLocationCountryLink(connection, countrycode);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public ArrayList<Building> getBuildingCityLink(final String city) throws Exception {
        ArrayList<Building> data = null;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            data = obj.getBuildingCityLink(connection, city);
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            return data;
        }
        finally {
            connection.close();
        }
        connection.close();
        return data;
    }
    
    public int createBuilding(final JSONObject input) throws Exception {
        Connection connection = null;
        int result;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            final int oac = BBCCommonFunctions.generateID(connection, "bbclocation_building", "SAPBaseCode");
            input.put("SAPBaseCode", (Object)Integer.toString(oac));
            result = obj.createBuilding(connection, input);
            connection.commit();
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            result = 0;
            connection.rollback();
            return result;
        }
        finally {
            connection.close();
        }
        connection.close();
        return result;
    }
    
    public int modifyBuilding(final JSONObject input) throws Exception {
        int result = 0;
        Connection connection = null;
        try {
            connection = ConnManager.getTransactionConnection(this.dbserver, "bbclocation", this.server);
            final BBCLocationServiceDAO obj = new BBCLocationServiceDAO();
            obj.modifyBuilding(connection, input);
            connection.commit();
            result = 1;
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
            result = 0;
            connection.rollback();
            return result;
        }
        finally {
            connection.close();
        }
        connection.close();
        return result;
    }
    
    public void readProperties() {
        final Properties moveProps = new Properties();
        final InputStream stream = this.getClass().getResourceAsStream("/bbclocation.properties");
        try {
            moveProps.load(stream);
            stream.close();
        }
        catch (Exception e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        this.server = moveProps.getProperty("server");
        this.dbserver = moveProps.getProperty("dbserver");
    }
    
    public Date convertDate(final String text) {
        final DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date = new java.util.Date();
        try {
            date = format.parse(text);
        }
        catch (ParseException e) {
            BBCLocationServiceModel.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        final Date sqlDate = new Date(date.getTime());
        return sqlDate;
    }
}
