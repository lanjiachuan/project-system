package com.tianyalan.usercenter.application.command;

public class ChangeContactInfoCommand {
	private String username;
	private String emailAddress;
	private String primaryTelephone;
	private String secondaryTelephone;
	private String addressStreetAddress;
	private String addressCity;
	private String addressStateProvince;
	private String addressPostalCode;
	private String addressCountryCode;

	public ChangeContactInfoCommand(String username, String emailAddress, String primaryTelephone,
			String secondaryTelephone, String addressStreetAddress, String addressCity, String addressStateProvince,
			String addressPostalCode, String addressCountryCode) {

		super();

		this.username = username;
		this.emailAddress = emailAddress;
		this.primaryTelephone = primaryTelephone;
		this.secondaryTelephone = secondaryTelephone;
		this.addressStreetAddress = addressStreetAddress;
		this.addressCity = addressCity;
		this.addressStateProvince = addressStateProvince;
		this.addressPostalCode = addressPostalCode;
		this.addressCountryCode = addressCountryCode;
	}

	public ChangeContactInfoCommand() {
		super();
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPrimaryTelephone() {
		return this.primaryTelephone;
	}

	public void setPrimaryTelephone(String primaryTelephone) {
		this.primaryTelephone = primaryTelephone;
	}

	public String getSecondaryTelephone() {
		return this.secondaryTelephone;
	}

	public void setSecondaryTelephone(String secondaryTelephone) {
		this.secondaryTelephone = secondaryTelephone;
	}

	public String getAddressStreetAddress() {
		return this.addressStreetAddress;
	}

	public void setAddressStreetAddress(String addressStreetAddress) {
		this.addressStreetAddress = addressStreetAddress;
	}

	public String getAddressCity() {
		return this.addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressStateProvince() {
		return this.addressStateProvince;
	}

	public void setAddressStateProvince(String addressStateProvince) {
		this.addressStateProvince = addressStateProvince;
	}

	public String getAddressPostalCode() {
		return this.addressPostalCode;
	}

	public void setAddressPostalCode(String addressPostalCode) {
		this.addressPostalCode = addressPostalCode;
	}

	public String getAddressCountryCode() {
		return this.addressCountryCode;
	}

	public void setAddressCountryCode(String addressCountryCode) {
		this.addressCountryCode = addressCountryCode;
	}
}
