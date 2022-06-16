package com.bankaya.soap.core.model.json;

import java.util.List;
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
public class PokeApiResponse {

  @JsonProperty("abilities")
  private List<AbilityResource> abilities;
  
  @JsonProperty("base_experience")
  private int baseExperience;
  
  @JsonProperty("forms")
  private List<CommonItem> forms;
  
  @JsonProperty("game_indices")
  private List<GameIndiceResource> gameIndices;
  
  @JsonProperty("height")
  private int height;

  @JsonProperty("held_items")
  private List<HeltItemResource> heldItems;
  
  @JsonProperty("id")
  private int id;
  
  @JsonProperty("is_default")
  private boolean isDefault;
  
  @JsonProperty("location_area_encounters")
  private String locationArea;
  
  @JsonProperty("moves")
  private List<MoveResource> moves;
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("order")
  private int order;
  
  @JsonProperty("past_types")
  private List<String> pastTypes;
  
  @JsonProperty("species")
  private CommonItem species;
  
  @JsonProperty("sprites")
  private SpriteResource sprites;
  
  @JsonProperty("stats")
  private List<StatResource> stats;
  
  @JsonProperty("types")
  private List<TypeResource> types;
  
  @JsonProperty("weight")
  private int weight;
}
