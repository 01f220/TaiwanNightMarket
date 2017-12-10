package com.example.user.taipeinightmarket;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by user on 2016/11/12.
 */
public class foodDetail {
    public String fName;
    public int fImage;

    public foodDetail(String _name, int _image){
        //this.fName = _name;
        //this.fImage = _image;
        setfName(_name);
        setfImage(_image);
    }

    public String getfName(){return fName;}
    public void setfName(String name){this.fName=name;}
    public int getfImage(){return fImage;}
    public void setfImage(int imageid){this.fImage=imageid;}
}
