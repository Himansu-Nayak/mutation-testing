package com.org.service;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class CalculatorService {

    public boolean isPositive(int number) {

        return number >= 0 ? TRUE : FALSE;

    }

}
