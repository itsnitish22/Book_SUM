package com.example.book_sum.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.book_sum.MainActivity;
import com.example.book_sum.R;
import com.example.book_sum.Sort_Page;
import com.example.book_sum.Splash_Screen;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button getstarted;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        getstarted=root.findViewById(R.id.button);
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getstarted_intent = new Intent(getContext(), Sort_Page.class);
                startActivity(getstarted_intent);
            }
        });
        return root;

    }
}