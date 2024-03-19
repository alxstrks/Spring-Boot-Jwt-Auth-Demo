package com.example.myappjwtauthspring.payload.response;

public class MessageResponse {
    private String message;

    public MessageResponse(String mesasge) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
