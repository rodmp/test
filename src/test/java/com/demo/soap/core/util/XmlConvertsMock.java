package com.bankaya.soap.core.util;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
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

public class XmlConvertsMock {

  public static GetPokeApi getPokeApiRequest() {
    GetPokeApi getPokeApi = new GetPokeApi();
    getPokeApi.setName("test");

    return getPokeApi;
  }

  public static GetAbilities getAbilities() {
    GetAbilities getAbilities = new GetAbilities();
    getAbilities.setName("test");

    return getAbilities;
  }

  public static GetBaseExperience getBaseExperience() {
    GetBaseExperience getBaseExperience = new GetBaseExperience();
    getBaseExperience.setName("test");

    return getBaseExperience;
  }

  public static GetHeldItems getHeldItems() {
    GetHeldItems getHeldItems = new GetHeldItems();
    getHeldItems.setName("test");

    return getHeldItems;
  }

  public static GetId getId() {
    GetId getId = new GetId();
    getId.setName("test");

    return getId;
  }

  public static GetName getName() {
    GetName getName = new GetName();
    getName.setName("test");

    return getName;
  }

  public static GetLocationAreaEncounters getLocationAreaEncounters() {
    GetLocationAreaEncounters getLocationAreaEncounters = new GetLocationAreaEncounters();
    getLocationAreaEncounters.setName("test");

    return getLocationAreaEncounters;
  }

  public static GetPokeApiResponse getPokeApiResponse() throws JAXBException {
    File file = new File("src/test/resources/responses/getPokeApiResponse.xml");
    JAXBContext jaxbContext = JAXBContext.newInstance(GetPokeApiResponse.class);

    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    GetPokeApiResponse getPokeApiResponse = (GetPokeApiResponse) jaxbUnmarshaller.unmarshal(file);

    return getPokeApiResponse;
  }

  public static GetAbilitiesResponse getAbilitiesResponse() throws JAXBException {
    File file = new File("src/test/resources/responses/getAbilitiesResponse.xml");
    JAXBContext jaxbContext = JAXBContext.newInstance(GetAbilitiesResponse.class);

    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    GetAbilitiesResponse getAbilitiesResponse =
        (GetAbilitiesResponse) jaxbUnmarshaller.unmarshal(file);

    return getAbilitiesResponse;
  }

  public static GetBaseExperienceResponse getBaseExperienceResponse() throws JAXBException {
    File file = new File("src/test/resources/responses/getBaseExperienceResponse.xml");
    JAXBContext jaxbContext = JAXBContext.newInstance(GetBaseExperienceResponse.class);

    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    GetBaseExperienceResponse getBaseExperienceResponse =
        (GetBaseExperienceResponse) jaxbUnmarshaller.unmarshal(file);

    return getBaseExperienceResponse;
  }

  public static GetHeldItemsResponse getHeldItemsResponse() throws JAXBException {
    File file = new File("src/test/resources/responses/getHeldItemsResponse.xml");
    JAXBContext jaxbContext = JAXBContext.newInstance(GetHeldItemsResponse.class);

    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    GetHeldItemsResponse getHeldItemsResponse =
        (GetHeldItemsResponse) jaxbUnmarshaller.unmarshal(file);

    return getHeldItemsResponse;
  }

  public static GetIdResponse getIdResponse() throws JAXBException {
    File file = new File("src/test/resources/responses/getIdResponse.xml");
    JAXBContext jaxbContext = JAXBContext.newInstance(GetIdResponse.class);

    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    GetIdResponse getIdResponse = (GetIdResponse) jaxbUnmarshaller.unmarshal(file);

    return getIdResponse;
  }

  public static GetNameResponse getNameResponse() throws JAXBException {
    File file = new File("src/test/resources/responses/getNameResponse.xml");
    JAXBContext jaxbContext = JAXBContext.newInstance(GetNameResponse.class);

    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    GetNameResponse getNameResponse = (GetNameResponse) jaxbUnmarshaller.unmarshal(file);

    return getNameResponse;
  }

  public static GetLocationAreaEncountersResponse getLocationAreaEncountersResponse()
      throws JAXBException {
    File file = new File("src/test/resources/responses/getLocationAreaEncountersResponse.xml");
    JAXBContext jaxbContext = JAXBContext.newInstance(GetLocationAreaEncountersResponse.class);

    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    GetLocationAreaEncountersResponse getLocationAreaEncountersResponse =
        (GetLocationAreaEncountersResponse) jaxbUnmarshaller.unmarshal(file);

    return getLocationAreaEncountersResponse;
  }
}
