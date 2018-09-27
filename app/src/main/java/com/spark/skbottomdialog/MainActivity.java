package com.spark.skbottomdialog;

import android.app.Dialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showBottomDialog(View view) {
//        View view1 = View.inflate(this, R.layout.dialog_bottom, null);
//        view1.findViewById(R.id.cancelBtn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                shortToast("Cancel Dialog");
//
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        dialog.dismiss();
//                    }
//                }, 500);
//            }
//        });
//        dialog = new Dialog(this, R.style.dialog_bottom_full);
//
//        Window window = dialog.getWindow();
//        window.setContentView(view1);
//
//        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
//
//        window.setGravity(Gravity.BOTTOM);
//        window.setWindowAnimations(R.style.BottomDialogAnimation);
//        dialog.show();

        dialog = new SKBottomDialog(this, R.style.dialog_bottom_full);
        dialog.show();


    }





    private void shortToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
