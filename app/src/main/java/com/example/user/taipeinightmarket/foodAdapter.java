package com.example.user.taipeinightmarket;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class foodAdapter extends BaseAdapter{

    private Context mContext;
    private List<foodDetail> mItems;

    public foodAdapter (Context context,List<foodDetail> items){
        this.mContext=context;
        mItems=items;
    }

    @Override
    public int getCount() {
        //取得資料筆數
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        //取得該筆資料
        return position;
    }

    @Override
    public long getItemId(int position) {
        //取得該筆資料的position
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        try{
            if(convertView==null){
                // inflate the GridView item layout
                LayoutInflater inflater = LayoutInflater.from(mContext);
                convertView = inflater.inflate(R.layout.fooddetail, null);
                // initialize the view holder
                holder = new ViewHolder();
                holder.tvName = (TextView) convertView.findViewById(R.id.tvFname);
                holder.tvImage=(ImageView) convertView.findViewById(R.id.tvFimage);
                convertView.setTag(holder);
            }else{
                holder = (ViewHolder)convertView.getTag();
            }

            foodDetail item = mItems.get(position);
            holder.tvName.setText(item.fName);


        }catch(Exception e){
            e.printStackTrace();
        }


        return null;
    }

    private static class ViewHolder{
        TextView tvName;
        ImageView tvImage;
    }
}
