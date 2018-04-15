package com.example.administrator.test4_1;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends Activity {
    // 定义一个数组，用来保存图片的名称
    private String[] names = { "Lion", "Tiger", "Monkey", "Dog","Cat","Elephant" };
    // 定义一个数组，用来保存图片的编号
    private int[] imageId = { R.drawable.lion, R.drawable.tiger,
            R.drawable.monkey, R.drawable.dog ,R.drawable.cat ,R.drawable.elephant};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置该Activity的显示界面为R.layout.activity_main
        setContentView(R.layout.activity_main);
        //创建一个集合，用来保存列表项，如兔爷的图片，和兔爷名字
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            //创建map集合，用来保存具体的列表
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("img", imageId[i ]);
            listItem.put("Name", names[i]);
            //将列表添加到列表项中
            listItems.add(listItem);
        }
        final SimpleAdapter adapter = new SimpleAdapter(this, listItems,
                R.layout.activity_main,
                new String[] { "Name", "img" }, new int[] {
                R.id.names, R.id.imgs });
        ListView list = (ListView) findViewById(R.id.list5);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast=Toast.makeText(MainActivity.this,names[position],Toast.LENGTH_LONG);
                toast.show();
            }
        } );
    }








}
