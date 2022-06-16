package com.bankaya.soap.adapter.incomming;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import javax.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bankaya.soap.adapter.incoming.PokeApiConsumer;
import com.bankaya.soap.core.interfaces.PokeApiXmlService;
import com.bankaya.soap.core.util.XmlConvertsMock;
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

@ExtendWith(MockitoExtension.class)
public class PokeApiConsumerTest {

  @InjectMocks
  private PokeApiConsumer pokeApiConsumer;

  @Mock
  private PokeApiXmlService pokeApiXmlService;

  @Mock
  private HttpServletRequest httpServletRequest;

  @Test
  public void whenGetPokeApi_then_ReturnGetPokeApiResponse() throws Exception {
    GetPokeApi getPokeApiRequest = XmlConvertsMock.getPokeApiRequest();
    GetPokeApiResponse getPokeApiResponse = XmlConvertsMock.getPokeApiResponse();

    when(pokeApiXmlService.getPokeApiFromJson(Mockito.anyString(), Mockito.anyString()))
        .thenReturn(getPokeApiResponse);

    when(httpServletRequest.getRemoteAddr()).thenReturn("localhost:8080");

    assertThat(this.pokeApiConsumer.getPokeApi(getPokeApiRequest).getPokeApi().getName())
        .isEqualTo("beedrill");
  }

  @Test
  public void whenGetAbilities_then_ReturnGetAbilitiesResponse() throws Exception {
    GetAbilities getAbilitiesRequest = XmlConvertsMock.getAbilities();
    GetAbilitiesResponse getAbilitiesResponse = XmlConvertsMock.getAbilitiesResponse();

    when(pokeApiXmlService.getAbilitiesFromJson(Mockito.anyString(), Mockito.anyString()))
        .thenReturn(getAbilitiesResponse);

    when(httpServletRequest.getRemoteAddr()).thenReturn("localhost:8080");

    assertThat(this.pokeApiConsumer.getAbilities(getAbilitiesRequest).getAbilities()
        .getAbilityResource().size()).isNotZero();
  }

  @Test
  public void whenGetBaseExperience_then_ReturnGetBaseExperienceResponse() throws Exception {
    GetBaseExperience getBaseExperienceRequest = XmlConvertsMock.getBaseExperience();
    GetBaseExperienceResponse getBaseExperienceResponse =
        XmlConvertsMock.getBaseExperienceResponse();

    when(pokeApiXmlService.getBaseExperienceFromJson(Mockito.anyString(), Mockito.anyString()))
        .thenReturn(getBaseExperienceResponse);

    when(httpServletRequest.getRemoteAddr()).thenReturn("localhost:8080");

    assertThat(this.pokeApiConsumer.getBaseExperience(getBaseExperienceRequest).getBaseExperience())
        .isEqualTo(72);
  }

  @Test
  public void whenGetHeldItems_then_ReturnGetHeldItemsResponse() throws Exception {
    GetHeldItems getHeldItemsRequest = XmlConvertsMock.getHeldItems();
    GetHeldItemsResponse getHeldItemsResponse = XmlConvertsMock.getHeldItemsResponse();

    when(pokeApiXmlService.getHeldItemsFromJson(Mockito.anyString(), Mockito.anyString()))
        .thenReturn(getHeldItemsResponse);

    when(httpServletRequest.getRemoteAddr()).thenReturn("localhost:8080");

    assertThat(
        this.pokeApiConsumer.getHeldItems(getHeldItemsRequest).getHeldItems().getHeldItem().size())
            .isNotZero();
  }

  @Test
  public void whenGeiId_then_ReturnGetIdResponse() throws Exception {
    GetId getIdRequest = XmlConvertsMock.getId();
    GetIdResponse getIdResponse = XmlConvertsMock.getIdResponse();

    when(pokeApiXmlService.getIdFromJson(Mockito.anyString(), Mockito.anyString()))
        .thenReturn(getIdResponse);

    when(httpServletRequest.getRemoteAddr()).thenReturn("localhost:8080");

    assertThat(this.pokeApiConsumer.getId(getIdRequest).getId()).isEqualTo(1);
  }

  @Test
  public void whenGeiName_then_ReturnGetNameResponse() throws Exception {
    GetName getNameRequest = XmlConvertsMock.getName();
    GetNameResponse getNameResponse = XmlConvertsMock.getNameResponse();

    when(pokeApiXmlService.getNameFromJson(Mockito.anyString(), Mockito.anyString()))
        .thenReturn(getNameResponse);

    when(httpServletRequest.getRemoteAddr()).thenReturn("localhost:8080");

    assertThat(this.pokeApiConsumer.getName(getNameRequest).getName()).isEqualTo("weedle");
  }

  @Test
  public void whenGetLocationAreaEncounters_then_ReturnGetLocationAreaEncountersResponse()
      throws Exception {
    GetLocationAreaEncounters getLocationAreaEncountersRequest =
        XmlConvertsMock.getLocationAreaEncounters();
    GetLocationAreaEncountersResponse getLocationAreaEncountersResponse =
        XmlConvertsMock.getLocationAreaEncountersResponse();

    when(pokeApiXmlService.getLocationAreaEncountersFromJson(Mockito.anyString(),
        Mockito.anyString())).thenReturn(getLocationAreaEncountersResponse);

    when(httpServletRequest.getRemoteAddr()).thenReturn("localhost:8080");

    assertThat(this.pokeApiConsumer.getLocationAreaEncounters(getLocationAreaEncountersRequest)
        .getLocationAreas()).isEqualTo("https://pokeapi.co/api/v2/pokemon/7/encounters");
  }

}
