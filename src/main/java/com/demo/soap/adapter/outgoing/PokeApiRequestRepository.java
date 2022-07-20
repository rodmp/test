package com.bankaya.soap.adapter.outgoing;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bankaya.soap.core.domain.PokeApiRequest;

public interface PokeApiRequestRepository extends JpaRepository<PokeApiRequest, Long> {

}
