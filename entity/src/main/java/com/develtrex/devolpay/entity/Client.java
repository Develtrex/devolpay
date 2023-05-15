/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.develtrex.devolpay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Component
@Scope("prototype")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Table(catalog = "devolpay", schema = "devolpay", name = "clients")
public class Client extends NumericPkV1{

    @Column(name = "dni")
    private String dni;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;
    @Column(name = "user_bean")
    private User user_bean;

    //Mapping user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    
    private String operation;
    @Column(name = "client_cod")
    private String client_cod;
    @Column(name = "loan_num")
    private Integer loan_num=0;
    @Column(name = "value_generator_id")
    private String value_generator_id;
    @Column(name = "id_create_client")
    private String id_create_client;
    
    
    //Mapping client manager
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_manager_id")
    private ClientManager clientManager;
    
    
   //Mapping billing manager id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billing_manager_id")
    private BillingManager billingManager;
    
  //Mapping owner user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_user_id")
    private String ownerUser;
    
    @Column(name = "billing_user_bean")
    private User billing_user_bean;
    
   //Mapping billing user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billing_user_id")
    private User billingUser;
    
    @Column(name = "assigned_clients")
    private Integer assigned_clients=0;
    @Column(name = "is_selected")
    private Boolean is_selected=false;
    
}
