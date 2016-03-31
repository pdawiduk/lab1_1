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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Money money = (Money) o;

		if (getCurrency() != null ? !getCurrency().equals(money.getCurrency()) : money.getCurrency() != null)
			return false;
		return getValue() != null ? getValue().equals(money.getValue()) : money.getValue() == null;

	}

	@Override
	public int hashCode() {
		int result = getCurrency() != null ? getCurrency().hashCode() : 0;
		result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
		return result;
	}
}
