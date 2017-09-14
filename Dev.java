package com.example.afolabi.codershub;

import java.io.Serializable;

/**
 * Created by Funmilola Afolabi on 13/09/2017.
 */

public class Dev  implements Serializable {
    private String username;
    private String profileUrl;
    private String photoUrl;

    public Dev(String username, String profileUrl, String photoUrl) {
        super();
        this.username = username;
        this.profileUrl = profileUrl;
        this.photoUrl = photoUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

}



