/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.develtrex.devolpay.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import lombok.Data;

/**
 *
 * @author Usuario
 */
@Data
@MappedSuperclass
public class NumericPkV1 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;
    @JsonIgnore
    @Column(name = "version")
    protected Long version;
    @JsonIgnore
    @Column(name = "is_persistent")
    protected Boolean isPersistent;
    @JsonIgnore
    @Column(name = "last_modified")
    private LocalDateTime lastModified;
    @Transient
    protected String operation;
    @Transient
    protected String userS;
}
