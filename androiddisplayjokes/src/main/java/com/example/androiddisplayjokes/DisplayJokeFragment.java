package com.example.androiddisplayjokes;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayJokeFragment extends Fragment {
    String joke;
    Context context;
    public void setJoke(String joke) {
        this.joke = joke;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_display_joke, container, false);
        TextView textView = root.findViewById(R.id.Joke_tv);
        Log.i("display Fragment", joke);
        textView.setText(joke);
//        Toast.makeText(context,joke , Toast.LENGTH_SHORT).show();
        return root;
    }
}
