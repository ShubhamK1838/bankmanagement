package com.bank.entity;

import com.bank.enums.Gender;
import com.bank.enums.MaritalStatus;
import jakarta.persistence.*;
import org.springframework.validation.annotation.Validated;

import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;
    @Column(name = "middle_name" , length = 20, nullable = false )
    private String middleName;
    @Column(name = "last_name", length = 20, nullable = false)
    private String lastName;
    @Column(length = 30, unique = true, nullable = false)
    private String email;
    @Column(length = 10, nullable = false)
    private long phone;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Address address;
    @Column(length = 30)
    private String religion;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    private int age;
    @Column(length =12 , nullable = false)
    private String aadharCard;
    @Column(nullable = false, length = 8)
    private String panCard;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private long income;
    @Temporal(TemporalType.DATE)
    private Date dob ;
    @Column(length = 30, nullable = false)
    private String education;
    @Column(length = 30, nullable = false)
    private String occupation;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Profile profile;

    public Customer() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", religion='" + religion + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", age=" + age +
                ", aadharCard='" + aadharCard + '\'' +
                ", panCard='" + panCard + '\'' +
                ", gender=" + gender +
                ", income=" + income +
                ", dob=" + dob +
                ", eduction='" + education + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
