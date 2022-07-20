package com.bankaya.soap.core.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
public class CommonSprite {

  @JsonInclude(Include.NON_NULL)
  @JsonProperty("animated")
  private CommonSprite animated;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("back_default")
  private String backDefault;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("back_female")
  private String backFemale;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("back_shiny")
  private String backShiny;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("back_shiny_female")
  private String backShinyFemale;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("back_gray")
  private String backGray;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("back_transparent")
  private String backTransparent;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("back_shiny_transparent")
  private String backShinyTransparent;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("front_default")
  private String frontDefault;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("front_female")
  private String frontFemale;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("front_shiny")
  private String frontShiny;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("front_shiny_female")
  private String frontShinyFemale;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("front_gray")
  private String frontGray;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("front_transparent")
  private String frontTransparent;
  
  @JsonInclude(Include.NON_NULL)
  @JsonProperty("front_shiny_transparent")
  private String frontShinyTransparent;
}
