package com.edilabs.myselft.api.rest.model;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Person {
    private String name;
    private int age;
    @Id
    private Long id;


}
