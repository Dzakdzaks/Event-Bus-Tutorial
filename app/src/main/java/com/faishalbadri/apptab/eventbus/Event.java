package com.faishalbadri.apptab.eventbus;

/**
 * Created by faishal on 14/11/17.
 */

public class Event {

  public static class FragmentActivityDetail {
    private String Image, Detail;

    public FragmentActivityDetail(String image, String detail) {
      Image = image;
      Detail = detail;
    }

    public String getImage() {
      return Image;
    }

    public String getDetail() {
      return Detail;
    }
  }

}
