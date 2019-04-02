package com.entreprise.report.model;


import com.entreprise.report.exception.ReferenceException;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;

@JacksonXmlRootElement(localName = "reference")
public class Reference {
    @JacksonXmlProperty(isAttribute = true)
    private String numReference;
    @JacksonXmlProperty(isAttribute = true)
    private int size;
    @JacksonXmlProperty(isAttribute = true)
    private double price;
    @JacksonXmlProperty(localName = "color", isAttribute = true)
    private Color type;

    public Reference (String line){
        String[] reference = line.split(";");
        managerError(reference);
        this.numReference = reference[0];
        this.size = Integer.parseInt(reference[3]);
        this.price = Double.parseDouble(reference[2]);
        this.type = Color.valueOf(reference[1]);
    }

    private  void managerError(String[] reference) {
        String colors = Arrays.asList(Color.values()).toString();
        if (reference.length!=4) {
            throw new ReferenceException("Incorrect number of arguments");
        }
        if (!colors.contains(reference[1])) {
            throw new ReferenceException("Incorrect value for color");
        }
        if (reference[0].length() != 10) {
            throw new ReferenceException("Incorrect value for numReference");
        }
    }

    public String getNumReference() {
        return numReference;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public Color getType() {
        return type;
    }


}
