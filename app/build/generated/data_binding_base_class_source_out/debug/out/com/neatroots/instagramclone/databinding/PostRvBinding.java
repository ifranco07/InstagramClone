// Generated by view binder compiler. Do not edit!
package com.neatroots.instagramclone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.neatroots.instagramclone.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PostRvBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView csption;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final ImageView like;

  @NonNull
  public final TextView name;

  @NonNull
  public final ImageView postImage;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final ImageView share;

  @NonNull
  public final TextView time;

  private PostRvBinding(@NonNull CardView rootView, @NonNull TextView csption,
      @NonNull ImageView imageView8, @NonNull ImageView like, @NonNull TextView name,
      @NonNull ImageView postImage, @NonNull CircleImageView profileImage, @NonNull ImageView share,
      @NonNull TextView time) {
    this.rootView = rootView;
    this.csption = csption;
    this.imageView8 = imageView8;
    this.like = like;
    this.name = name;
    this.postImage = postImage;
    this.profileImage = profileImage;
    this.share = share;
    this.time = time;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PostRvBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PostRvBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.post_rv, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PostRvBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.csption;
      TextView csption = ViewBindings.findChildViewById(rootView, id);
      if (csption == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.like;
      ImageView like = ViewBindings.findChildViewById(rootView, id);
      if (like == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.post_image;
      ImageView postImage = ViewBindings.findChildViewById(rootView, id);
      if (postImage == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.share;
      ImageView share = ViewBindings.findChildViewById(rootView, id);
      if (share == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      return new PostRvBinding((CardView) rootView, csption, imageView8, like, name, postImage,
          profileImage, share, time);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}