package com.training.constants;

public enum OfferSet {

	POSTPAID("postpaid"), PREPAID("prepaid"), HYBRID("hybrid");

	private String value;

	private OfferSet(String value) {
		this.value = value;
	}

	public String getValue()
    {
        return value;
    }
}
