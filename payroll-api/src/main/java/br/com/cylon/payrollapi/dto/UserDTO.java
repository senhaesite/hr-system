package br.com.cylon.payrollapi.dto;

public class UserDTO {

    private Long id;

    private String name;

    private String email;

    private String password;

    private Double hourlyPrice;

    //CONSTRUCTORS

    public UserDTO() {
    }

    public UserDTO(String name, String email, String password, Double hourlyPrice) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.hourlyPrice = hourlyPrice;
    }

    //GETTERS & SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Double getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(Double hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

}
