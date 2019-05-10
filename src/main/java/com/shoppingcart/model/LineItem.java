package com.shoppingcart.model;

public interface LineItem {





    // As a customer, I can increase the quantity of a line item by 1.
    int addNumberOfLineItems(Product product , int quantity ) ;



  //  As a customer, I can decrease the quantity of a line item by 1. If I decrease it to 0, the line item disappears.
  int  removeNumberOfLineItems(Product product , int quantity ) ;



  //As a customer, I can see the discounted price of each line item in my cart (product price X quantity of that product)

   float discountedPrice(Product product, int newDiscountedPrice);



    //As a customer, I can see the un-discounted price of each line item in my cart, so I can see how much I’m saving.

    public default float originalPrice(Product product) {
        return 0;
    }

}
