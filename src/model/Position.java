package model;

public class Position {

    private int _id;
    private String key;
    private String name;
    private String fullName;
    private String iataAirportCode;
    private String type;
    private String country;
    private GeoPosition geo_position;
    private int locationId;
    private boolean inEurope;
    private String countryCode;
    private boolean coreCountry;
    private double distance;

    public Position(int _id, String key, String name, String fullName, String iataAirportCode, String type, String country, GeoPosition geoPosition, int locationId, boolean inEurope,
            String countryCode, boolean coreCountry, double distance) {
        super();
        this._id = _id;
        this.key = key;
        this.name = name;
        this.fullName = fullName;
        this.iataAirportCode = iataAirportCode;
        this.type = type;
        this.country = country;
        this.geo_position = geoPosition;
        this.locationId = locationId;
        this.inEurope = inEurope;
        this.countryCode = countryCode;
        this.coreCountry = coreCountry;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Position [_id=" + _id + ", key=" + key + ", name=" + name + ", fullName=" + fullName + ", iataAirportCode=" + iataAirportCode + ", type=" + type + ", country=" + country
                + ", geoPosition=" + geo_position + ", locationId=" + locationId + ", inEurope=" + inEurope + ", countryCode=" + countryCode + ", coreCountry=" + coreCountry + ", distance=" + distance
                + "]";
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIataAirportCode() {
        return iataAirportCode;
    }

    public void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public GeoPosition getGeoPosition() {
        return geo_position;
    }

    public void setGeoPosition(GeoPosition geoPosition) {
        this.geo_position = geoPosition;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public boolean isInEurope() {
        return inEurope;
    }

    public void setInEurope(boolean inEurope) {
        this.inEurope = inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    
    
    

}
