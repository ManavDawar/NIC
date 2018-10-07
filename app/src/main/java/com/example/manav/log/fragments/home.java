package com.example.manav.log.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.manav.log.R;
import com.example.manav.log.subActivities.Aboutus;
import com.example.manav.log.subActivities.ConnectWithUs;
import com.example.manav.log.subActivities.Faq;
import com.example.manav.log.subActivities.Oci;
import com.example.manav.log.subActivities.OciEnquiry;
import com.example.manav.log.subActivities.OciRegistration;
import com.example.manav.log.subActivities.complaints;


public class home extends Fragment {

    ImageView aboutUs,oci,connectWithUs,ociRegister,ociEnquiry,complaint,faq,share;

    public home() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        aboutUs=view.findViewById(R.id.imageview_aboutus);
        oci=view.findViewById(R.id.imageViewoci);
        connectWithUs=view.findViewById(R.id.imageViewConnectWithUs);
        ociRegister=view.findViewById(R.id.imageViewociRegister);
        ociEnquiry=view.findViewById(R.id.imageViewociEnquiry);
        complaint=view.findViewById(R.id.imageViewcomplaint);
        faq=view.findViewById(R.id.imageViewFAQ);
        share=view.findViewById(R.id.imageViewshare);

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getContext(), Aboutus.class);
                startActivity(intent);

            }
        });
        oci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getContext(),Oci.class);
                startActivity(intent);

            }
        });
        connectWithUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getContext(), ConnectWithUs.class);
                startActivity(intent);
            }
        });
        ociRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getContext(), OciRegistration.class);
                startActivity(intent);

            }
        });
        ociEnquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getContext(), OciEnquiry.class);
                startActivity(intent);

            }
        });
        complaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getContext(),complaints.class);
                startActivity(intent);

            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getContext(),Faq.class);
                startActivity(intent);

            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        return view;
    }


  }

