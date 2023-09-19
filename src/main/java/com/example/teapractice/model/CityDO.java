package com.example.teapractice.model;

import java.math.BigDecimal;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "basic_city")
public class CityDO {
    
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    @Column(name = "CITY_ID", length = 32)
    private String cityId;
 
    @Column(name = "CITY_NAME_CN", columnDefinition = "VARCHAR(255) NOT NULL COMMENT '名称（中文）'")
    private String cityNameCN;
    
    @Column(name = "CITY_NAME_EN", columnDefinition = "VARCHAR(255) NOT NULL COMMENT '名称（英文）'")
    private String cityNameEN;

    @Column(name = "LONGITUDE", precision = 10, scale = 7)
    private BigDecimal longitude;

    @Column(name = "LATITUDE", precision = 10, scale = 7)
    private BigDecimal latitude;

    @Column(name = "ELEVATION", precision = 5)
    private Integer elevation;

    @Column(name = "CITY_DESCRIPTION", length = 500)
    private String cityDescription;

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityNameCN() {
		return cityNameCN;
	}

	public void setCityNameCN(String cityNameCN) {
		this.cityNameCN = cityNameCN;
	}

	public String getCityNameEN() {
		return cityNameEN;
	}

	public void setCityNameEN(String cityNameEN) {
		this.cityNameEN = cityNameEN;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public Integer getElevation() {
		return elevation;
	}

	public void setElevation(Integer elevation) {
		this.elevation = elevation;
	}

	public String getCityDescription() {
		return cityDescription;
	}

	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}

	@Override
	public String toString() {
		return "CityDO [cityId=" + cityId + ", cityNameCN=" + cityNameCN + ", cityNameEN=" + cityNameEN + ", longitude="
				+ longitude + ", latitude=" + latitude + ", elevation=" + elevation + ", cityDescription="
				+ cityDescription + "]";
	}
    
    
    
}