// Generated by view binder compiler. Do not edit!
package com.neatroots.instagramclone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.makeramen.roundedimageview.RoundedImageView;
import com.neatroots.instagramclone.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPostBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final TextInputEditText caption;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final MaterialToolbar materialToolbar;

  @NonNull
  public final LinearLayout post;

  @NonNull
  public final Button postButton;

  @NonNull
  public final RoundedImageView selectImage;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  private ActivityPostBinding(@NonNull ConstraintLayout rootView, @NonNull Button cancelButton,
      @NonNull TextInputEditText caption, @NonNull ImageView imageView3,
      @NonNull MaterialToolbar materialToolbar, @NonNull LinearLayout post,
      @NonNull Button postButton, @NonNull RoundedImageView selectImage,
      @NonNull TextInputLayout textInputLayout, @NonNull TextView textView3,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.cancelButton = cancelButton;
    this.caption = caption;
    this.imageView3 = imageView3;
    this.materialToolbar = materialToolbar;
    this.post = post;
    this.postButton = postButton;
    this.selectImage = selectImage;
    this.textInputLayout = textInputLayout;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_post, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPostBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_button;
      Button cancelButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelButton == null) {
        break missingId;
      }

      id = R.id.caption;
      TextInputEditText caption = ViewBindings.findChildViewById(rootView, id);
      if (caption == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.materialToolbar;
      MaterialToolbar materialToolbar = ViewBindings.findChildViewById(rootView, id);
      if (materialToolbar == null) {
        break missingId;
      }

      id = R.id.post;
      LinearLayout post = ViewBindings.findChildViewById(rootView, id);
      if (post == null) {
        break missingId;
      }

      id = R.id.post_button;
      Button postButton = ViewBindings.findChildViewById(rootView, id);
      if (postButton == null) {
        break missingId;
      }

      id = R.id.select_image;
      RoundedImageView selectImage = ViewBindings.findChildViewById(rootView, id);
      if (selectImage == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityPostBinding((ConstraintLayout) rootView, cancelButton, caption, imageView3,
          materialToolbar, post, postButton, selectImage, textInputLayout, textView3, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
