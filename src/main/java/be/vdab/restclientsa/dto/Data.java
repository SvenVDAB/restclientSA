package be.vdab.restclientsa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Data(long id,
        @JsonProperty("first_name") String firstName,
        @JsonProperty("last_name") String lastName) {
}
