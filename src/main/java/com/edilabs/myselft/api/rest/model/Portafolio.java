package com.edilabs.myselft.api.rest.model;

import lombok.*;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Portafolio {

    private List<Project> projects;


}
