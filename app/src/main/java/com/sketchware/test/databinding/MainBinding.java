// Generated file. Do not modify.
package com.sketchware.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class MainBinding {
    public final LinearLayout rootView;
    public final LinearLayout linear1;
    public final TextView textview1;

    private MainBinding(LinearLayout rootView, LinearLayout linear1, TextView textview1) {
        this.rootView = rootView;
        this.linear1 = linear1;
        this.textview1 = textview1;
    }

    public LinearLayout getRoot() {
        return rootView;
    }

    public static MainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View root = inflater.inflate(R.layout.main, parent, false);
        if (attachToParent) parent.addView(root);
        return bind(root);
    }

    public static MainBinding bind(View view) {
        LinearLayout rootView = (LinearLayout) view;
        LinearLayout linear1 = findChildViewById(view, R.id.linear1);
        TextView textview1 = findChildViewById(view, R.id.textview1);

        if (linear1 == null || textview1 == null) {
             throw new IllegalStateException("Required views are missing");
        }

        return new MainBinding(rootView, linear1, textview1);
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