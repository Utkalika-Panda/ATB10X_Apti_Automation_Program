package com.utkalikapanda.manual_pojo;

public class booking {
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositepaid() {
        return depositepaid;
    }

    public void setDepositepaid(boolean depositepaid) {
        this.depositepaid = depositepaid;
    }

    public String getAdditionalneed() {
        return additionalneed;
    }

    public void setAdditionalneed(String additionalneed) {
        this.additionalneed = additionalneed;
    }

    public booking_dates getBooking_dates() {
        return booking_dates;
    }

    public void setBooking_dates(booking_dates booking_dates) {
        this.booking_dates = booking_dates;
    }

    private String lastname;
    private Integer totalprice;
    private boolean depositepaid;
    private  String additionalneed;
    private booking_dates booking_dates;

}
