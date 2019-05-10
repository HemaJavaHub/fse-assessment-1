package com.shoppingcart.model;

public interface  Cart {


   //As a customer, if I haven’t put anything into my cart, the cart is empty.

        public String checkCart(Product p ) throws NullPointerException;

  //  As a customer, I can add a product to the cart, and the cart will display a quantity of 1 of that product, in that line item.


    public LineItem  addProductToCart( LineItem lineItem , Product product);


        //As a customer, I can see the total, discounted price of all line items in my cart.

    public float  dicountTotal( LineItem lineItem , Product product);


  //  As a customer, I can see the total, un-discounted price of all line items in my cart.

    public float  origibnalTotal( LineItem lineItem , Product product);

    }



