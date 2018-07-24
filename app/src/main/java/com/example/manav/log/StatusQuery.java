package com.example.manav.log;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StatusQuery extends AppCompatActivity {

    private DatabaseReference mUserDatabase;
    String searchFieldpassport ="",searchfieldRegNo="",searchFieldfileNo="";
    TextView mResultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_query);

        Bundle bundle =getIntent().getExtras();
        searchFieldpassport=bundle.getString("passportnum");
        searchfieldRegNo=bundle.getString("filenum");
        searchFieldfileNo=bundle.getString("onlinereg");
        mResultTextView=findViewById(R.id.myresultTextView);

        mUserDatabase= FirebaseDatabase.getInstance().getReference();
        mUserDatabase.keepSynced(true);

        mUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot data : dataSnapshot.getChildren()){
                    if(data.child("passportnum").getValue().toString().equals(searchFieldpassport)
                            //&&data.child("filenum").getValue().toString().equals(searchFieldfileNo)
                            //&&data.child("onlineregnum").getValue().toString().equals(searchfieldRegNo)
                            ){
                        mResultTextView.setText(data.child("moreinfo").getValue().toString());
                        break;
                    }else{
                                            mResultTextView.setText(getText(R.string.stylish_text4));
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
