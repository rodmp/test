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
public class SpriteVersion {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("generation-i")
  private Generation generationI;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("generation-ii")
  private Generation generationII;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("generation-iii")
  private Generation generationIII;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("generation-iv")
  private Generation generationIV;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("generation-v")
  private Generation generationV;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("generation-vi")
  private Generation generationVI;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("generation-vii")
  private Generation generationVII;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("generation-viii")
  private Generation generationVIII;
}
