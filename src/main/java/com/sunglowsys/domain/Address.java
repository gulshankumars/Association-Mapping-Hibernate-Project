package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "addresss")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id ;

    @Column(name = "addressline1")
    private String addressLine1 ;

    @Column(name = "addressline2")
    private String getAddressLine2 ;

    @Column(name = "landmark",nullable = false)
    private String landmark ;

    @Column(name = "city",nullable = false)
    private String city ;

    @Column(name = "state",nullable = false)
    private String state ;

    @Column(name = "pincode",nullable = false)
    private String pincode ;

    public Address(){}

    public Address(String addressLine1, String getAddressLine2, String landmark, String city, String state, String pincode) {
        this.addressLine1 = addressLine1;
        this.getAddressLine2 = getAddressLine2;
        this.landmark = landmark;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getGetAddressLine2() {
        return getAddressLine2;
    }

    public void setGetAddressLine2(String getAddressLine2) {
        this.getAddressLine2 = getAddressLine2;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(addressLine1, address.addressLine1) && Objects.equals(getAddressLine2, address.getAddressLine2) && Objects.equals(landmark, address.landmark) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(pincode, address.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressLine1, getAddressLine2, landmark, city, state, pincode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", getAddressLine2='" + getAddressLine2 + '\'' +
                ", landmark='" + landmark + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
