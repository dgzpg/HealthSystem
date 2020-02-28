package com.application.entity.client;

import lombok.Data;

/** @author PG */
@Data
public class UserInfoClient {
  private Long account;
  private String userName;
  private byte[] pic;
  private String intro;
  // 粉丝数量
  private int fans;
  // 关注数量
  private int attentions;

  public UserInfoClient() {}

  public UserInfoClient(
      Long account, String userName, byte[] pic, String intro, int fans, int attentions) {
    this.account = account;
    this.userName = userName;
    this.pic = pic;
    this.intro = intro;
    this.fans = fans;
    this.attentions = attentions;
  }
}