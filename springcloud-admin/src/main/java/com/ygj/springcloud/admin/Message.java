package com.ygj.springcloud.admin;


/**
 * @Auther: ygj
 * @Date: 2022/5/12 - 05 - 12 - 18:11
 */
public class Message {
    private String msgtype;
    private MessageInfo text;
    public String getMsgtype() {
        return msgtype;
    }
    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
    public MessageInfo getText() {
        return text;
    }
    public void setText(MessageInfo text) {
        this.text = text;
    }

}
