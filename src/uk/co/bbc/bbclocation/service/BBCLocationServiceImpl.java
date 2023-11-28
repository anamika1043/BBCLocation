package uk.co.bbc.bbclocation.service;

import javax.ws.rs.PUT;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import org.json.JSONObject;
import uk.co.bbc.bbclocation.dto.IPAddress;
import uk.co.bbc.bbclocation.dto.BuildingServerLink;
import uk.co.bbc.bbclocation.dto.BuildingSupportbodyLink;
import uk.co.bbc.bbclocation.dto.BuildingSupportbodyExceptionLink;
import uk.co.bbc.bbclocation.dto.SupportBody;
import uk.co.bbc.bbclocation.dto.ServerUsage;
import uk.co.bbc.bbclocation.dto.Server;
import uk.co.bbc.bbclocation.dto.Location;
import java.net.URLDecoder;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import org.json.JSONException;
import java.util.Collection;
import uk.co.bbc.bbclocation.model.BBCLocationServiceModel;
import org.json.JSONArray;
import uk.co.bbc.bbclocation.dto.Building;
import java.util.ArrayList;
import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;
import javax.ws.rs.Path;

@Path("/")
public class BBCLocationServiceImpl
{
    private static final Logger logger;
    
    static {
        logger = Logger.getLogger(BBCLocationServiceImpl.class.getName());
    }
    
