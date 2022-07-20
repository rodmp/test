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

public class AbilityResource {
  @JsonProperty("ability")
  private CommonItem ability;
  
  @JsonProperty("is_hidden")
  private boolean isHidden;
  
  @JsonProperty("slot")
  private int slot;
  
}