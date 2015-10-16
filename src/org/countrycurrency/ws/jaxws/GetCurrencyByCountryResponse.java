
package org.countrycurrency.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.13
 * Sat Nov 29 18:34:42 CET 2014
 * Generated source version: 2.7.13
 */

@XmlRootElement(name = "getCurrencyByCountryResponse", namespace = "http://ws.countrycurrency.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrencyByCountryResponse", namespace = "http://ws.countrycurrency.org/")

public class GetCurrencyByCountryResponse {

    @XmlElement(name = "currency")
    private org.countrycurrency.ws.type.Currency currency;

    public org.countrycurrency.ws.type.Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(org.countrycurrency.ws.type.Currency newCurrency)  {
        this.currency = newCurrency;
    }

}
