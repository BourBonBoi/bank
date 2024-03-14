package com.example.bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class RegistrationDialogFragment extends DialogFragment {
    private EditText username;
    private EditText password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.registration_dialog, container, false);

        username = view.findViewById(R.id.username);
        password = view.findViewById(R.id.password);

        Button loginButton = view.findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername = username.getText().toString();
                String inputPassword = password.getText().toString();

                if (inputUsername.equals("admin") && inputPassword.equals("admin")) {
                    Toast.makeText(getActivity(), "Login successful!", Toast.LENGTH_SHORT).show();

                    // Perform transition to another screen (Assuming profile.class is the name of the activity)
                    Intent intent = new Intent(getActivity(), profile.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getActivity(), "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}