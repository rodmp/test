package com.bankaya.soap.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Builder
@Table(name = "poke_api_request")
public class PokeApiRequest {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  @Column(name = "origin_ip")
  private String originIp;
  
  @Column(name = "request_date")
  private String requestDate;
  
  @Column(name = "operation_method")
  private String operationMethod;
  
}
