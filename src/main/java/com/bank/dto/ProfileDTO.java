package com.bank.dto;

import org.springframework.web.multipart.MultipartFile;

public class ProfileDTO {

    private int id;
    private String name;
    private long Size;
    private String type;
    private ProfileDataDTO profileData;

    public ProfileDTO() {

    }

    public ProfileDTO(MultipartFile imageFile) {
        if (imageFile == null) return;
        this.profileData = new ProfileDataDTO();
        this.setName(imageFile.getOriginalFilename());
        this.setSize(imageFile.getSize());
        this.setType(imageFile.getContentType());
        try {

            this.profileData.setData(imageFile.getInputStream().readAllBytes());
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return Size;
    }

    public void setSize(long size) {
        Size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProfileDataDTO getProfileData() {
        return profileData;
    }

    public void setProfileData(ProfileDataDTO profileDataDTO) {
        this.profileData= profileDataDTO;
    }
}
