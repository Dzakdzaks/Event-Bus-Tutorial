package com.faishalbadri.apptab.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.webkit.WebView;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.request.RequestOptions;
import com.faishalbadri.apptab.R;
import com.faishalbadri.apptab.eventbus.Event;
import com.faishalbadri.apptab.eventbus.GlobalBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


  public DetailFragment() {
    // Required empty public constructor
  }

  WebView webView;
  ImageView imageView;
  View v;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    v = inflater.inflate(R.layout.fragment_detail, container, false);
    return v;
  }



  @Subscribe
  public void getImage(Event.FragmentActivityDetail fragmentActivityDetail) {
    imageView = (ImageView) v.findViewById(R.id.image_detail);
    RequestOptions options = new RequestOptions().fitCenter().format(DecodeFormat.PREFER_ARGB_8888)
        .override(150, 150);
    Glide.with(getActivity())
        .load("http://api.santriprogrammer.com/find/img/" + fragmentActivityDetail.getImage())
        .apply(options)
        .into(imageView);
  }

  @Subscribe
  public void getDetail(Event.FragmentActivityDetail fragmentActivityDetail) {
    webView = (WebView) v.findViewById(R.id.webview_detail);
    webView.loadData(fragmentActivityDetail.getDetail(), "text/html", "uutf/-8");

  }

  @Override
  public void onStop() {
    super.onStop();
    GlobalBus.getEventBus().unregister(this);
  }

  @Override
  public void onStart() {
    super.onStart();
    GlobalBus.getEventBus().register(this);
  }

}
