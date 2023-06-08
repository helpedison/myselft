package com.edilabs.myselft.api.rest.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Work {
    private String company;
    private String title;
    private String years;
    private String description;

}
