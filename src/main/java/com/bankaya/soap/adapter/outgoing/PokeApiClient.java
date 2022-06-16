package com.bankaya.soap.adapter.outgoing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import com.bankaya.soap.core.model.json.PokeApiResponse;

/**
 * Feign interface contract.
 * 
 * @author bankaya.
 *
 */
@FeignClient(name = "pokeApiFeignClient", url = "https://pokeapi.co/api/v2")
public interface PokeApiClient {

  /**
   * Client feign mapping.
   * 
   * @param pokemon Poke name.
   * @return PokeApiResponse object.
   */
  @GetMapping(path = "/pokemon/{pokemon}/")
  public PokeApiResponse getPokeApiJson(@RequestHeader(value = "user-agent") String useragent,
      @PathVariable("pokemon") String pokemon);
}
