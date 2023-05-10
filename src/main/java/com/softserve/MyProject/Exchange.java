package com.softserve.MyProject;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "exchange")
public class Exchange {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "currency")
    List<Currency> currencyList;
}
