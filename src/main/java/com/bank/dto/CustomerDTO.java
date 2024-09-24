package com.bank.dto;


import com.bank.entity.Address;
import com.bank.enums.Gender;
import com.bank.entity.Profile;
import com.bank.enums.MaritalStatus;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class CustomerDTO {

    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private long phone;
    private AddressDTO address;
    private String religion;
    private MaritalStatus maritalStatus;
    private int age;
    private String aadharCard;
    private String panCard;
    private Gender gender;
    private long income;
    private Date dob ;
    private String education;
    private String occupation;
    private ProfileDTO profile;
    private MultipartFile imageFile;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile file ) {
        this.imageFile = file ;
        profile=new ProfileDTO(file);
    }

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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
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

    public ProfileDTO getProfile() {
        return profile;
    }

    public void setProfile(ProfileDTO profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                ", religion='" + religion + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", age=" + age +
                ", aadharCard='" + aadharCard + '\'' +
                ", panCard='" + panCard + '\'' +
                ", gender=" + gender +
                ", income=" + income +
                ", dob=" + dob +
                ", education='" + education + '\'' +
                ", occupation='" + occupation + '\'' +
                ", profile=" + profile +
                ", imageFile=" + imageFile +
                '}';
    }
}
