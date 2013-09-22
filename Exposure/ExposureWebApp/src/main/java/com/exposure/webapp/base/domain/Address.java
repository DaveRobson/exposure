package com.exposure.webapp.base.domain;

/**
 * Simple object to hold address information
 * 
 * @author David
 *
 */
@SuppressWarnings("serial")
public class Address extends CommonDomainBase
{
	private String addressLine1;
	private String addressLine2;
	private String townCity;
	private String postcode;
	private String county;
	private String country;
	
	public Address()
	{
		
	}
	
	public Address(String addressLine1, String addressLine2, String townCity, String postcode,
			String county, String country)
	{
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.townCity = townCity;
		this.postcode = postcode;
		this.county = county;
		this.country = country;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getTownCity() {
		return townCity;
	}

	public void setTownCity(String townCity) {
		this.townCity = townCity;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
