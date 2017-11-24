package com.faishalbadri.apptab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.FrameLayout;
import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.faishalbadri.apptab.adapter.Adapter;
import com.faishalbadri.apptab.data.PojoIsi;
import com.faishalbadri.apptab.fragment.DetailFragment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

  RecyclerView recyclerView;
  FrameLayout frameLayout;
  RequestQueue requestQueue;
  Gson gson;
  private String url = "http://api.santriprogrammer.com/find/library/getTbIsiNew.php";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setView();
    loadData();
  }

  private void loadData() {
    StringRequest request = new StringRequest(Method.GET, url, new Response.Listener<String>() {
      @Override
      public void onResponse(String response) {
        try {
          if (String.valueOf(new JSONObject(response).getString("msg")).equals("Data Semua Isi")) {
            try {
              Log.i("Response Data", response);
              final PojoIsi isi = gson.fromJson(response, PojoIsi.class);
              final Adapter adapter = new Adapter(isi.getIsi(), MainActivity.this);
              recyclerView.setAdapter(adapter);

            } catch (Exception e) {
              e.printStackTrace();
            }
          } else {

          }
        } catch (JSONException e) {

        }

      }
    }, new Response.ErrorListener() {
      @Override
      public void onErrorResponse(VolleyError error) {
      }
    });
    requestQueue.add(request);
  }

  private void setView() {
    recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    frameLayout = (FrameLayout) findViewById(R.id.framelayout);
    requestQueue = Volley.newRequestQueue(this);
    GsonBuilder gsonBuilder = new GsonBuilder();
    gson = gsonBuilder.create();
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
    recyclerView.setLayoutManager(linearLayoutManager);

    DetailFragment detailFragment = new DetailFragment();
    detailFragment.setArguments(getIntent().getExtras());
    getSupportFragmentManager().beginTransaction()
        .replace(R.id.framelayout, detailFragment, "DetailFragment").commit();
  }

  @Override
  public void onBackPressed() {

  }
}
