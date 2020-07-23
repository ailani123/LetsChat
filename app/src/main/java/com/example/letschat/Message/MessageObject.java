package com.example.letschat.Message;

import java.util.ArrayList;

public class MessageObject {
    String messageId,sendertId,messgae;
    ArrayList<String> mediaUrlList;
    public MessageObject(String messageId,String sendertId,String message, ArrayList<String> mediaUrlList){
        this.messageId = messageId;
        this.sendertId = sendertId;
        this.messgae = message;
        this.mediaUrlList = mediaUrlList;
    }
    public String getMessageId(){return messageId;}
    public String getSendertId(){return sendertId;}
    public String getMessgae(){return messgae;}
    public ArrayList<String> getMediaUrlList() {return mediaUrlList; }
}
