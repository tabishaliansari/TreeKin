package com.example.treekin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
        name = "user_table"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Column(name = "user_name",  nullable = false)
    private String userName;

    @Column(name = "user_userName", nullable = false)
    private String userUserName;

    @Column(name = "user_email",  nullable = false)
    private String userEmail;

    @Column(name = "user_password", nullable = false)
    private String userPassword;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

}
