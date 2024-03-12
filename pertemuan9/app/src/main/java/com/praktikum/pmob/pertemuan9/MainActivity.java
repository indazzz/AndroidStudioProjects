package com.praktikum.pmob.pertemuan9;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class MainActivity extends Activity {
    //URL json hosting
    String JsonURL = "https://crysll.000webhostapp.com/index.php";
    // Mendefiniskan Volley request queue yang akanmenangani URL request
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
// membuat volley request queue
        requestQueue = Volley.newRequestQueue(this);
// Membuat objek JsonArrayRequest class dengan nama arrayreq,
//JsonURL adalah URL yang akan diambil datanya
        JsonArrayRequest arrayreq = new
                JsonArrayRequest(JsonURL,
                //parameter kedua adalah Listener overrides dengan method //onResponse() dan melewatkan JSONArray sebagai parameter

                new Response.Listener<JSONArray>() {
                    //mengambil response dari JSON request

                    @Override

                    public void onResponse(JSONArray response) {

                        try {
                            LinearLayout linearLayout = new
                                    LinearLayout(MainActivity.this);
                            setContentView(linearLayout);

                            linearLayout.setOrientation(LinearLayout.VERTICAL);

                            for (int i = 0; i < response.length(); i++) {

//mengambil tiap JSON object didalam JSON array
                                JSONObject jsonObject = response.getJSONObject(i);
// menyimpan ke dalam string dengan nama "idemp" and"namaemp",
// dan convert dalam bentuk javascript objects
                                String idemp = jsonObject.getString("employee_id");
                                String namaemp = jsonObject.getString("employee_name");
                                TextView textView = new TextView(MainActivity.this);
                                textView.setText(idemp+", "+namaemp+"\n");
                                linearLayout.addView(textView);
                            }
                        }
                        catch (JSONException e) {
                            // jika ada error json, print ke log
                            e.printStackTrace();
                        }
                    }
                },
// parameter terakhir overrides adalah method onErrorResponse()dan // melewatkan VolleyError sebagai sebuah parameter
                new Response.ErrorListener() {
                    @Override
// handle error yang disebabkan Volley
                    public void onErrorResponse(VolleyError error)
                    {
                        Log.e("Volley", "Error");
                    }
                }
        );
        // Add JSON array request "arrayreq" ke request queue
        requestQueue.add(arrayreq);
    }
}