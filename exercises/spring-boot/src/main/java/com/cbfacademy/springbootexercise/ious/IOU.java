package com.cbfacademy.springbootexercise.ious;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;

public class IOU {
    public UUID id;
    public String borrower;
    public String lender;
    public BigDecimal amount;
    public Instant dateTime;

}

@Entity
@Table(name = "ious")
@Id 
public IOU(String borrower, String lender, BigDecimal amount, Instant createdAt){

}
default IOU(){

}

@GetMapping