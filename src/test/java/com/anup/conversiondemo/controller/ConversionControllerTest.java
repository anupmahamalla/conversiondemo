package com.anup.conversiondemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.PathVariable;

import static org.junit.jupiter.api.Assertions.*;


class ConversionControllerTest {


@Test
    public Double celToFarConverter(@PathVariable double value){
        double temp= (double)9/5;
        double result = (value * temp) +32;
        System.out.println( "The Result is "+result);
        return result;
    }

}