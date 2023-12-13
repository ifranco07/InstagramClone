// Generated by view binder compiler. Do not edit!
package com.neatroots.instagramclone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.neatroots.instagramclone.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView addImage;

  @NonNull
  public final TextInputLayout email;

  @NonNull
  public final TextView loginBtn;

  @NonNull
  public final TextInputLayout name;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final Button singUpBtn;

  private ActivitySignUpBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircleImageView addImage, @NonNull TextInputLayout email, @NonNull TextView loginBtn,
      @NonNull TextInputLayout name, @NonNull TextInputLayout password,
      @NonNull CircleImageView profileImage, @NonNull Button singUpBtn) {
    this.rootView = rootView;
    this.addImage = addImage;
    this.email = email;
    this.loginBtn = loginBtn;
    this.name = name;
    this.password = password;
    this.profileImage = profileImage;
    this.singUpBtn = singUpBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addImage;
      CircleImageView addImage = ViewBindings.findChildViewById(rootView, id);
      if (addImage == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputLayout email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.login_btn;
      TextView loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.name;
      TextInputLayout name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputLayout password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.sing_up_btn;
      Button singUpBtn = ViewBindings.findChildViewById(rootView, id);
      if (singUpBtn == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ConstraintLayout) rootView, addImage, email, loginBtn, name,
          password, profileImage, singUpBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}