    @Path("/buildings")
    @GET
    @Produces({ "application/json" })
    public Response getBuilding() throws JSONException {
        ArrayList<Building> data = new ArrayList<Building>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getBuilding();
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/buildings/status/{status}")
    @GET
    @Produces({ "application/json" })
    public Response getBuilding(@PathParam("status") final String status) throws JSONException {
        ArrayList<Building> data = new ArrayList<Building>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getBuilding(URLDecoder.decode(status, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/buildings/type/{type}")
    @GET
    @Produces({ "application/json" })
    public Response getBuildingByType(@PathParam("type") final String type) throws JSONException {
        ArrayList<Building> data = new ArrayList<Building>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getBuildingByType(URLDecoder.decode(type, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/buildings/day/{day}")
    @GET
    @Produces({ "application/json" })
    public Response getBuildingByDay(@PathParam("day") final String day) throws JSONException {
        ArrayList<Building> data = new ArrayList<Building>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getBuildingByDay(URLDecoder.decode(day, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/building/id/{id}")
    @GET
    @Produces({ "application/json" })
    public Response getBuildingByID(@PathParam("id") final String id) throws JSONException {
        ArrayList<Building> data = new ArrayList<Building>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getBuildingByID(URLDecoder.decode(id, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/locations")
    @GET
    @Produces({ "application/json" })
    public Response getLocation() throws JSONException {
        ArrayList<Location> data = new ArrayList<Location>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getLocation();
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/locations/{status}")
    @GET
    @Produces({ "application/json" })
    public Response getLocation(@PathParam("status") final String status) throws JSONException {
        ArrayList<Location> data = new ArrayList<Location>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getLocation(URLDecoder.decode(status, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/location/{countrycode}")
    @GET
    @Produces({ "application/json" })
    public Response getLocationCountryLink(@PathParam("countrycode") final String countrycode) throws JSONException {
        ArrayList<Location> data = new ArrayList<Location>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getLocationCountryLink(URLDecoder.decode(countrycode, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/building/{city}")
    @GET
    @Produces({ "application/json" })
    public Response getBuildingCityLink(@PathParam("city") final String city) throws JSONException {
        ArrayList<Building> data = new ArrayList<Building>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getBuildingCityLink(URLDecoder.decode(city, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/serverbuilding/{serverid}")
    @GET
    @Produces({ "application/json" })
    public Response getServerBuildingLink(@PathParam("serverid") final String serverid) throws JSONException {
        ArrayList<Building> data = new ArrayList<Building>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getServerBuildingLink(URLDecoder.decode(serverid, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/server/{servername}")
    @GET
    @Produces({ "application/json" })
    public Response getServerDetails(@PathParam("servername") final String servername) throws JSONException {
        ArrayList<Server> data = new ArrayList<Server>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getServerList(URLDecoder.decode(servername, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/servers")
    @GET
    @Produces({ "application/json" })
    public Response getServer() throws JSONException {
        ArrayList<Server> data = new ArrayList<Server>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getServer();
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/servers/status/{status}")
    @GET
    @Produces({ "application/json" })
    public Response getServerByStatus(@PathParam("status") final String status) throws JSONException {
        ArrayList<Server> data = new ArrayList<Server>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getServerByStatus(URLDecoder.decode(status, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/serverusage/")
    @GET
    @Produces({ "application/json" })
    public Response getServerUsage() throws JSONException {
        ArrayList<ServerUsage> data = new ArrayList<ServerUsage>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getServerUsage();
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/supportbody/{buildingid}")
    @GET
    @Produces({ "application/json" })
    public Response getLocationSupportbodyLink(@PathParam("buildingid") final String buildingid) throws JSONException {
        ArrayList<SupportBody> data = new ArrayList<SupportBody>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getBuildingSupportbodyLink(URLDecoder.decode(buildingid, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/supportbody/name/{name}")
    @GET
    @Produces({ "application/json" })
    public Response getSupportbody(@PathParam("name") final String name) throws JSONException {
        ArrayList<SupportBody> data = new ArrayList<SupportBody>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getSupportbody(URLDecoder.decode(name, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/supportbodybuilding/{supportbodyid}")
    @GET
    @Produces({ "application/json" })
    public Response getSupportBodyBuildingLink(@PathParam("supportbodyid") final String supportbodyid) throws JSONException {
        ArrayList<Building> data = new ArrayList<Building>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getSupportBodyBuildingLink(URLDecoder.decode(supportbodyid, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/supportbodyexception/id/{supportbodyid}")
    @GET
    @Produces({ "application/json" })
    public Response getSupportBodyBuildingExceptionLink(@PathParam("supportbodyid") final String supportbodyid) throws JSONException {
        ArrayList<BuildingSupportbodyExceptionLink> data = new ArrayList<BuildingSupportbodyExceptionLink>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getSupportBodyBuildingExceptionLink(URLDecoder.decode(supportbodyid, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/supportbodies")
    @GET
    @Produces({ "application/json" })
    public Response getSupportBody() throws JSONException {
        ArrayList<SupportBody> data = new ArrayList<SupportBody>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getSupportBody();
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/supportbodies/status/{status}")
    @GET
    @Produces({ "application/json" })
    public Response getSupportBodyByStatus(@PathParam("status") final String status) throws JSONException {
        ArrayList<SupportBody> data = new ArrayList<SupportBody>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getSupportBodyByStatus(URLDecoder.decode(status, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/supportbodyexception/status/{status}")
    @GET
    @Produces({ "application/json" })
    public Response getSupportBodyExceptionByStatus(@PathParam("status") final String status) throws JSONException {
        ArrayList<BuildingSupportbodyExceptionLink> data = new ArrayList<BuildingSupportbodyExceptionLink>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getSupportBodyExceptionByStatus(URLDecoder.decode(status, "UTF-8"));
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/buildingtosupportbody")
    @GET
    @Produces({ "application/json" })
    public Response getBuildingtoSupportBody() throws JSONException {
        ArrayList<BuildingSupportbodyLink> data = new ArrayList<BuildingSupportbodyLink>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getBuildingtoSupportBody();
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/buildingtoserver")
    @GET
    @Produces({ "application/json" })
    public Response getBuildingtoServer() throws JSONException {
        ArrayList<BuildingServerLink> data = new ArrayList<BuildingServerLink>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getBuildingtoServer();
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @Path("/ipaddress")
    @GET
    @Produces({ "application/json" })
    public Response getAllIPAddress() throws JSONException {
        ArrayList<IPAddress> data = new ArrayList<IPAddress>();
        JSONArray jsonArray = new JSONArray();
        try {
            data = new BBCLocationServiceModel().getAllIPAddress();
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        if (!data.isEmpty()) {
            jsonArray = new JSONArray((Collection)data);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)jsonArray.toString(1)).build();
    }
    
    @POST
    @Path("/create/server/")
    @Produces({ "application/json" })
    @Consumes({ "application/json" })
    public Response createServer(final String request) throws JSONException {
        int result = 0;
        try {
            final BBCLocationServiceModel model = new BBCLocationServiceModel();
            final JSONObject requestobj = new JSONObject(request);
            result = model.createServer(requestobj);
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)Integer.toString(result)).build();
    }
    
    @PUT
    @Path("/modify/server/")
    @Produces({ "application/json" })
    @Consumes({ "application/json" })
    public Response modifyServer(final String request) throws JSONException {
        int result = 0;
        try {
            final BBCLocationServiceModel model = new BBCLocationServiceModel();
            final JSONObject requestobj = new JSONObject(request);
            result = model.modifyServer(requestobj);
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)Integer.toString(result)).build();
    }
    
    @POST
    @Path("/create/supportbody/")
    @Produces({ "application/json" })
    @Consumes({ "application/json" })
    public Response createSupportBody(final String request) throws JSONException {
        int result = 0;
        try {
            final BBCLocationServiceModel model = new BBCLocationServiceModel();
            final JSONObject requestobj = new JSONObject(request);
            result = model.createSupportBody(requestobj);
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)Integer.toString(result)).build();
    }
    
    @PUT
    @Path("/modify/supportbody/")
    @Produces({ "application/json" })
    @Consumes({ "application/json" })
    public Response modifySupportBody(final String request) throws JSONException {
        int result = 0;
        try {
            final BBCLocationServiceModel model = new BBCLocationServiceModel();
            final JSONObject requestobj = new JSONObject(request);
            result = model.modifySupportBody(requestobj);
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)Integer.toString(result)).build();
    }
    
    @POST
    @Path("/create/supportbodyexception/")
    @Produces({ "application/json" })
    @Consumes({ "application/json" })
    public Response createSupportBodyException(final String request) throws JSONException {
        int result = 0;
        try {
            final BBCLocationServiceModel model = new BBCLocationServiceModel();
            final JSONObject requestobj = new JSONObject(request);
            result = model.createSupportBodyException(requestobj);
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)Integer.toString(result)).build();
    }
    
    @PUT
    @Path("/modify/supportbodyexception/")
    @Produces({ "application/json" })
    @Consumes({ "application/json" })
    public Response modifySupportBodyException(final String request) throws JSONException {
        int result = 0;
        try {
            final BBCLocationServiceModel model = new BBCLocationServiceModel();
            final JSONObject requestobj = new JSONObject(request);
            result = model.modifySupportBodyException(requestobj);
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)Integer.toString(result)).build();
    }
    
    @POST
    @Path("/create/building/")
    @Produces({ "application/json" })
    @Consumes({ "application/json" })
    public Response createBuilding(final String request) throws JSONException {
        int result = 0;
        try {
            final BBCLocationServiceModel model = new BBCLocationServiceModel();
            final JSONObject requestobj = new JSONObject(request);
            result = model.createBuilding(requestobj);
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)Integer.toString(result)).build();
    }
    
    @PUT
    @Path("/modify/building/")
    @Produces({ "application/json" })
    @Consumes({ "application/json" })
    public Response modifyBuilding(final String request) throws JSONException {
        int result = 0;
        try {
            final BBCLocationServiceModel model = new BBCLocationServiceModel();
            final JSONObject requestobj = new JSONObject(request);
            result = model.modifyBuilding(requestobj);
        }
        catch (Exception e) {
            BBCLocationServiceImpl.logger.error((Object)"Error occurred: ", (Throwable)e);
        }
        return Response.status(200).header("Access-Control-Allow-Headers", (Object)"Content-Type").header("Access-Control-Allow-Methods", (Object)"GET, POST, PUT, OPTIONS").header("Access-Control-Allow-Origin", (Object)"*").entity((Object)Integer.toString(result)).build();
    }
}
