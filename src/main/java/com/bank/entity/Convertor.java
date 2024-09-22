package com.bank.entity;

import com.bank.dto.AddressDTO;
import com.bank.dto.CustomerDTO;
import com.bank.dto.ProfileDTO;
import com.bank.dto.ProfileDataDTO;

public class Convertor {

    public static Customer convertCustomerEntity(CustomerDTO dto) {

        Customer entity = new Customer();
        entity.setFirstName(dto.getFirstName());
        entity.setMiddleName(dto.getMiddleName());
        entity.setLastName(dto.getLastName());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        entity.setAge(dto.getAge());
        entity.setDob(dto.getDob());
        entity.setAadharCard(dto.getAadharCard());
        entity.setMaritalStatus(dto.getMaritalStatus());
        entity.setGender(dto.getGender());
        entity.setProfile(convertProfileEntity(dto.getProfile()));
        entity.setIncome(dto.getIncome());
        entity.setAddress(convertAddressEntity(dto.getAddress()));
        entity.setEducation(dto.getEducation());
        entity.setReligion(dto.getReligion());
        entity.setPanCard(dto.getPanCard());
        entity.setOccupation(dto.getOccupation());
        entity.setId(dto.getId());
        return entity;

    }

    public static CustomerDTO convertCustomerDTO(Customer entity) {
        CustomerDTO dto = new CustomerDTO();
        dto.setFirstName(entity.getFirstName());
        dto.setMiddleName(entity.getMiddleName());
        dto.setLastName(entity.getLastName());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        dto.setAge(entity.getAge());
        dto.setDob(entity.getDob());
        dto.setAadharCard(entity.getAadharCard());
        dto.setMaritalStatus(entity.getMaritalStatus());
        dto.setGender(entity.getGender());
        dto.setProfile(convertProfileDTO(entity.getProfile()));
        dto.setIncome(entity.getIncome());
        dto.setAddress(convertAddressDTO(entity.getAddress()));
        dto.setEducation(entity.getEducation());
        dto.setReligion(entity.getReligion());
        dto.setPanCard(entity.getPanCard());
        dto.setOccupation(entity.getOccupation());
        dto.setId(entity.getId());
        return dto;
    }

    public static Address convertAddressEntity(AddressDTO dto) {
        Address entity = new Address();
        entity.setCity(dto.getCity());
        entity.setCountry(dto.getCountry());
        entity.setState(dto.getState());
        entity.setStreet(dto.getStreet());
        entity.setPinCode(dto.getPinCode());
        entity.setId(dto.getId());
        return entity;
    }

    public static AddressDTO convertAddressDTO(Address entity) {
        AddressDTO dto = new AddressDTO();
        dto.setStreet(entity.getStreet());
        dto.setCity(entity.getCity());
        dto.setCountry(entity.getCountry());
        dto.setState(entity.getState());
        dto.setPinCode(entity.getPinCode());
        dto.setId(entity.getId());
        return dto;
    }

    public static Profile convertProfileEntity(ProfileDTO dto) {
        Profile entity = new Profile();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setSize(dto.getSize());
        entity.setType(dto.getType());
        entity.setProfileData(convertProfileDataEntity(dto.getProfileData()));
        return entity;
    }

    public static ProfileDTO convertProfileDTO(Profile entity) {
        ProfileDTO dto = new ProfileDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSize(entity.getSize());
        dto.setType(entity.getType());
        dto.setProfileData(convertProfileDataDTO(entity.getProfileData()));
        return dto;
    }

    public static ProfileDataDTO convertProfileDataDTO(ProfileData entity) {
        ProfileDataDTO dto = new ProfileDataDTO();
        dto.setId(entity.getId());
        dto.setData(entity.getData());
        return dto;
    }

    public static ProfileData convertProfileDataEntity(ProfileDataDTO dto) {
        ProfileData entity = new ProfileData();
        entity.setData(dto.getData());
        entity.setId(dto.getId());
        return entity;
    }

}
