package com.example.book_sum.ui.slideshow;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.book_sum.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        TextView linkTextView0 = root.findViewById(R.id.pranav);
        linkTextView0.setLinkTextColor(Color.BLUE);
        linkTextView0.setMovementMethod(LinkMovementMethod.getInstance());


        TextView linkTextView1 = root.findViewById(R.id.aniket);
        linkTextView1.setLinkTextColor(Color.BLUE);
        linkTextView1.setMovementMethod(LinkMovementMethod.getInstance());


        TextView linkTextView2 = root.findViewById(R.id.karan);
        linkTextView2.setLinkTextColor(Color.BLUE);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());


        TextView linkTextView3 = root.findViewById(R.id.nitish);
        linkTextView3.setLinkTextColor(Color.BLUE);
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());


        return root;
    }
}