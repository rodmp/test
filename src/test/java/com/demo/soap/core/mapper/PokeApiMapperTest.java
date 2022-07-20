package com.bankaya.soap.core.mapper;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bankaya.soap.core.model.json.PokeApiResponse;
import com.bankaya.soap.core.util.JsonConvertsMock;
import com.bankaya.soap.core.util.XmlConvertsMock;
import com.pokeapi.soap.generation.Abilities;
import com.pokeapi.soap.generation.GetAbilitiesResponse;
import com.pokeapi.soap.generation.GetPokeApiResponse;

@ExtendWith(MockitoExtension.class)
public class PokeApiMapperTest {

  @InjectMocks
  private PokeApiMapper pokeApiMapper;

  @Test
  public void whenConvertPokeApiJsonToXml_then_ReturnPokeApi() throws Exception {
    PokeApiResponse pokeApiResponse = JsonConvertsMock.getPokeApiResponse();
    GetPokeApiResponse getPokeApiResponse = XmlConvertsMock.getPokeApiResponse();

    assertThat(this.pokeApiMapper.convertPokeApiJsonToXml(pokeApiResponse).getName())
        .isEqualTo(getPokeApiResponse.getPokeApi().getName());

  }

  @Test
  public void whenConvertJsonAbilitiesToXml_then_ReturnPokeApi() throws Exception {
    PokeApiResponse pokeApiResponse = JsonConvertsMock.getAbilityResource();
    GetAbilitiesResponse getPokeApiResponse = XmlConvertsMock.getAbilitiesResponse();

    Abilities abilities =
        this.pokeApiMapper.convertJsonAbilitiesToXml(pokeApiResponse.getAbilities());

    assertThat(abilities.getAbilityResource().get(0).getAbility().getName()).isEqualTo(
        getPokeApiResponse.getAbilities().getAbilityResource().get(0).getAbility().getName());

  }
}
