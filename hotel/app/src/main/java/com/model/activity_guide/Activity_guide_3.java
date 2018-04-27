package com.model.activity_guide;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.model.activities.R;
import com.model.adapters.ActivityGuide3_ListViewAdapter;

import java.util.List;
import java.util.Map;

import static com.model.test.ContentConstructor.dataSourceOfGuide3;

/**
 * Created by Administrator on 2017/12/26 0026.
 */

public class Activity_guide_3 extends Activity{
    private ListView listView;
    private List<Map<String,Object>> dataList;
    private ActivityGuide3_ListViewAdapter  guide3_ListViewAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide3);
        listView=(ListView)findViewById(R.id.guide3_listView);
        guide3_ListViewAdapter=new ActivityGuide3_ListViewAdapter(this);
        dataList= dataSourceOfGuide3();
        guide3_ListViewAdapter.setData(dataList);
        listView.setAdapter(guide3_ListViewAdapter);
    }



}
