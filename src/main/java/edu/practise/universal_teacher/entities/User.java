package edu.practise.universal_teacher.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "app_users")
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO) ід буде приходити з гугла, тому немає сенсу їх автогенерувати
    @Column(name = "id")
    private Long id;

    @Email
    private String email;
    //@JsonIgnore
    private String password;
    /**
     * https://www.baeldung.com/jpa-one-to-one
     */

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "profile_user",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = { @JoinColumn(name = "usr_profile_id", referencedColumnName = "id")})
    private UsrProfile profile;

    //@OneToMany(mappedBy = "app_users")
    //private Set<Role> roles;


    public User(@Email String email, String password, UsrProfile profile) {
        this.email = email;
        this.password = password;
        this.profile = profile;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsrProfile getProfile() {
        return profile;
    }

    public void setProfile(UsrProfile profile) {
        this.profile = profile;
    }
}
