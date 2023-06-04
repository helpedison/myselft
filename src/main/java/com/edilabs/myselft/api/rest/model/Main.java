package com.edilabs.myselft.api.rest.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Main {

    private String name ;
    private String occupation;
    private String description;
    private String image;
    private String bio;
    private String email;
    private String phone;
    private Address address;
    private String website;
    private String resumedownload;
    private List<Social> social;

}
