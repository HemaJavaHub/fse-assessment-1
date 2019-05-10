package com.shoppingcart.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class CartTest {


    public Cart cartInterface;


    public cartInterfaceTesting(Cart myInterface) {
        this.cartInterface = myInterface;
    }

    @Test
    public final void testMyMethod_True() {
        assertEquals(null, cartInterface.checkCart(null ));
    }

    @Test
    public final void testMyMethod_False() {
        assertFalse(cartInterface.checkCart(assertNotNull();));
    }



}