package com.model.activity_guide;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.model.activities.R;

/**
 * Created by Administrator on 2017/12/26 0026.
 */

public class Activity_guide_1 extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide1);

        //模拟内容
        String title_0="宾客须知";
        String text_0="尊敬的宾客：您好！ \n" +
                "为了保障您的人身和财产安全，为了我们能更好的为您服务。根据中华人民共和国相关条例，特制定本须知望您能支持并配合我们的工作。 \n" +
                "谢谢！\n" +
                "一、贵重物品请存放在总台寄存处。 \n" +
                "二、房费在总收银处结算，请您注意退房时间中午12：00，超过12：00在18：00之前退房将加收半天房费，超过18：00将收全天房费。 \n" +
                "三、您如需紧急打扫房间卫生，请将“请即时打扫”的指示牌挂于门口，致电房务中心，电话：XXXX。 \n" +
                "四、请勿带宠物进入酒店。 \n" +
                "五、进入酒店后，请勿大声喧哗，保持安静，22：00以后请将电视机音量调小，不得在客房演奏乐器。 \n" +
                "六、请您勿往窗外抛撒任何物品。 \n" +
                "七、严禁携带易燃易爆的化学物品进入酒店。 \n" +
                "八、客房严禁使用燃油或石化、油气炉具和各种家电设备。\n"+
                "九、请勿在楼梯间及床上吸烟，请勿乱扔烟头及火柴棒。\n"+
                "十、严禁在酒店燃放烟花、鞭炮。\n" +
                "十一、未经酒店同意，不得在客房内装复印机、电话传真机等办公设备。\n"+
                "十二、严禁在客房内吸毒、贩毒、斗殴、宿娼卖淫等违法犯罪活动。\n"+
                "十三、请勿在消防安全疏散通道和消防设施上堆放各种物品。 \n" +
                "十四、如发生火警及其它意外事件，请勿惊慌及时向大堂报警按安排的疏散路线迅速撤离。 \n" +
                "十五、尊敬的宾客，请您爱护酒店的财物，如由于您和您的朋友的原因造成酒店财物的损坏，需承担相应赔偿，由于客人原因导致客房设备设施受损，设备设施维修期间客房不能出租，可由司法部门追究相应的责任。 \n" +
                "                  五千年XXX国际大酒店";

        TextView  guide1_title=(TextView)findViewById(R.id.guide1_title);
        guide1_title.setText(title_0);
        TextView  guide1_text=(TextView)findViewById(R.id.guide1_text) ;
        guide1_text.setText(text_0);

        String text_4= " 订餐服务    电话分机：XXXX   Banquet Reservation Ext: XXXX\n" +
                " 承接个人或团队的各类宴会、酒会及住店客人的房内用餐服务。\n" +
                " Various reservations are available for dinner and cocktail party fot company or private gathering .It is 24 hours for room service. 位置：一层 Located :Floor 1 \n"+
                " 订餐时间：8:00-20:00 \n"+
                " Reservation Time : 8:00-20:00 \n"+
                " 大堂酒吧    电话分机：XXXX Lobby Bar   Ext: XXXX \n"+
                " 与浪漫钢琴相约，提供各式西点、饮品，即时调制的鸡尾酒更是令人赏心悦目，是您休憩商谈理想场所。 \n"+
                " Relax and taste a drink form our cocktail list while listening to the wonderful music played by our resident pianist.  位置：一楼大厅 Located :Floor 1. \n"+
                " 营业时间：10:00-22:00 Service Time: 10:00-22:00  \n"+
                " 客房早餐 \n"+
                " Breakfast Room \n"+
                " 阁下入住本酒店一楼全时餐厅为您提供早餐，早餐时间：07： 00-09：00 \n"+
                " You stay in the first floor of the hotel coffee shop to provide you with breakfast, breakfast time :07:00-09: 00  \n"+
                " 中餐厅    电话分机：XXXX \n"+
                "  Garden Chinese Restaurant   Ext: XXXX \n"+
                " 环境舒适雅致，餐厅主要经营徽菜，大厅可供60位宾客同时用餐，并可提供14个风格各异包厢，是您宴请宾朋的首选场所。 \n"+
                "  For exquisite Anhui cuisine dish as well as delicious food .our Chinese restaurant will captivate the most discerning gourmet. Private rooms are also available.\n"+
                "位置：一层 "+ "Located :Floor 1 \n"+
                "营业时间：11:00-14:00 17:00-21:00 Service Time: 11:00-14:00 17:00-21:00   \n"+
                "宴会厅 电话分机：XXXX \n"+
                "Grand Banquetroom   Ext: XXXX \n"+
                "拥有一支旨在提供高标准服务的专业队伍，精心布置宴席、营造欢庆氛围，为您提供完美宴会服务。 \n"+
                "You special event deserves attention,we offers consistently hight leves of service and quality to ensure you get the personal touches you want . 位置：三层 Location:Floor 3\n"+
                "营业时间：11:00-21:00 Sevice Time :11:00-21:00";


    }
}
