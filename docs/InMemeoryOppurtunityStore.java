package edu.famu.cop3060.yard.store;

import edu.famu.cop3060.yard.dto.OpportunityDTO;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class InMemoryOpportunityStore {

    private final Map<String, OpportunityDTO> opportunityMap = new HashMap<>();
    private final List<OpportunityDTO> opportunityList = new ArrayList<>();

    public InMemoryOpportunityStore() {

        OpportunityDTO opp1 = new OpportunityDTO(
                "opp-001",
                "UNCF STEM Scholarship",
                "Scholarship",
                "UNCF",
                "2025-04-15",
                "Scholarship for STEM students",
                List.of("STEM", "paid", "undergrad"),
                "https://uncf.org"
        );

        opportunityMap.put(opp1.getId(), opp1);
        opportunityList.add(opp1);
    }

    public List<OpportunityDTO> findAll() {
        return Collections.unmodifiableList(opportunityList);
    }

    public Optional<OpportunityDTO> findById(String id) {
        return Optional.ofNullable(opportunityMap.get(id));
    }
}
