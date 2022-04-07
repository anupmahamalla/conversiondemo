package com.anup.conversiondemo.services;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ConversionServicesTest {
    Logger logger = LoggerFactory.getLogger(ConversionServicesTest.class);

    @Autowired
    @Mock
    ConversionServices conversionServices;

    @Test
    public void testCelToFarConverter() {
        double result  = conversionServices.celToFarConverter(2);
        Assert.isTrue( result== 35.6);

    }
}