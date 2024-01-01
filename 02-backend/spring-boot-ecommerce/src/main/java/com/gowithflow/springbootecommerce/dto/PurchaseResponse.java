package com.gowithflow.springbootecommerce.dto;

import lombok.Data;

@Data
public class PurchaseResponse {

    // lombok will create a constructor using all the final variables
    private final String orderTrackingNumber;

}
