package com.zakado.zkd.usersmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users", schema = "usersdb")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nid", nullable = false)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Boolean enable = false;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reviews> reviews;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_has_authorities",
            joinColumns = {@JoinColumn(name = "id_user_fk", referencedColumnName = "nid")},
            inverseJoinColumns = {@JoinColumn(name = "id_authorities_fk", referencedColumnName = "nid")})
    private List<Rol> roles;

    public void addReviews(Reviews review) {
        getReviews().add(review);
        review.setUser(this);
    }

    public void removeReviews(Reviews review) {
        if (review != null) {
            getReviews().remove(review);
        }
    }

}
