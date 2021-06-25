package com.example.android.becarev1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class contactFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        view = inflater.inflate(R.layout.fragment_contact, container, false);
        androidx.cardview.widget.CardView fbCard = (androidx.cardview.widget.CardView) view.findViewById(R.id.fb_card);
        fbCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/379467165724328"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/becareone")));
                }
            }
        });
        androidx.cardview.widget.CardView btnWhatsapp = (androidx.cardview.widget.CardView) view.findViewById(R.id.wa_card);

        btnWhatsapp.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String url = "https://api.whatsapp.com/send?phone=+201062537466";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        } );
        androidx.cardview.widget.CardView call = (androidx.cardview.widget.CardView) view.findViewById(R.id.phone_card);
        call.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String number = "+201062537466";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+number));
                startActivity(intent);

            }
        } );
        return view;
    }
}