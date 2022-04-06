package com.anup.conversiondemo.services;


import org.springframework.stereotype.Component;

@Component
public class ConversionServices {

    public Double celToFarConverter(double celValue) {
        return  ( celValue * (double)9/5) +32;
    }

    public Double farToCelConverter(double farValue) {
        return ((farValue-32)*5)/9;
    }

    public Double inch_To_Millimeter(double inchValue) {
        return (double)inchValue*25.4;
    }

    public Double inch_To_centimeters(double inchValue) {
        return(double) inchValue*2.54;
    }

    public Double millimeter_To_Inch(double millValue) {
        return (double) millValue*0.0393700787;
    }

    public Double centimeters_to_inch(double centimeterValue) {
        return  (double)centimeterValue* 0.393700787;
    }
}
