package com.wehee.domain.auth.info;

import com.wehee.domain.user.entity.Gender;
import java.util.Map;

public abstract class OAuth2UserInfo {
    protected Map<String, Object> attributes;

    public OAuth2UserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public abstract String getProviderId();
    public abstract String getEmail();
    public abstract String getImageUrl();
    public abstract String getBirth();
    public abstract Gender getGender();
}
