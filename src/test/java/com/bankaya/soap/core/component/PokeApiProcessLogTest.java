package com.bankaya.soap.core.component;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bankaya.soap.adapter.outgoing.PokeApiRequestRepository;
import com.bankaya.soap.core.domain.OperationMethod;
import com.bankaya.soap.core.domain.PokeApiRequest;

@ExtendWith(MockitoExtension.class)
public class PokeApiProcessLogTest {

  @InjectMocks
  private PokeApiProcessLog pokeApiProcessLog;

  @Mock
  private PokeApiRequestRepository pokeApiRepository;

  @Test
  public void whenProcessRequestLog_then_SaveprocessRequestLog() {
    PokeApiRequest pokeApiRequest = PokeApiRequest.builder().originIp("localhost:8080")
        .operationMethod(OperationMethod.GET_ABILITIES.name())
        .requestDate(LocalDateTime.now().toString()).id(2l).build();

    when(this.pokeApiRepository.save(Mockito.any())).thenReturn(pokeApiRequest);

    assertThat(pokeApiProcessLog.processRequestLog(OperationMethod.GET_ABILITIES, "localhost:8080")
        .getId()).isEqualTo(2);


  }
}
