package com.bankaya.soap.core.business;

import org.springframework.stereotype.Service;
import com.bankaya.soap.adapter.outgoing.PokeApiClient;
import com.bankaya.soap.core.domain.OperationMethod;
import com.bankaya.soap.core.interfaces.PokeApiProcessLogService;
import com.bankaya.soap.core.interfaces.PokeApiXmlService;
import com.bankaya.soap.core.mapper.PokeApiMapper;
import com.bankaya.soap.core.model.json.PokeApiResponse;
import com.pokeapi.soap.generation.GetAbilitiesResponse;
import com.pokeapi.soap.generation.GetBaseExperienceResponse;
import com.pokeapi.soap.generation.GetHeldItemsResponse;
import com.pokeapi.soap.generation.GetIdResponse;
import com.pokeapi.soap.generation.GetLocationAreaEncountersResponse;
import com.pokeapi.soap.generation.GetNameResponse;
import com.pokeapi.soap.generation.GetPokeApiResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * Implement class from PokeApiXmlService.
 * 
 * @author bancaya.
 *
 */
@Slf4j
@Service
public class PokeApiXmlProcessor implements PokeApiXmlService {

  private final PokeApiMapper pokeApiMapper;

  private final PokeApiClient pokeApiClient;

  private final PokeApiProcessLogService pokeApiProcessLogService;

  public PokeApiXmlProcessor(final PokeApiMapper pokeApiMapper, final PokeApiClient pokeApiClient,
      final PokeApiProcessLogService pokeApiProcessLogService) {
    this.pokeApiClient = pokeApiClient;
    this.pokeApiMapper = pokeApiMapper;
    this.pokeApiProcessLogService = pokeApiProcessLogService;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GetPokeApiResponse getPokeApiFromJson(String name, String ipAddress) {
    PokeApiResponse pokeApiJson = pokeApiClient.getPokeApiJson(
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
        name);
    log.info("Poke api json response: [[{}], with name: [{}]", pokeApiJson, name);

    GetPokeApiResponse getPokeApiResponse = new GetPokeApiResponse();
    getPokeApiResponse.setPokeApi(pokeApiMapper.convertPokeApiJsonToXml(pokeApiJson));

    pokeApiProcessLogService.processRequestLog(OperationMethod.GET_POKE_API, ipAddress);
    return getPokeApiResponse;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GetAbilitiesResponse getAbilitiesFromJson(String name, String ipAddress) {
    PokeApiResponse pokeApiJson = pokeApiClient.getPokeApiJson(
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
        name);
    log.info("Poke api json response: [[{}], with name: [{}]", pokeApiJson, name);

    GetAbilitiesResponse getAbilitiesResponse = new GetAbilitiesResponse();
    getAbilitiesResponse
        .setAbilities(pokeApiMapper.convertJsonAbilitiesToXml(pokeApiJson.getAbilities()));

    pokeApiProcessLogService.processRequestLog(OperationMethod.GET_ABILITIES, ipAddress);
    return getAbilitiesResponse;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GetBaseExperienceResponse getBaseExperienceFromJson(String name, String ipAddress) {
    PokeApiResponse pokeApiJson = pokeApiClient.getPokeApiJson(
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
        name);
    log.info("Poke api json response: [[{}], with name: [{}]", pokeApiJson, name);

    GetBaseExperienceResponse getBaseExperienceResponse = new GetBaseExperienceResponse();
    getBaseExperienceResponse.setBaseExperience(pokeApiJson.getBaseExperience());

    pokeApiProcessLogService.processRequestLog(OperationMethod.GET_BASE_EXPERIENCE, ipAddress);
    return getBaseExperienceResponse;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GetHeldItemsResponse getHeldItemsFromJson(String name, String ipAddress) {
    PokeApiResponse pokeApiJson = pokeApiClient.getPokeApiJson(
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
        name);
    log.info("Poke api json response: [[{}], with name: [{}]", pokeApiJson, name);

    GetHeldItemsResponse getHeldItemsResponse = new GetHeldItemsResponse();
    getHeldItemsResponse
        .setHeldItems(pokeApiMapper.convertJsonHeldItemsToXml(pokeApiJson.getHeldItems()));

    pokeApiProcessLogService.processRequestLog(OperationMethod.GET_HELD_ITEMS, ipAddress);
    return getHeldItemsResponse;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GetIdResponse getIdFromJson(String name, String ipAddress) {
    PokeApiResponse pokeApiJson = pokeApiClient.getPokeApiJson(
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
        name);
    log.info("Poke api json response: [[{}], with name: [{}]", pokeApiJson, name);

    GetIdResponse getIdResponse = new GetIdResponse();
    getIdResponse.setId(pokeApiJson.getId());

    pokeApiProcessLogService.processRequestLog(OperationMethod.GET_ID, ipAddress);
    return getIdResponse;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GetNameResponse getNameFromJson(String name, String ipAddress) {
    PokeApiResponse pokeApiJson = pokeApiClient.getPokeApiJson(
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
        name);
    log.info("Poke api json response: [[{}], with name: [{}]", pokeApiJson, name);

    GetNameResponse getNameResponse = new GetNameResponse();
    getNameResponse.setName(pokeApiJson.getName());

    pokeApiProcessLogService.processRequestLog(OperationMethod.GET_NAME, ipAddress);
    return getNameResponse;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public GetLocationAreaEncountersResponse getLocationAreaEncountersFromJson(String name,
      String ipAddress) {
    PokeApiResponse pokeApiJson = pokeApiClient.getPokeApiJson(
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
        name);
    log.info("Poke api json response: [[{}], with name: [{}]", pokeApiJson, name);

    GetLocationAreaEncountersResponse getLocationAreaEncountersResponse =
        new GetLocationAreaEncountersResponse();
    getLocationAreaEncountersResponse.setLocationAreas(pokeApiJson.getLocationArea());

    pokeApiProcessLogService.processRequestLog(OperationMethod.GET_LOCATION_AREA_ENCOUNTERS,
        ipAddress);
    return getLocationAreaEncountersResponse;
  }

}
