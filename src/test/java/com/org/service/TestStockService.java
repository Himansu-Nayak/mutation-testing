package com.org.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStockService {

    @Test
    @DisplayName("Test deduct stock")
    public void testDeduct() {
        StockService obj = new StockService(100);
        assertEquals(90, obj.deduct(10));
        assertEquals(0, obj.deduct(90));
        assertEquals(0, obj.deduct(0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            obj.deduct(-1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            obj.deduct(100);
        });

    }

    @Test
    @DisplayName("Test add stock")
    public void testAdd() {
        StockService obj = new StockService(100);
        assertEquals(110, obj.add(10));
        assertEquals(110, obj.add(0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            obj.add(-1);
        });
    }


}