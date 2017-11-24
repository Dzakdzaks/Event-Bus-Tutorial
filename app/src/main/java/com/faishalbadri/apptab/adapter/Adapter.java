package com.faishalbadri.apptab.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.request.RequestOptions;
import com.faishalbadri.apptab.data.PojoIsi.IsiBean;
import com.faishalbadri.apptab.R;
import com.faishalbadri.apptab.eventbus.Event;
import com.faishalbadri.apptab.eventbus.Event.FragmentActivityDetail;
import com.faishalbadri.apptab.eventbus.GlobalBus;
import java.util.List;

/**
 * Created by faishal on 14/11/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

  List<IsiBean> data;
  Context context;

  public Adapter(List<IsiBean> data, Context context) {
    this.data = data;
    this.context = context;
  }

  @Override
  public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View mView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.list_item, parent, false);
    final ViewHolder mViewHolder = new ViewHolder(mView);
    return mViewHolder;
  }

  @Override
  public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
    final IsiBean datalist = data.get(position);
    RequestOptions options = new RequestOptions().fitCenter().format(DecodeFormat.PREFER_ARGB_8888)
        .override(150, 150);
    Glide.with(context)
        .load("http://api.santriprogrammer.com/find/img/" + datalist.getIsi_gambar())
        .apply(options)
        .into(holder.imageView);
    holder.textView.setText(datalist.getIsi_nama());
    holder.linearLayout.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Event.FragmentActivityDetail fragmentActivityDetail = new FragmentActivityDetail(datalist.getIsi_gambar(),datalist.getIsi_keterangan());
        GlobalBus.getEventBus().post(fragmentActivityDetail);
      }
    });
  }

  @Override
  public int getItemCount() {
    return data.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    ImageView imageView;
    LinearLayout linearLayout;

    public ViewHolder(View itemView) {
      super(itemView);
      textView = (TextView) itemView.findViewById(R.id.texview_item);
      imageView = (ImageView) itemView.findViewById(R.id.imageview_item);
      linearLayout = (LinearLayout) itemView.findViewById(R.id.linearlayout_item);
    }
  }
}
