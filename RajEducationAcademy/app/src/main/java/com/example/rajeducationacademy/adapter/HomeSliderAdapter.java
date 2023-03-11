package com.itdose.ccare.views.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.itdose.ccare.R;
import com.itdose.ccare.models.response.responseNewsAndOffer.ResponseItem;
import com.itdose.ccare.newTech.utils.Utils;

import java.util.List;

public class HomeSliderAdapter extends PagerAdapter{
    List<ResponseItem> str;

    MVP mvp;

    // ArrayList<Integer> str=new ArrayList<Integer>();

    Context ctx;
    private LayoutInflater layoutInflater;

    public HomeSliderAdapter(List<ResponseItem> str, Context ctx, MVP mvp1) {
        this.str = str;
        this.ctx = ctx;
        this.mvp = mvp1;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.items_view_pager, container, false);
        ImageView img=view.findViewById(R.id.img_slider);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvp.getId("");

            }
        });


//        Picasso.get()
//                .load(Constaints.IMAGE_URL+"sidebanner/"+str.get(position))
//                .placeholder(R.drawable.fruits)
//                .into(img);

//        Bitmap bitmap=Utils.convertBase64ToBitmap(str.get(position).getImage());
//        String image=Utils.BitMapToString(bitmap);

        final String encodedString = str.get(position).getImage();
        final String pureBase64Encoded = encodedString.substring(encodedString.indexOf(",")  + 1);

        final byte[] decodedBytes = Base64.decode(pureBase64Encoded, Base64.DEFAULT);
        Glide.with(ctx).load(decodedBytes).into(img);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        View view = (View) object;
        container.removeView(view);
    }

    public HomeSliderAdapter(Context ctx) {
        this.ctx = ctx;
    }
    @Override
    public int getCount() {
        return str.size();
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
