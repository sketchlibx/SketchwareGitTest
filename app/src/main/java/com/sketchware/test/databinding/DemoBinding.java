// Generated file. Do not modify.
package com.sketchware.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public final class DemoBinding {
    public final LinearLayout rootView;


    private DemoBinding(LinearLayout rootView) {
        this.rootView = rootView;

    }

    public LinearLayout getRoot() {
        return rootView;
    }

    public static DemoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DemoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.demo, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static DemoBinding bind(View view) {
        LinearLayout rootView = (LinearLayout) view;


        return new DemoBinding(rootView);
    }

    private static <T extends View> T findChildViewById(View rootView, int id) {
         if (rootView instanceof ViewGroup) {
              ViewGroup rootViewGroup = (ViewGroup) rootView;
              for (int i = 0; i < rootViewGroup.getChildCount(); i++) {
                   T view = rootViewGroup.getChildAt(i).findViewById(id);
                   if (view != null) return view;
              }
         }
         return null;
    }
}