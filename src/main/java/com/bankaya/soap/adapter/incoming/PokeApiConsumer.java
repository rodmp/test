package com.bankaya.soap.adapter.incoming;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.bankaya.soap.core.interfaces.PokeApiXmlService;
import com.pokeapi.soap.generation.GetAbilities;
import com.pokeapi.soap.generation.GetAbilitiesResponse;
import com.pokeapi.soap.generation.GetBaseExperience;
import com.pokeapi.soap.generation.GetBaseExperienceResponse;
import com.pokeapi.soap.generation.GetHeldItems;
import com.pokeapi.soap.generation.GetHeldItemsResponse;
import com.pokeapi.soap.generation.GetId;
import com.pokeapi.soap.generation.GetIdResponse;
import com.pokeapi.soap.generation.GetLocationAreaEncounters;
import com.pokeapi.soap.generation.GetLocationAreaEncountersResponse;
import com.pokeapi.soap.generation.GetName;
import com.pokeapi.soap.generation.GetNameResponse;
import com.pokeapi.soap.generation.GetPokeApi;
import com.pokeapi.soap.generation.GetPokeApiResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * Endpint class to get info from json Poke api.
 * 
 * @author bankaya.
 *
 */
@Slf4j
@Endpoint
public class PokeApiConsumer {

  private static final String NAMESPACE_URI_POKEAPI = "http://www.pokeapi.com/soap/generation";

  private final PokeApiXmlService pokeApiXmlService;

  private final HttpServletRequest httpServletRequest;

  /**
   * PokeApiConsumer constructor.
   * 
   * @param pokeApiProcessorService PokeApiProcessorService.
   */
  public PokeApiConsumer(final PokeApiXmlService pokeApiXmlService,
      final HttpServletRequest httpServletRequest) {
    this.pokeApiXmlService = pokeApiXmlService;
    this.httpServletRequest = httpServletRequest;
  }

  @PayloadRoot(namespace = NAMESPACE_URI_POKEAPI, localPart = "getPokeApi")
  @ResponsePayload
  public GetPokeApiResponse getPokeApi(@RequestPayload GetPokeApi getPokeApiRequest) {

    log.info("Get pokeApi with name: [{}]", getPokeApiRequest);

    return pokeApiXmlService.getPokeApiFromJson(getPokeApiRequest.getName(),
        httpServletRequest.getRemoteAddr());
  }

  @PayloadRoot(namespace = NAMESPACE_URI_POKEAPI, localPart = "getAbilities")
  @ResponsePayload
  public GetAbilitiesResponse getAbilities(@RequestPayload GetAbilities getAbilitiesRequest) {

    log.info("Get abilities with name [{}]", getAbilitiesRequest);

    return pokeApiXmlService.getAbilitiesFromJson(getAbilitiesRequest.getName(),
        httpServletRequest.getRemoteAddr());
  }

  @PayloadRoot(namespace = NAMESPACE_URI_POKEAPI, localPart = "getBaseExperience")
  @ResponsePayload
  public GetBaseExperienceResponse getBaseExperience(
      @RequestPayload GetBaseExperience getBaseExperience) {

    log.info("Get base experience with name [{}]", getBaseExperience);

    return pokeApiXmlService.getBaseExperienceFromJson(getBaseExperience.getName(),
        httpServletRequest.getRemoteAddr());
  }

  @PayloadRoot(namespace = NAMESPACE_URI_POKEAPI, localPart = "getHeldItems")
  @ResponsePayload
  public GetHeldItemsResponse getHeldItems(@RequestPayload GetHeldItems getHeldItems) {

    log.info("Get heldItems with name [{}]", getHeldItems);

    return pokeApiXmlService.getHeldItemsFromJson(getHeldItems.getName(),
        httpServletRequest.getRemoteAddr());
  }

  @PayloadRoot(namespace = NAMESPACE_URI_POKEAPI, localPart = "getId")
  @ResponsePayload
  public GetIdResponse getId(@RequestPayload GetId getId) {

    log.info("Get id with name [{}]", getId);

    return pokeApiXmlService.getIdFromJson(getId.getName(), httpServletRequest.getRemoteAddr());
  }

  @PayloadRoot(namespace = NAMESPACE_URI_POKEAPI, localPart = "getName")
  @ResponsePayload
  public GetNameResponse getName(@RequestPayload GetName getName) {

    log.info("Get name with name [{}]", getName);

    return pokeApiXmlService.getNameFromJson(getName.getName(), httpServletRequest.getRemoteAddr());
  }

  @PayloadRoot(namespace = NAMESPACE_URI_POKEAPI, localPart = "getLocationAreaEncounters")
  @ResponsePayload
  public GetLocationAreaEncountersResponse getLocationAreaEncounters(
      @RequestPayload GetLocationAreaEncounters getLocationAreaEncounters) {

    log.info("Get location area encounters with name [{}]", getLocationAreaEncounters);

    return pokeApiXmlService.getLocationAreaEncountersFromJson(getLocationAreaEncounters.getName(),
        httpServletRequest.getRemoteAddr());
  }

}
