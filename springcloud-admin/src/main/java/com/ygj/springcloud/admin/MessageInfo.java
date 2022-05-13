package com.ygj.springcloud.admin;

/**
 * @Auther: ygj
 * @Date: 2022/5/12 - 05 - 12 - 18:12
 */
public class MessageInfo {

    private String content;
    public MessageInfo(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
