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
public class Generation extends CommonSprite {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("red-blue")
  private CommonSprite redBlue;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("yellow")
  private CommonSprite yellow;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("crystal")
  private CommonSprite crystal;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("gold")
  private CommonSprite gold;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("silver")
  private CommonSprite silver;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("emerald")
  private CommonSprite emerald;
    
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("firered-leafgreen")
  private CommonSprite fireredLeafgreen;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("ruby-sapphire")
  private CommonSprite rubySapphire;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("diamond-pearl")
  private CommonSprite diamondPearl;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("heartgold-soulsilver")
  private CommonSprite heartgoldSoulsilver;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("platinum")
  private CommonSprite platinum;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("black-white")
  private CommonSprite blackWhite;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("omegaruby-alphasapphire")
  private CommonSprite omegarubyAlphasapphire;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("x-y")
  private CommonSprite xY;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("icons")
  private CommonSprite icons;
  
  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("ultra-sun-ultra-moon")
  private CommonSprite ultraSunUltraMoon;
  
}
