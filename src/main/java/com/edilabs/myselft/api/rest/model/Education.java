package com.edilabs.myselft.api.rest.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Education {
    private String school;
    private String degree ;
    private String graduated;

}
