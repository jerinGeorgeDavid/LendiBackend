package com.jaydee.lendi.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="transaction")
public class Transaction {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private Boolean isOpen;
    private String firstParty;
    private String secondParty;
    private double amount;
    private String remarks;
}
