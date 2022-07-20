package com.bankaya.soap.core.business;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bankaya.soap.adapter.outgoing.PokeApiClient;
import com.bankaya.soap.core.interfaces.PokeApiProcessLogService;
import com.bankaya.soap.core.mapper.PokeApiMapper;
import com.bankaya.soap.core.model.json.PokeApiResponse;
import com.bankaya.soap.core.util.JsonConvertsMock;
import com.bankaya.soap.core.util.XmlConvertsMock;
import com.pokeapi.soap.generation.PokeApi;

@ExtendWith(MockitoExtension.class)
public class PokeApiXmlProcessorTest {

  @InjectMocks
  private PokeApiXmlProcessor pokeApiXmlProcessor;

  @Mock
  private PokeApiMapper pokeApiMapper;

  @Mock
  private PokeApiClient pokeApiClient;

  @Mock
  private PokeApiProcessLogService pokeApiProcessLogService;

  @Test
  public void whenGetPokeApiFromJson_then_ReturnGetPokeApiResponse() throws Exception {

    PokeApiResponse pokeApiResponse = JsonConvertsMock.getPokeApiResponse();

    PokeApi pokeApi = XmlConvertsMock.getPokeApiResponse().getPokeApi();

    when(pokeApiClient.getPokeApiJson(Mockito.anyString(), Mockito.anyString()))
        .thenReturn(pokeApiResponse);

    when(pokeApiMapper.convertPokeApiJsonToXml(Mockito.any())).thenReturn(pokeApi);

    assertThat(this.pokeApiXmlProcessor.getPokeApiFromJson("test", "localhost:8080").getPokeApi()
        .getName()).isEqualTo("beedrill");
  }
}
