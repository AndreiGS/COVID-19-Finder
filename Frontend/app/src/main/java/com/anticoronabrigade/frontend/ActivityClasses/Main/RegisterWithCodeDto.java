package com.anticoronabrigade.frontend.ActivityClasses.Main;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterWithCodeDto {
    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("code")
    @Expose
    private Integer code;

    public RegisterWithCodeDto() {
    }

    public RegisterWithCodeDto(String email, String password, Integer code) {
        this.email = email;
        this.password = password;
        this.code=code;
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
}
