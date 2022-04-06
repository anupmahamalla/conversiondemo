package com.anup.conversiondemo.controller;

import com.anup.conversiondemo.services.ConversionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/anup/")
@RestController
public class ConversionController {

    @Autowired
    ConversionServices conversionServices;

    @GetMapping("/temperatures/celtofar/{celValue}")
    public Double celToFarConverter(@PathVariable  double celValue){

        return conversionServices.celToFarConverter(celValue);

    }

    @GetMapping("/temperatures/fartocel/{farValue}")
    public Double farToCelConverter(@PathVariable  double farValue){

        return conversionServices.farToCelConverter(farValue);

    }




    @GetMapping("/length/inch-to-mill/{inchValue}")
    public Double inch_To_Millimeter(@PathVariable  double inchValue){

        return conversionServices.inch_To_Millimeter(inchValue);

    }

    @GetMapping("/length/inch-to-centimeters/{inchValue}")
    public Double inch_To_centimeters(@PathVariable  double inchValue){

        return conversionServices.inch_To_centimeters(inchValue);

    }



    @GetMapping("/length/mill-to-inch/{millValue}")
    public Double millimeter_To_Inch(@PathVariable  double millValue){

        return conversionServices.millimeter_To_Inch(millValue);

    }

    @GetMapping("/length/centimeters-to-inch/{centimeterValue}")
    public Double centimeters_to_inch(@PathVariable  double centimeterValue){

        return conversionServices.centimeters_to_inch(centimeterValue);

    }


}
