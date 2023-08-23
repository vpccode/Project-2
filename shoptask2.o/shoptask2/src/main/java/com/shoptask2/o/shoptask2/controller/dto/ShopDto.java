package com.shoptask2.o.shoptask2.controller.dto;




public class ShopDto {
    

   

        private String username;

        private String email;

        private String password;

       

        public ShopDto() {
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
            return "Shopmodel [ username=" + username + ", email=" + email + ", password=" + password
                    + "]";
        }




    
}

    

