package com.rds.user;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserModel {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
