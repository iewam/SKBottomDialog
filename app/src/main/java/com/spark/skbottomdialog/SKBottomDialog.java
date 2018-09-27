package com.spark.skbottomdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class SKBottomDialog extends Dialog {

    LayoutInflater inflater;
    Button cancelBtn;

    public SKBottomDialog(@NonNull Context context) {
        this(context, 0);
    }

    public SKBottomDialog(@NonNull Context context, int themeResId) {
        this(context, false, null);
    }

    protected SKBottomDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        inflater = LayoutInflater.from(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_bottom);

        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.gravity = Gravity.BOTTOM;
        layoutParams.width= ViewGroup.LayoutParams.MATCH_PARENT;
        layoutParams.height= ViewGroup.LayoutParams.WRAP_CONTENT;
        getWindow().setAttributes(layoutParams);

        getWindow().setBackgroundDrawableResource(R.drawable.bottom_dialog_bg);// 取消左右间隔
        getWindow().setWindowAnimations(R.style.BottomDialogAnimation);
        setCanceledOnTouchOutside(true);

        cancelBtn = (Button)findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
    }


}
