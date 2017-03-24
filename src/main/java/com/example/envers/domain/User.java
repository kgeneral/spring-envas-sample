package com.example.envers.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Audited
@Entity
@Data
@Accessors(chain = true)
public class User {
    @Id @GeneratedValue
    private String userId;
    private String userName;
}
