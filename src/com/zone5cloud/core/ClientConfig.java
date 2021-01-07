package com.zone5cloud.core;

import com.zone5cloud.core.oauth.AuthToken;

import java.net.URL;

public class ClientConfig {
    // The initial authorization token to be used in the Authorization header for all requests which require it.
    // token may be null and can be set later via setToken(), or automatically set with a login request
    AuthToken token;

    // Authentication service API key, Your OAuth app clientId (optional for S-Digital systems)
    String clientID;

    // Authentication service API secret, Cognito only. Set to null for Gigya keys.Your OAuth app secret (not needed for S-Digital systems)
    String clientSecret;

    // Users email address
    String userName;

    URL zone5BaseUrl;

    public AuthToken getToken() {
        return token;
    }

    public void setToken(AuthToken token) { this.token = token; }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public URL getZone5BaseUrl() { return zone5BaseUrl; }

    public void setZone5BaseUrl(URL zone5BaseUrl) { this.zone5BaseUrl = zone5BaseUrl; }
}
