package com.example.sanjeevanifinal.utils;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.sanjeevanifinal.R;
import com.example.sanjeevanifinal.activities.CallsActivity;
import com.example.sanjeevanifinal.activities.ChatListActivity;
import com.example.sanjeevanifinal.activities.PatientHomeActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationHelper {

    public static void enableNavigation(final Context context , BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.doctorChats:
                        Intent intent1 = new Intent(context, ChatListActivity.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.monitorHealth:
                        Intent intent2 = new Intent(context, PatientHomeActivity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.calls:
                        Intent intent4 = new Intent(context, CallsActivity.class);
                        context.startActivity(intent4);
                        break;

                }

                return false;
            }
        });
    }


}
