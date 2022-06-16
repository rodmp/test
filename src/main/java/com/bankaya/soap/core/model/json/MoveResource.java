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
public class MoveResource {

  @JsonProperty("move")
  private CommonItem move;
  
  @JsonProperty("version_group_details")
  private List<VersionGroupDetails> versionGroup;
}
