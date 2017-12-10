package com.example.user.taipeinightmarket;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Introduction extends AppCompatActivity {
    private String[] TPIfood,sfood,rfood,lfood,afood;   //現在夜市美食,士林美食,饒河美食,樂華美食,南機場美食
    private int[] simg=new int[]{ R.drawable.s1,R.drawable.s2,R.drawable.s4,R.drawable.s5,R.drawable.s6};  //士林圖片
    private int[] rimg=new int[]{ R.drawable.r1, R.drawable.r2,R.drawable.r3 , R.drawable.r4};       //饒河圖片
    private int[] aimg=new int[]{ R.drawable.a2,R.drawable.a3 ,R.drawable.a4, R.drawable.a5};       //南機場圖片
    private int[] limg=new int[]{ R.drawable.l2,R.drawable.l3 , R.drawable.l4, R.drawable.l6};       //樂華圖片
    private int[] TPIimg;                   //現在夜市圖片
    private ListView listView;
    private ListAdapter ladapter;
    private TextView marketTitle,markTraffic;
    private String marketN;

    private Context context;
    private ArrayList<foodDetail> listItem;
    private foodAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        markTraffic= (TextView) findViewById(R.id.textView3);


        //顯示夜市名稱
        marketTitle= (TextView) findViewById(R.id.marketTitle);
        Intent intent=this.getIntent();
        Bundle extras =intent.getExtras();
        marketN = extras.getString("marketName");
        marketTitle.setText(marketN);
        //判斷是哪個夜市
        switch (marketN) {
            case "SHIHLIN NIGHT MARKET":
            {
                markTraffic.setText("Address: Ln. 101, Wenlin Rd., Shilin Dist., Taipei City 111, Taiwan (R.O.C.)");
                sfood=getResources().getStringArray(R.array.Sfood);
                TPIfood=sfood;
                TPIimg=simg;
                //ladapter=new ArrayAdapter<String>(context,android.R.layout.simple_expandable_list_item_1,sfood);
                break;
            }
            case "RAOHE NIGHT MARKET":
            {
                markTraffic.setText("Address: Raohe St., Songshan Dist., Taipei City 105, Taiwan (R.O.C.)");
                rfood=getResources().getStringArray(R.array.Rfood);
                TPIfood=rfood;
                TPIimg=rimg;
                //ladapter=new ArrayAdapter<String>(context,android.R.layout.simple_expandable_list_item_1,rfood);
                break;
            }
            case "LEHUA NIGHT MARKET":
            {
                markTraffic.setText("Address: Yongping Rd., Yonghe Dist., New Taipei City 234, Taiwan (R.O.C.)");
                lfood=getResources().getStringArray(R.array.Lfood);
                TPIfood=lfood;
                TPIimg=limg;
                //ladapter=new ArrayAdapter<String>(context,android.R.layout.simple_expandable_list_item_1,rfood);
                break;
            }
            case "NAJICHANG NIGHT MARKET":
            {
                markTraffic.setText("Address: Ln. 307, Sec. 2, Zhonghua Rd., Zhongzheng Dist., Taipei City 100, Taiwan (R.O.C.)");
                afood=getResources().getStringArray(R.array.Afood);
                TPIfood=afood;
                TPIimg=aimg;
                //ladapter=new ArrayAdapter<String>(context,android.R.layout.simple_expandable_list_item_1,rfood);
                break;
            }
        }

        //顯示食物清單
        context=this;
        listView= (ListView) findViewById(R.id.listView);
        MyAdapter adapter=new MyAdapter(this);
        listView.setAdapter(adapter);

        //listView.setAdapter(ladapter);
        listView.setOnItemClickListener(new MyOnItemClickListerner());

    }
    //選單點擊事件
    private class MyOnItemClickListerner implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String content = parent.getItemAtPosition(position).toString();
            Toast.makeText(context,content,Toast.LENGTH_SHORT).show();

            Intent intent=new Intent();
            intent.setClass(getApplicationContext(),foodcontent.class);
            intent.putExtra("fMark",marketN);      //哪個夜市
            //intent.putExtra("fId",position);        //美食編號
            intent.putExtra("fName", content);     //美食名稱
            startActivity(intent);
        }
    }

    //自訂ListView
    public class MyAdapter extends BaseAdapter{
        private LayoutInflater myInflater;
        public MyAdapter(Context c){
            myInflater = LayoutInflater.from(c);
        }

        @Override
        public int getCount() {
            return TPIfood.length;
        }

        @Override
        public Object getItem(int position) {
            return TPIfood[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView =myInflater.inflate(R.layout.fooddetail,null);

            ImageView imgfood  = (ImageView) convertView.findViewById(R.id.tvFimage);
            TextView txtfood= (TextView) convertView.findViewById(R.id.tvFname);

            imgfood.setImageResource(TPIimg[position]);
            txtfood.setText(TPIfood[position]);
            return convertView;
        }

    }
}

