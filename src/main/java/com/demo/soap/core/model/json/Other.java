package com.bankaya.soap.core.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Other {

  @JsonProperty("dream_world")
  private DreamWorld dreamWorld;   
  
  @JsonProperty("home")
  private Home home; 
  
  @JsonProperty("official-artwork")
  private OfficialArtwork officialArtwork;
}