package com.bankaya.soap.core.interfaces;

import com.bankaya.soap.core.domain.OperationMethod;
import com.bankaya.soap.core.domain.PokeApiRequest;

public interface PokeApiProcessLogService {

  PokeApiRequest processRequestLog(OperationMethod requestMethod, String requestIp);
}
