package com.example.lco;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ResultDialog extends DialogFragment {

 private Button pvButton;
 private TextView tvView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_resultdialog,container,false);
        String DialText="";
        pvButton= view.findViewById(R.id.result_ok_button);
        tvView= view.findViewById(R.id.result_text_view);

        Bundle bundle=getArguments();
        DialText=bundle.getString(LCOFaceDetection.RESULT_TEXT);
        tvView.setText(DialText);

        pvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return view;
    }
}
