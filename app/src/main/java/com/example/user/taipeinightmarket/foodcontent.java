package com.example.user.taipeinightmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class foodcontent extends AppCompatActivity {

    TextView fName,fdescription,fprice;
    ImageButton ibHome,ibFood1,ibFood2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodcontent);

        fName= (TextView) findViewById(R.id.foodName);
        fdescription= (TextView) findViewById(R.id.textView8);
        fprice= (TextView) findViewById(R.id.textView11);
        ibHome= (ImageButton) findViewById(R.id.imageButton);
        ibFood1= (ImageButton) findViewById(R.id.imageButton2);
        ibFood2= (ImageButton) findViewById(R.id.imageButton3);

        Intent intent=getIntent();
        String fstring=intent.getStringExtra("fName"); //美食名稱
        String fMark=intent.getStringExtra("fMark");   //夜市名稱
        //String backid=intent.getStringExtra("backid");   //大圖片回傳
        fName.setText(fMark+" \n"+fstring);

        ibHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                Bundle extras = new Bundle();
                intent.putExtras(extras);
                intent.setClass(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });


        switch(fMark){
            case "SHIHLIN NIGHT MARKET": {
                switch (fstring) {
                    case "Fried and roasted chicken": {
                        fprice.setText("price：NT$70");
                        fdescription.setText("When you go out from the MRT station, you will find out a lot of people are lining up for this the most popular fried and roasted chicken! the chicken breast is fried at first, and then it is roasted with mysterious sauce. It tastes a little sweet, a little salty. It is an incredible, delicious specialty in Shihlin night market.");
                        ibFood1.setImageResource(R.drawable.s11);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s11";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 111);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.s12);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s12";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 112);
                            }
                        });
                        break;
                    }
                    case "Prince cheese potato": {
                        fprice.setText("price：NT$70");
                        fdescription.setText("Prince cheese potato is near fried roasted chicken. You will also find out there are a lot of people are lining up. It contains fried mashed potato with diverse ingredients like ham, corn, bacon, cauliflower, boiled eggs etc. Finally, the fried potato smothered in rich cheese sauce. When you eat it, you can still taste its skin is very crunchy.");
                        ibFood1.setImageResource(R.drawable.s21);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s21";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                // startActivityForResult(intent, 121);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.s22);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s22";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 122);
                            }
                        });
                        break;
                    }
                    case "Xiao roasted meat roll": {
                        fprice.setText("price：NT$12");
                        fdescription.setText("Xiao is a small vendor at the corner. You smell enticing fragrance before You see the stand. The roast meat roll is composed of juicy meat slice plus plenty of green onions. I totally recommend you eat a meat roll by mouthful. It will bring you unprecedented feeling.");
                        ibFood1.setImageResource(R.drawable.s41);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s41";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 141);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.s42);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s42";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 142);
                            }
                        });
                        break;
                    }
                    case "Zhong-Cheng-Hao oyster omelet": {
                        fprice.setText("price：NT$65");
                        fdescription.setText("Oyster omelet is one of the most representative specialties in Taiwan. Especially, Zhong-Cheng-Hao is the most popular in the Shihlin night market. The oyster omelet is mixed with eggs, vegetables, big luscious oysters, and sweet potato starch. In particular, the sweet potato starch give people a gooey chewiness. Finally, after smothered the unique sauce, it is the best combination ever.");
                        ibFood1.setImageResource(R.drawable.s51);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s51";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 151);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.s52);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s52";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 152);
                            }
                        });
                        break;
                    }
                    case "Fried ice cream": {
                        fprice.setText("price：NT$40-50");
                        fdescription.setText("You might not hear that “fried” ice cream. It’s not kidding! The young boss invents the specialty by himself. The fried ice cream is made of toast which included different flavors ice cream and all of them are hand-made by himself. After fried, the toast skin is very crispy, but the ice cream won’t be melted! How incredible it is!");
                        ibFood1.setImageResource(R.drawable.s61);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s61";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 161);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.s62);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="s62";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 162);
                            }
                        });
                        break;
                    }
                }break;
            }
            case "RAOHE NIGHT MARKET":
            {
                switch (fstring) {
                    case "Fu-Dao house circle vegetable pancake":
                    {
                        fprice.setText("price：NT$60");
                        fdescription.setText("This is a very genuine Japanese food. Ma lu in Japanese means circle, so it is a vegetable pancake shaped in circle. The vegetable pancake consists of flour paste mixed with cabbage, bacon, and an egg. It tastes doughy and make you feel comfortable. If you can eat spicy food, maybe you can try to eat malu-malu vegetable pancake with “wasabi” !");
                        ibFood1.setImageResource(R.drawable.r11);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="r11";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 211);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.r12);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="r12";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 212);
                            }
                        });
                        break;
                    }
                    case "Guo-Jiang Japanese dorayaki":
                    {
                        fprice.setText("price：NT$50");
                        fdescription.setText("There are a little bit interesting here, that is, “customerlize”. That’s right. You can choose everything you would like. First, you can choose which size do you want, the big one or the “mini” one. I recommend the mini one because it is so cute! And then, you can choose which flavor do you want. Finally, you will get your own style dorayaki!");
                        ibFood1.setImageResource(R.drawable.r21);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="r21";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 221);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.r22);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="r22";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 222);
                            }
                        });
                        break;
                    }
                    case "Bei-Hai shark fin soup":
                    {
                        fprice.setText("price：NT$60");
                        fdescription.setText("There are varieties of seafood in the seafood soup such as squid, fish ball, shrimp etc. plus pork cakes, carrots, radish included. The soup tastes a little sweat and a little salty. Moreover, there is the best set, that is, one seafood soup plus one fried glass noodles. It will be the most amazing combination.");
                        ibFood1.setImageResource(R.drawable.r31);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="r31";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 231);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.r32);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="r32";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 232);
                            }
                        });
                        break;
                    }
                    case "Fu-Zhou pepper cakes":
                    {
                        fprice.setText("price：NT$40");
                        fdescription.setText("This stand is located on the entrance of RaoHe night market. When you got the entrance, you must see a lot of people are lining up for this amazing food. The skin of the pepper cake is very crispy, and there is juicy meat inside. Be careful!!! That might flow plenty of broth out.");
                        ibFood1.setImageResource(R.drawable.r41);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="r41";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 241);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.r42);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="r42";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 242);
                            }
                        });
                        break;
                    }
                }break;
            }
            case "LEHUA NIGHT MARKET":
            {
                switch (fstring) {
                    case "Noname mackerel soup":
                    {
                        fprice.setText("price：NT$60");
                        fdescription.setText("Fried mackerel fish, crabs, and shrimps are the three kinds of sea food in the soup. This vendor runs over 18 years old. Although this stand is “no name”, it is still popular! After tasting it, people are lip smacking, and want to eat it again and again!");
                        ibFood1.setImageResource(R.drawable.l21);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="l21";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 321);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.l22);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="l22";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 322);
                            }
                        });
                        break;
                    }
                    case "Zhuang sesame oil chicken":
                    {
                        fprice.setText("price：NT$30-NT$200");
                        fdescription.setText("Whatever the weather is hot or cold, the Zhuang sesame oil chicken always has a lot of customers! The ingredients are very fresh and the soup tastes very strong. The most important thing is they put great amount of sesame oil and rice wine in the soup. As a result, it smells very good and intoxicating!");
                        ibFood1.setImageResource(R.drawable.l31);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="l31";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 331);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.l32);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="l32";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 332);
                            }
                        });
                        break;
                    }
                    case "Yang fermented bean sauce fried chicken":
                    {
                        fprice.setText("price：Varied in what you ordered");
                        fdescription.setText("The flavorful fried chicken is different from other fried chicken. it is because of the marinade:” fermented bean sauce”. It tastes scrumptious, a little salty, a little sweet, and along with a little smell of wine. The fermented bean sauce fried chicken will make you addictive.");
                        ibFood1.setImageResource(R.drawable.l41);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="l41";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 341);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.l42);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="l42";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 342);
                            }
                        });
                        break;
                    }
                    case "Fu-Mei oyster fritter":
                    {
                        fprice.setText("price：NT$40");
                        fdescription.setText("If you are the oyster lover, you must try this wonderful specialty! The boss manages this stand over 20 years. The world changes a lot, but the boss doesn’t change the price and the quality of oysters! It’s still very plump! It’s also a lot of Chinese chives included.");
                        ibFood1.setImageResource(R.drawable.l61);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="l61";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 361);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.l62);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="l62";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 362);
                            }
                        });
                        break;
                    }
                }break;
            }
            case "NAJICHANG NIGHT MARKET":
            {
                switch (fstring) {
                    case "Lai-Lai dumplings":
                    {
                        fprice.setText("price：NT$$50/10 dumplings");
                        fdescription.setText("There are a lot of people go to Nanjichang night market just for these wonderful dumplings! The dumpling’s skin tastes very chewy, and the minced pork mixed with minced cabbage or Chinese chives included. It’s worth noting that after you ordered, the staff will ask that would you like some sesame oil. Absolutely, you can’t miss this extraordinary thing! It makes dumplings be amazing!");
                        ibFood1.setImageResource(R.drawable.a21);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="a21";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 421);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.a22);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="a22";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 422);
                            }
                        });
                        break;
                    }
                    case "Hao-Chi fried chicken":
                    {
                        fprice.setText("price：NT$45");
                        fdescription.setText("The chicken cutlet is very enormous, and it tastes very moist with crispy crust. In Taipei, this high price index city, this stand sells everything in adorable price. But the boss doesn’t let the quality of materials down. That’s why there are always many people buy it.");
                        ibFood1.setImageResource(R.drawable.a31);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="a31";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 431);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.a32);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="a32";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 432);
                            }
                        });
                        break;
                    }
                    case "Ba-Dong sweet sticky rice ball":
                    {
                        fprice.setText("price：NT$40-NT$80");
                        fdescription.setText("In Taiwan, sticky rice ball is a traditional food. You will find it at parts of festivals. Specially, Taiwanese people like to eat sticky rice ball with hot sweet soup in winter because you will feel very warm after you eat it. There are varieties of sticky rice balls and soups you can choose. If you come to Nanjichang night market, you must try it!");
                        ibFood1.setImageResource(R.drawable.a41);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="a41";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 441);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.a42);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="a42";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 442);
                            }
                        });
                        break;
                    }
                    case "Wheel pies":
                    {
                        fprice.setText("price：NT$10");
                        fdescription.setText("It is not an obvious stand that people can see it at the first sight, and it is not in the night market. This small vendor is near the night market. Although there are not diversity of flavor you can choose, it is famous on its filling! The boss is a generous person. She puts great amount of filling in a pie. So you can’t miss the incredible thing!");
                        ibFood1.setImageResource(R.drawable.a51);
                        ibFood1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="a51";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 451);
                            }
                        });
                        ibFood2.setImageResource(R.drawable.a52);
                        ibFood2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String fid="a52";
                                Intent intent=new Intent();
                                Bundle extras = new Bundle();
                                extras.putString("fid",fid);
                                intent.putExtras(extras);
                                intent.setClass(getApplicationContext(),bigpic.class);
                                startActivity(intent);
                                //startActivityForResult(intent, 452);
                            }
                        });
                        break;
                    }
                }break;
            }
        }



    }
}
