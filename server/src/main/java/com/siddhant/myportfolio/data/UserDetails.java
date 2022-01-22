package com.siddhant.myportfolio.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserDetails {

    @JsonProperty("userId")
    String userId;

    @JsonProperty("name")
    String name;

    @JsonProperty("gender")
    String gender;

    @JsonProperty("age")
    String age;
}

