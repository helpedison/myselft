package com.edilabs.myselft.api.rest.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Resume {

    private List<Education> education ;
    private List<Work>  work;
    private List<Skill> skills;
    private String introduce;

}
