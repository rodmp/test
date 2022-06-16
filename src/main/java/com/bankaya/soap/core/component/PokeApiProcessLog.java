package com.bankaya.soap.core.component;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;
import com.bankaya.soap.adapter.outgoing.PokeApiRequestRepository;
import com.bankaya.soap.core.domain.OperationMethod;
import com.bankaya.soap.core.domain.PokeApiRequest;
import com.bankaya.soap.core.interfaces.PokeApiProcessLogService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PokeApiProcessLog implements PokeApiProcessLogService {

  private final PokeApiRequestRepository pokeApiRepository;

  public PokeApiProcessLog(final PokeApiRequestRepository pokeApiRepository) {
    this.pokeApiRepository = pokeApiRepository;
  }

  @Override
  public PokeApiRequest processRequestLog(OperationMethod requestMethod, String requestIp) {
    PokeApiRequest pokeApiRequest = PokeApiRequest.builder().originIp(requestIp)
        .operationMethod(requestMethod.name()).requestDate(LocalDateTime.now().toString()).build();

    log.info("Save process request info: [{}]", pokeApiRequest);
    return pokeApiRepository.save(pokeApiRequest);
  }


}
