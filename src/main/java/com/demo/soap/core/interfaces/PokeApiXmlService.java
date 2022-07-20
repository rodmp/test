package com.bankaya.soap.core.interfaces;

import com.pokeapi.soap.generation.GetAbilitiesResponse;
import com.pokeapi.soap.generation.GetBaseExperienceResponse;
import com.pokeapi.soap.generation.GetHeldItemsResponse;
import com.pokeapi.soap.generation.GetIdResponse;
import com.pokeapi.soap.generation.GetLocationAreaEncountersResponse;
import com.pokeapi.soap.generation.GetNameResponse;
import com.pokeapi.soap.generation.GetPokeApiResponse;

/**
 * PokeApi contract to process json PokeApi.
 * 
 * @author demo.
 *
 */
public interface PokeApiXmlService {

  /**
   * Method to get Xml representatio from PokeApi json.
   * 
   * @param name Poke name.
   * @return PokeApi xml representation file.
   */
  GetPokeApiResponse getPokeApiFromJson(String name, String ipAddress);

  /**
   * Method to get Abilities from PokeApi json.
   * 
   * @param name Poke name.
   * @return Abilities object.
   */
  GetAbilitiesResponse getAbilitiesFromJson(String name, String ipAddress);

  /**
   * Method to get base experience from PokeApi json.
   * 
   * @param name Poke name.
   * @return base experience value.
   */
  GetBaseExperienceResponse getBaseExperienceFromJson(String name, String ipAddress);

  /**
   * Method to get HeldItems from PokeApi json.
   * 
   * @param name Poke name.
   * @return HeldItems object.
   */
  GetHeldItemsResponse getHeldItemsFromJson(String name, String ipAddress);

  /**
   * Method to get poke id from PokeApi json.
   * 
   * @param name Poke name.
   * @return id value.
   */
  GetIdResponse getIdFromJson(String name, String ipAddress);

  /**
   * Method to get poke name from PokeApi json.
   * 
   * @param name Poke name.
   * @return name value.
   */
  GetNameResponse getNameFromJson(String name, String ipAddress);

  /**
   * Method to get location area encounters from PokeApi json.
   * 
   * @param name Poke name.
   * @return location area encounters value.
   */
  GetLocationAreaEncountersResponse getLocationAreaEncountersFromJson(String name,
      String ipAddress);
}
