package com.edilabs.myselft.api.rest.model;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {

    private String title;
    private String description ;
    private String category ;
    private String tags;
    private String image;
    private String url;
    private  String modal;


}
