package com.training.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.training.constants.OfferSet;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder={"id","name","address","item"})
public class User {
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Offer getItem() {
		return item;
	}

	public void setItem(Offer item) {
		this.item = item;
	}

	@XmlAttribute
	protected int id;
	@XmlAttribute
	protected String name;
	@XmlElement(name = "Address", required = true)
	protected List<Address> address;
	@XmlElement
	protected Offer item;
	
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType
	public static class Address {

		public String getHouseNo() {
			return houseNo;
		}

		public void setHouseNo(String houseNo) {
			this.houseNo = houseNo;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		protected String houseNo;
		protected String street;
		protected String city;
		protected String state;
		protected String country;

	}
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType
	public static class Offer {

		public SubscriberOffer getOffer() {
			return offer;
		}

		public void setOffer(SubscriberOffer offer) {
			this.offer = offer;
		}

		public MisseleneousOffer getOtherOffer() {
			return otherOffer;
		}

		public void setOtherOffer(MisseleneousOffer otherOffer) {
			this.otherOffer = otherOffer;
		}

		protected SubscriberOffer offer;
		protected MisseleneousOffer otherOffer;
		
		@XmlAccessorType(XmlAccessType.FIELD)
		public static class SubscriberOffer {

			protected OfferSet set;

			public OfferSet getSet() {
				return set;
			}

			public void setSet(OfferSet set) {
				this.set = set;
			}

		}
		
		@XmlAccessorType(XmlAccessType.FIELD)
		public static class MisseleneousOffer {
			protected String callerTune;
			protected String MissedCallAlert;

			public String getCallerTune() {
				return callerTune;
			}

			public void setCallerTune(String callerTune) {
				this.callerTune = callerTune;
			}

			public String getMissedCallAlert() {
				return MissedCallAlert;
			}

			public void setMissedCallAlert(String missedCallAlert) {
				MissedCallAlert = missedCallAlert;
			}

		}

	}

	
}
