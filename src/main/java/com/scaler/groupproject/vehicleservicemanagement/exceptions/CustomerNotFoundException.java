package com.scaler.groupproject.vehicleservicemanagement.exceptions;

import com.scaler.groupproject.vehicleservicemanagement.models.Customer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerNotFoundException extends RuntimeException {
    private Long id;
    public CustomerNotFoundException(String message, Long id) {
        super(message);
        this.id = id;
    }

    public CustomerNotFoundException(String message){
        super(message);
    }

}