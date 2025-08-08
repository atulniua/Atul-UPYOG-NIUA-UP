package org.upyog.gis.util;

/**
 * Constants used throughout the GIS service
 */
public class GISConstants {

    // Module names
    public static final String MODULE_PROPERTY = "property";

    // Response formats
    public static final String RESPONSE_FORMAT_GEOJSON = "geojson";
    public static final String RESPONSE_FORMAT_WMS = "wms";
    public static final String RESPONSE_FORMAT_WFS = "wfs";

    // Geometry types
    public static final String GEOMETRY_TYPE_POINT = "Point";
    public static final String GEOMETRY_TYPE_POLYGON = "Polygon";
    public static final String GEOMETRY_TYPE_LINESTRING = "LineString";

    // HTTP Configuration
    public static final String HTTP_HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HTTP_MEDIA_TYPE_JSON = "application/json";
    
    // Query Parameters
    public static final String QUERY_PARAM_TENANT_ID = "tenantId";
    public static final String QUERY_PARAM_INCLUDE_GEOMETRY = "includeGeometry";
    public static final String QUERY_PARAM_INCLUDE_GEOMETRY_VALUE = "true";
    
    // GeoJSON Constants
    public static final String GEOJSON_TYPE_FEATURE_COLLECTION = "FeatureCollection";
    public static final String GEOJSON_TYPE_FEATURE = "Feature";
    
    // WKT Geometry Patterns
    public static final String WKT_POINT_PATTERN = "POINT\\s*\\(\\s*([+-]?\\d*\\.?\\d+)\\s+([+-]?\\d*\\.?\\d+)\\s*\\)";
    public static final String WKT_POLYGON_PATTERN = "POLYGON\\s*\\(\\s*\\(\\s*([^)]+)\\s*\\)\\s*\\)";
    
    // Error Messages
    public static final String ERROR_FETCHING_SPATIAL_DATA = "Failed to fetch spatial data from property service";
    public static final String ERROR_PARSING_WKT = "Error parsing WKT geometry";
    public static final String ERROR_BUILDING_FEATURE = "Error building feature for entity";
    public static final String ERROR_UNSUPPORTED_GEOMETRY = "Unsupported WKT geometry type";
    
    // Log Messages
    public static final String LOG_FETCHING_SPATIAL_DATA = "Fetching spatial data for {} module with criteria: {}";
    public static final String LOG_CALLING_SERVICE = "Calling {} service URL: {} with request body: {}";
    public static final String LOG_BUILDING_GEOJSON = "Building GeoJSON response for {} spatial entities";
    public static final String LOG_NO_GEOMETRY_AVAILABLE = "No geometry available for entity: {}";
    public static final String LOG_UNSUPPORTED_GEOMETRY_TYPE = "Unsupported WKT geometry type: {}";

}