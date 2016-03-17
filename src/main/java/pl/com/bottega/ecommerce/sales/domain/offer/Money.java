package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {
	
 private String currency;
 private BigDecimal value;

public BigDecimal getValue() {
	return value;
}

public void setValue(BigDecimal value) {
	this.value = value;
}

public String getCurrency() {
	return currency;
}

public void setCurrency(String currency) {
	this.currency = currency;
}


 
}
