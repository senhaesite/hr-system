package br.com.cylon.payrollapi.dto;

public class PayrollDTO {

    private String workerName;
    private String description;
    private Double hourlyPrice;
    private Double workedHours;
    private Double totalPayment;

    //CONSTRUCTOR

    public PayrollDTO() {
    }

    public PayrollDTO(String workerName, String description, Double hourlyPrice, Double workedHours, Double totalPayment) {
        this.workerName = workerName;
        this.description = description;
        this.hourlyPrice = hourlyPrice;
        this.workedHours = workedHours;
        this.totalPayment = totalPayment;
    }

    //GET & SET

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(Double hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    public Double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(Double workedHours) {
        this.workedHours = workedHours;
    }

    public Double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Double totalPayment) {
        this.totalPayment = totalPayment;
    }

}
