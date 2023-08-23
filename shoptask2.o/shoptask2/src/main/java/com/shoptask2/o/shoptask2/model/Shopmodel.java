package com.shoptask2.o.shoptask2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Shopmodel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;

        private String username;

        private String email;

        private String password;

       

        public Shopmodel() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
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

         @Override
        public String toString() {
            return "Shopmodel [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
                    + "]";
        }




    
}

