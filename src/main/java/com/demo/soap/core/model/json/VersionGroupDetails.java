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
public class VersionGroupDetails {

   @JsonProperty("level_learned_at")
   private int levelLearnedAt;
   
   @JsonProperty("move_learn_method")
   private CommonItem moveLearnedMethod;
   
   @JsonProperty("version_group")
   private CommonItem versionGroup;
}
