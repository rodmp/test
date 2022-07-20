package com.bankaya.soap.core.util;

import java.io.File;
import com.bankaya.soap.core.model.json.PokeApiResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConvertsMock {

  public static PokeApiResponse getPokeApiResponse() throws Exception {
    
    File file = new File("src/test/resources/json/pokeApi.json");
    ObjectMapper om = new ObjectMapper();
    PokeApiResponse pokeApiResponse = om.readValue(file, new TypeReference<PokeApiResponse>() {});

    return pokeApiResponse;
  }
  
  public static PokeApiResponse getAbilityResource() throws Exception {
    
    File file = new File("src/test/resources/json/abilities.json");
    ObjectMapper om = new ObjectMapper();
    PokeApiResponse pokeApiResponse = om.readValue(file, new TypeReference<PokeApiResponse>() {});

    return pokeApiResponse;
  }
  
  public static PokeApiResponse getHeldItems() throws Exception {
    
    File file = new File("src/test/resources/json/heldItems.json");
    ObjectMapper om = new ObjectMapper();
    PokeApiResponse pokeApiResponse = om.readValue(file, new TypeReference<PokeApiResponse>() {});

    return pokeApiResponse;
  }
  
  public static PokeApiResponse getBaseExperience() throws Exception {
    
    File file = new File("src/test/resources/json/baseExperience.json");
    ObjectMapper om = new ObjectMapper();
    PokeApiResponse pokeApiResponse = om.readValue(file, new TypeReference<PokeApiResponse>() {});

    return pokeApiResponse;
  }
  
  public static PokeApiResponse getId() throws Exception {
    
    File file = new File("src/test/resources/json/id.json");
    ObjectMapper om = new ObjectMapper();
    PokeApiResponse pokeApiResponse = om.readValue(file, new TypeReference<PokeApiResponse>() {});

    return pokeApiResponse;
  }
  
  public static PokeApiResponse getName() throws Exception {
    
    File file = new File("src/test/resources/json/name.json");
    ObjectMapper om = new ObjectMapper();
    PokeApiResponse pokeApiResponse = om.readValue(file, new TypeReference<PokeApiResponse>() {});

    return pokeApiResponse;
  }
  
  public static PokeApiResponse getLocationArea() throws Exception {
    
    File file = new File("src/test/resources/json/locationArea.json");
    ObjectMapper om = new ObjectMapper();
    PokeApiResponse pokeApiResponse = om.readValue(file, new TypeReference<PokeApiResponse>() {});

    return pokeApiResponse;
  }
}
