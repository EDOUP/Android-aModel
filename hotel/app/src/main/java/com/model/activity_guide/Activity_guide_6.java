package com.model.activity_guide;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.model.activities.R;
import com.model.adapters.ActivityGuide6_ListViewAdapter;

import java.util.List;
import java.util.Map;

import static com.model.test.ContentConstructor.dataSourceOfGuide6;

/**
 * Created by Administrator on 2017/12/26 0026.
 */

public class Activity_guide_6 extends Activity{

    private ListView listView;
    private List<Map<String,Object>> dataList;
    private ActivityGuide6_ListViewAdapter  guide6_ListViewAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide6);
        listView=(ListView)findViewById(R.id.guide6_list);
        guide6_ListViewAdapter=new ActivityGuide6_ListViewAdapter(this);
        dataList= dataSourceOfGuide6();
        guide6_ListViewAdapter.setData(dataList);
        listView.setAdapter(guide6_ListViewAdapter);
    }

}
