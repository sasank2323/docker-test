package com.example.demo.Dto;

public class PersonDTO {
    private String name;
    private String email;
    private String phone;
    private String city;
    private String designation;

    public PersonDTO(String name, String email, String phone, String city, String designation) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.designation = designation;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCity() { return city; }
    public String getDesignation() { return designation; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setCity(String city) { this.city = city; }
    public void setDesignation(String designation) { this.designation = designation; }
}

