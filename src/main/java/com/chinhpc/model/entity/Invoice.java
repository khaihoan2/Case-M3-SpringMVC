package com.chinhpc.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String status;

    private String payment;

    private String shipment;

    private LocalDate invoiceDate;
}
