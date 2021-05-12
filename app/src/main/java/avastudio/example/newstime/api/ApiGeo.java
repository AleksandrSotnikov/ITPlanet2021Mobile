package avastudio.example.newstime.api;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ApiGeo implements Serializable, Parcelable {

    public final static Creator<ApiGeo> CREATOR = new Creator<ApiGeo>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ApiGeo createFromParcel(android.os.Parcel in) {
            return new ApiGeo(in);
        }

        public ApiGeo[] newArray(int size) {
            return (new ApiGeo[size]);
        }

    };
    private final static long serialVersionUID = -3792911698130841281L;
    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("continent")
    @Expose
    private String continent;
    @SerializedName("continent_code")
    @Expose
    private String continentCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("country_flag")
    @Expose
    private String countryFlag;
    @SerializedName("country_capital")
    @Expose
    private String countryCapital;
    @SerializedName("country_phone")
    @Expose
    private String countryPhone;
    @SerializedName("country_neighbours")
    @Expose
    private String countryNeighbours;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("asn")
    @Expose
    private String asn;
    @SerializedName("org")
    @Expose
    private String org;
    @SerializedName("isp")
    @Expose
    private String isp;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("timezone_name")
    @Expose
    private String timezoneName;
    @SerializedName("timezone_dstOffset")
    @Expose
    private String timezoneDstOffset;
    @SerializedName("timezone_gmtOffset")
    @Expose
    private String timezoneGmtOffset;
    @SerializedName("timezone_gmt")
    @Expose
    private String timezoneGmt;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("currency_symbol")
    @Expose
    private String currencySymbol;
    @SerializedName("currency_rates")
    @Expose
    private String currencyRates;
    @SerializedName("currency_plural")
    @Expose
    private String currencyPlural;
    @SerializedName("completed_requests")
    @Expose
    private Long completedRequests;

    protected ApiGeo(android.os.Parcel in) {
        this.ip = ((String) in.readValue((String.class.getClassLoader())));
        this.success = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.continent = ((String) in.readValue((String.class.getClassLoader())));
        this.continentCode = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.countryCode = ((String) in.readValue((String.class.getClassLoader())));
        this.countryFlag = ((String) in.readValue((String.class.getClassLoader())));
        this.countryCapital = ((String) in.readValue((String.class.getClassLoader())));
        this.countryPhone = ((String) in.readValue((String.class.getClassLoader())));
        this.countryNeighbours = ((String) in.readValue((String.class.getClassLoader())));
        this.region = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.latitude = ((String) in.readValue((String.class.getClassLoader())));
        this.longitude = ((String) in.readValue((String.class.getClassLoader())));
        this.asn = ((String) in.readValue((String.class.getClassLoader())));
        this.org = ((String) in.readValue((String.class.getClassLoader())));
        this.isp = ((String) in.readValue((String.class.getClassLoader())));
        this.timezone = ((String) in.readValue((String.class.getClassLoader())));
        this.timezoneName = ((String) in.readValue((String.class.getClassLoader())));
        this.timezoneDstOffset = ((String) in.readValue((String.class.getClassLoader())));
        this.timezoneGmtOffset = ((String) in.readValue((String.class.getClassLoader())));
        this.timezoneGmt = ((String) in.readValue((String.class.getClassLoader())));
        this.currency = ((String) in.readValue((String.class.getClassLoader())));
        this.currencyCode = ((String) in.readValue((String.class.getClassLoader())));
        this.currencySymbol = ((String) in.readValue((String.class.getClassLoader())));
        this.currencyRates = ((String) in.readValue((String.class.getClassLoader())));
        this.currencyPlural = ((String) in.readValue((String.class.getClassLoader())));
        this.completedRequests = ((Long) in.readValue((Long.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public ApiGeo() {
    }

    /**
     * @param continent
     * @param country
     * @param city
     * @param timezone
     * @param latitude
     * @param isp
     * @param type
     * @param timezoneDstOffset
     * @param timezoneGmt
     * @param countryPhone
     * @param countryFlag
     * @param countryCode
     * @param currency
     * @param continentCode
     * @param longitude
     * @param currencyRates
     * @param org
     * @param ip
     * @param currencySymbol
     * @param countryNeighbours
     * @param countryCapital
     * @param completedRequests
     * @param timezoneGmtOffset
     * @param success
     * @param timezoneName
     * @param currencyPlural
     * @param region
     * @param asn
     * @param currencyCode
     */
    public ApiGeo(String ip, Boolean success, String type, String continent, String continentCode, String country, String countryCode, String countryFlag, String countryCapital, String countryPhone, String countryNeighbours, String region, String city, String latitude, String longitude, String asn, String org, String isp, String timezone, String timezoneName, String timezoneDstOffset, String timezoneGmtOffset, String timezoneGmt, String currency, String currencyCode, String currencySymbol, String currencyRates, String currencyPlural, Long completedRequests) {
        super();
        this.ip = ip;
        this.success = success;
        this.type = type;
        this.continent = continent;
        this.continentCode = continentCode;
        this.country = country;
        this.countryCode = countryCode;
        this.countryFlag = countryFlag;
        this.countryCapital = countryCapital;
        this.countryPhone = countryPhone;
        this.countryNeighbours = countryNeighbours;
        this.region = region;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.asn = asn;
        this.org = org;
        this.isp = isp;
        this.timezone = timezone;
        this.timezoneName = timezoneName;
        this.timezoneDstOffset = timezoneDstOffset;
        this.timezoneGmtOffset = timezoneGmtOffset;
        this.timezoneGmt = timezoneGmt;
        this.currency = currency;
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
        this.currencyRates = currencyRates;
        this.currencyPlural = currencyPlural;
        this.completedRequests = completedRequests;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ApiGeo withIp(String ip) {
        this.ip = ip;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ApiGeo withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ApiGeo withType(String type) {
        this.type = type;
        return this;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public ApiGeo withContinent(String continent) {
        this.continent = continent;
        return this;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public ApiGeo withContinentCode(String continentCode) {
        this.continentCode = continentCode;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ApiGeo withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public ApiGeo withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public ApiGeo withCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
        return this;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public ApiGeo withCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
        return this;
    }

    public String getCountryPhone() {
        return countryPhone;
    }

    public void setCountryPhone(String countryPhone) {
        this.countryPhone = countryPhone;
    }

    public ApiGeo withCountryPhone(String countryPhone) {
        this.countryPhone = countryPhone;
        return this;
    }

    public String getCountryNeighbours() {
        return countryNeighbours;
    }

    public void setCountryNeighbours(String countryNeighbours) {
        this.countryNeighbours = countryNeighbours;
    }

    public ApiGeo withCountryNeighbours(String countryNeighbours) {
        this.countryNeighbours = countryNeighbours;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ApiGeo withRegion(String region) {
        this.region = region;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ApiGeo withCity(String city) {
        this.city = city;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public ApiGeo withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ApiGeo withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public ApiGeo withAsn(String asn) {
        this.asn = asn;
        return this;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public ApiGeo withOrg(String org) {
        this.org = org;
        return this;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public ApiGeo withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ApiGeo withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public String getTimezoneName() {
        return timezoneName;
    }

    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    public ApiGeo withTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
        return this;
    }

    public String getTimezoneDstOffset() {
        return timezoneDstOffset;
    }

    public void setTimezoneDstOffset(String timezoneDstOffset) {
        this.timezoneDstOffset = timezoneDstOffset;
    }

    public ApiGeo withTimezoneDstOffset(String timezoneDstOffset) {
        this.timezoneDstOffset = timezoneDstOffset;
        return this;
    }

    public String getTimezoneGmtOffset() {
        return timezoneGmtOffset;
    }

    public void setTimezoneGmtOffset(String timezoneGmtOffset) {
        this.timezoneGmtOffset = timezoneGmtOffset;
    }

    public ApiGeo withTimezoneGmtOffset(String timezoneGmtOffset) {
        this.timezoneGmtOffset = timezoneGmtOffset;
        return this;
    }

    public String getTimezoneGmt() {
        return timezoneGmt;
    }

    public void setTimezoneGmt(String timezoneGmt) {
        this.timezoneGmt = timezoneGmt;
    }

    public ApiGeo withTimezoneGmt(String timezoneGmt) {
        this.timezoneGmt = timezoneGmt;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ApiGeo withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public ApiGeo withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public ApiGeo withCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
        return this;
    }

    public String getCurrencyRates() {
        return currencyRates;
    }

    public void setCurrencyRates(String currencyRates) {
        this.currencyRates = currencyRates;
    }

    public ApiGeo withCurrencyRates(String currencyRates) {
        this.currencyRates = currencyRates;
        return this;
    }

    public String getCurrencyPlural() {
        return currencyPlural;
    }

    public void setCurrencyPlural(String currencyPlural) {
        this.currencyPlural = currencyPlural;
    }

    public ApiGeo withCurrencyPlural(String currencyPlural) {
        this.currencyPlural = currencyPlural;
        return this;
    }

    public Long getCompletedRequests() {
        return completedRequests;
    }

    public void setCompletedRequests(Long completedRequests) {
        this.completedRequests = completedRequests;
    }

    public ApiGeo withCompletedRequests(Long completedRequests) {
        this.completedRequests = completedRequests;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiGeo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ip");
        sb.append('=');
        sb.append(((this.ip == null) ? "<null>" : this.ip));
        sb.append(',');
        sb.append("success");
        sb.append('=');
        sb.append(((this.success == null) ? "<null>" : this.success));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("continent");
        sb.append('=');
        sb.append(((this.continent == null) ? "<null>" : this.continent));
        sb.append(',');
        sb.append("continentCode");
        sb.append('=');
        sb.append(((this.continentCode == null) ? "<null>" : this.continentCode));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null) ? "<null>" : this.country));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null) ? "<null>" : this.countryCode));
        sb.append(',');
        sb.append("countryFlag");
        sb.append('=');
        sb.append(((this.countryFlag == null) ? "<null>" : this.countryFlag));
        sb.append(',');
        sb.append("countryCapital");
        sb.append('=');
        sb.append(((this.countryCapital == null) ? "<null>" : this.countryCapital));
        sb.append(',');
        sb.append("countryPhone");
        sb.append('=');
        sb.append(((this.countryPhone == null) ? "<null>" : this.countryPhone));
        sb.append(',');
        sb.append("countryNeighbours");
        sb.append('=');
        sb.append(((this.countryNeighbours == null) ? "<null>" : this.countryNeighbours));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null) ? "<null>" : this.region));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null) ? "<null>" : this.city));
        sb.append(',');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null) ? "<null>" : this.latitude));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null) ? "<null>" : this.longitude));
        sb.append(',');
        sb.append("asn");
        sb.append('=');
        sb.append(((this.asn == null) ? "<null>" : this.asn));
        sb.append(',');
        sb.append("org");
        sb.append('=');
        sb.append(((this.org == null) ? "<null>" : this.org));
        sb.append(',');
        sb.append("isp");
        sb.append('=');
        sb.append(((this.isp == null) ? "<null>" : this.isp));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null) ? "<null>" : this.timezone));
        sb.append(',');
        sb.append("timezoneName");
        sb.append('=');
        sb.append(((this.timezoneName == null) ? "<null>" : this.timezoneName));
        sb.append(',');
        sb.append("timezoneDstOffset");
        sb.append('=');
        sb.append(((this.timezoneDstOffset == null) ? "<null>" : this.timezoneDstOffset));
        sb.append(',');
        sb.append("timezoneGmtOffset");
        sb.append('=');
        sb.append(((this.timezoneGmtOffset == null) ? "<null>" : this.timezoneGmtOffset));
        sb.append(',');
        sb.append("timezoneGmt");
        sb.append('=');
        sb.append(((this.timezoneGmt == null) ? "<null>" : this.timezoneGmt));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null) ? "<null>" : this.currency));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null) ? "<null>" : this.currencyCode));
        sb.append(',');
        sb.append("currencySymbol");
        sb.append('=');
        sb.append(((this.currencySymbol == null) ? "<null>" : this.currencySymbol));
        sb.append(',');
        sb.append("currencyRates");
        sb.append('=');
        sb.append(((this.currencyRates == null) ? "<null>" : this.currencyRates));
        sb.append(',');
        sb.append("currencyPlural");
        sb.append('=');
        sb.append(((this.currencyPlural == null) ? "<null>" : this.currencyPlural));
        sb.append(',');
        sb.append("completedRequests");
        sb.append('=');
        sb.append(((this.completedRequests == null) ? "<null>" : this.completedRequests));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.continent == null) ? 0 : this.continent.hashCode()));
        result = ((result * 31) + ((this.country == null) ? 0 : this.country.hashCode()));
        result = ((result * 31) + ((this.city == null) ? 0 : this.city.hashCode()));
        result = ((result * 31) + ((this.timezone == null) ? 0 : this.timezone.hashCode()));
        result = ((result * 31) + ((this.latitude == null) ? 0 : this.latitude.hashCode()));
        result = ((result * 31) + ((this.isp == null) ? 0 : this.isp.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.timezoneDstOffset == null) ? 0 : this.timezoneDstOffset.hashCode()));
        result = ((result * 31) + ((this.timezoneGmt == null) ? 0 : this.timezoneGmt.hashCode()));
        result = ((result * 31) + ((this.countryPhone == null) ? 0 : this.countryPhone.hashCode()));
        result = ((result * 31) + ((this.countryFlag == null) ? 0 : this.countryFlag.hashCode()));
        result = ((result * 31) + ((this.countryCode == null) ? 0 : this.countryCode.hashCode()));
        result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
        result = ((result * 31) + ((this.continentCode == null) ? 0 : this.continentCode.hashCode()));
        result = ((result * 31) + ((this.longitude == null) ? 0 : this.longitude.hashCode()));
        result = ((result * 31) + ((this.currencyRates == null) ? 0 : this.currencyRates.hashCode()));
        result = ((result * 31) + ((this.org == null) ? 0 : this.org.hashCode()));
        result = ((result * 31) + ((this.ip == null) ? 0 : this.ip.hashCode()));
        result = ((result * 31) + ((this.currencySymbol == null) ? 0 : this.currencySymbol.hashCode()));
        result = ((result * 31) + ((this.countryNeighbours == null) ? 0 : this.countryNeighbours.hashCode()));
        result = ((result * 31) + ((this.countryCapital == null) ? 0 : this.countryCapital.hashCode()));
        result = ((result * 31) + ((this.completedRequests == null) ? 0 : this.completedRequests.hashCode()));
        result = ((result * 31) + ((this.timezoneGmtOffset == null) ? 0 : this.timezoneGmtOffset.hashCode()));
        result = ((result * 31) + ((this.success == null) ? 0 : this.success.hashCode()));
        result = ((result * 31) + ((this.timezoneName == null) ? 0 : this.timezoneName.hashCode()));
        result = ((result * 31) + ((this.currencyPlural == null) ? 0 : this.currencyPlural.hashCode()));
        result = ((result * 31) + ((this.region == null) ? 0 : this.region.hashCode()));
        result = ((result * 31) + ((this.asn == null) ? 0 : this.asn.hashCode()));
        result = ((result * 31) + ((this.currencyCode == null) ? 0 : this.currencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiGeo) == false) {
            return false;
        }
        ApiGeo rhs = ((ApiGeo) other);
        return ((((((((((((((((((((((((((((((this.continent == rhs.continent) || ((this.continent != null) && this.continent.equals(rhs.continent))) && ((this.country == rhs.country) || ((this.country != null) && this.country.equals(rhs.country)))) && ((this.city == rhs.city) || ((this.city != null) && this.city.equals(rhs.city)))) && ((this.timezone == rhs.timezone) || ((this.timezone != null) && this.timezone.equals(rhs.timezone)))) && ((this.latitude == rhs.latitude) || ((this.latitude != null) && this.latitude.equals(rhs.latitude)))) && ((this.isp == rhs.isp) || ((this.isp != null) && this.isp.equals(rhs.isp)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.timezoneDstOffset == rhs.timezoneDstOffset) || ((this.timezoneDstOffset != null) && this.timezoneDstOffset.equals(rhs.timezoneDstOffset)))) && ((this.timezoneGmt == rhs.timezoneGmt) || ((this.timezoneGmt != null) && this.timezoneGmt.equals(rhs.timezoneGmt)))) && ((this.countryPhone == rhs.countryPhone) || ((this.countryPhone != null) && this.countryPhone.equals(rhs.countryPhone)))) && ((this.countryFlag == rhs.countryFlag) || ((this.countryFlag != null) && this.countryFlag.equals(rhs.countryFlag)))) && ((this.countryCode == rhs.countryCode) || ((this.countryCode != null) && this.countryCode.equals(rhs.countryCode)))) && ((this.currency == rhs.currency) || ((this.currency != null) && this.currency.equals(rhs.currency)))) && ((this.continentCode == rhs.continentCode) || ((this.continentCode != null) && this.continentCode.equals(rhs.continentCode)))) && ((this.longitude == rhs.longitude) || ((this.longitude != null) && this.longitude.equals(rhs.longitude)))) && ((this.currencyRates == rhs.currencyRates) || ((this.currencyRates != null) && this.currencyRates.equals(rhs.currencyRates)))) && ((this.org == rhs.org) || ((this.org != null) && this.org.equals(rhs.org)))) && ((this.ip == rhs.ip) || ((this.ip != null) && this.ip.equals(rhs.ip)))) && ((this.currencySymbol == rhs.currencySymbol) || ((this.currencySymbol != null) && this.currencySymbol.equals(rhs.currencySymbol)))) && ((this.countryNeighbours == rhs.countryNeighbours) || ((this.countryNeighbours != null) && this.countryNeighbours.equals(rhs.countryNeighbours)))) && ((this.countryCapital == rhs.countryCapital) || ((this.countryCapital != null) && this.countryCapital.equals(rhs.countryCapital)))) && ((this.completedRequests == rhs.completedRequests) || ((this.completedRequests != null) && this.completedRequests.equals(rhs.completedRequests)))) && ((this.timezoneGmtOffset == rhs.timezoneGmtOffset) || ((this.timezoneGmtOffset != null) && this.timezoneGmtOffset.equals(rhs.timezoneGmtOffset)))) && ((this.success == rhs.success) || ((this.success != null) && this.success.equals(rhs.success)))) && ((this.timezoneName == rhs.timezoneName) || ((this.timezoneName != null) && this.timezoneName.equals(rhs.timezoneName)))) && ((this.currencyPlural == rhs.currencyPlural) || ((this.currencyPlural != null) && this.currencyPlural.equals(rhs.currencyPlural)))) && ((this.region == rhs.region) || ((this.region != null) && this.region.equals(rhs.region)))) && ((this.asn == rhs.asn) || ((this.asn != null) && this.asn.equals(rhs.asn)))) && ((this.currencyCode == rhs.currencyCode) || ((this.currencyCode != null) && this.currencyCode.equals(rhs.currencyCode))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(ip);
        dest.writeValue(success);
        dest.writeValue(type);
        dest.writeValue(continent);
        dest.writeValue(continentCode);
        dest.writeValue(country);
        dest.writeValue(countryCode);
        dest.writeValue(countryFlag);
        dest.writeValue(countryCapital);
        dest.writeValue(countryPhone);
        dest.writeValue(countryNeighbours);
        dest.writeValue(region);
        dest.writeValue(city);
        dest.writeValue(latitude);
        dest.writeValue(longitude);
        dest.writeValue(asn);
        dest.writeValue(org);
        dest.writeValue(isp);
        dest.writeValue(timezone);
        dest.writeValue(timezoneName);
        dest.writeValue(timezoneDstOffset);
        dest.writeValue(timezoneGmtOffset);
        dest.writeValue(timezoneGmt);
        dest.writeValue(currency);
        dest.writeValue(currencyCode);
        dest.writeValue(currencySymbol);
        dest.writeValue(currencyRates);
        dest.writeValue(currencyPlural);
        dest.writeValue(completedRequests);
    }

    public int describeContents() {
        return 0;
    }

}