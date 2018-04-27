package com.model.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContentConstructor {
	
	/*该类中构造本地数据，模拟效果,
	 * 请使用者按此格式整合从网络加载的数据
	 * */
	public static List<Map<String,Object>> dataSourceOfHome(){

			//It's Tea Time!
		String[] titles={"A Hotel",
				"Swimming Pool",
				"Ballroom",
				"Hotel Conference Room",
				"Hotel Room",
				"Indoor Gym"
		};//模拟几组标题


		//It's Tea Time!this is textview ,this is text view ,How about two lines? I think it's OK!
		String[] summary={"This hotel is set catering, tourism, conferences, leisure and entertainment as one of the only foreign-related business hotel",
				"It's Tea Time!this is textview ,this is text view ,How about two lines? I think it's OK!",
				"It's Tea Time!this is textview ,this is text view ,How about two lines? I think it's OK!",
				"It's Tea Time!this is textview ,this is text view ,How about two lines? I think it's OK!",
				"It's Tea Time!this is textview ,this is text view ,How about two lines? I think it's OK!",
				"It's Tea Time!this is textview ,this is text view ,How about two lines? I think it's OK!"
				
		};//模拟几组摘要
		
		
		String[] imgAddress={
				"timg?image&quality=80&size=b9999_10000&sec=1513716826393&di=f993d7934c91f2e477f942c988626d64&imgtype=0&src=http%3A%2F%2Fimg.sc115.com%2Fuploads%2Fsc%2Fjpgs%2F0420apic394_sc115.com.jpg",
				"timg?image&quality=80&size=b9999_10000&sec=1513714746925&di=83bb0c37d525af248e8bdc9bd751bc53&imgtype=0&src=http%3A%2F%2Fstatic.jinjiang.com%2Fopt%2Fstatic%2Fhotel%2Fstarred%2F1218%2Fartwork%2F1350547718128_oldname.jpg",
				"timg?image&quality=80&size=b9999_10000&sec=1513713760887&di=ffdc360f4c2dfae597b952410284ad98&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F5fdf8db1cb1349545c719d5e5d4e9258d1094a98.jpg",
				"timg?image&quality=80&size=b9999_10000&sec=1513716437235&di=0ab3456a8318dc7c2f3bfe43be99560a&imgtype=0&src=http%3A%2F%2Fpic30.photophoto.cn%2F20140116%2F0009021127388679_b.jpg",
				"timg?image&quality=80&size=b9999_10000&sec=1513716961576&di=52a0ed7f15d62125c284bb5831feeb7c&imgtype=0&src=http%3A%2F%2Fstatic-xiaoguotu.17house.com%2Fxgt%2Ft%2F00%2F1462379580186.jpg",
				"timg?image&quality=80&size=b9999_10000&sec=1513713948103&di=3cbfe79ca778154e32b022e842f4201b&imgtype=jpg&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D1689983817%2C3286331759%26fm%3D214%26gp%3D0.jpg"
		};//模拟几组图片地址
		
		String[] releaseTime={"a moment ago ","5 minutes ago","8 minutes ago","23 minutes ago",
				"36 minutes ago","a hour ago"
		};//模拟几组发布时间
		
		boolean[] liked={false,false,false,true,true,false};//模拟几组"是否点赞了"
		
		int[] likeNum={540,540,540,540,540,540};
		
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<titles.length;i++){
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("Title", titles[i]);
			data.put("Summary", summary[i]);
			data.put("ImgAddress", imgAddress[i]);
			data.put("ReleaseTime", releaseTime[i]);
			data.put("Liked", liked[i]);
			data.put("LikeNum", likeNum[i]);
			data.put("Home_item_id", i);
			list.add(data);
		}
		return list;
		
	}
	/*
	public static List<Map<String,Objects>> dataSourseActivity9(){
		String[] activity9_Text={
				"尊敬的宾客：您好！ \n" +
						"为了保障您的人身和财产安全，为了我们能更好的为您服务。根据中华人民共和国相关条例，特制定本须知望您能支持并配合我们的工作。 \n" +
						"谢谢！ \n" +
						"一、贵重物品请存放在总台寄存处。 \n" +
						"二、房费在总收银处结算，请您注意退房时间中午12：00，超过12：00在18：00之前退房将加收半天房费，超过18：00将收全天房费。 \n" +
						"三、您如需紧急打扫房间卫生，请将“请即时打扫”的指示牌挂于门口，致电房务中心，电话：XXXX。 \n" +
						"四、请勿带宠物进入酒店。 \n" +
						"五、进入酒店后，请勿大声喧哗，保持安静，22：00以后请将电视机音量调小，不得在客房演奏乐器。 \n" +
						"六、请您勿往窗外抛撒任何物品。 \n" +
						"七、严禁携带易燃易爆的化学物品进入酒店。 \n" +
						"八、客房严禁使用燃油或石化、油气炉具和各种家电设备。 九、请勿在楼梯间及床上吸烟，请勿乱扔烟头及火柴棒。 十、严禁在酒店燃放烟花、鞭炮。 \n" +
						"十一、未经酒店同意，不得在客房内装复印机、电话传真机等办公设备。 十二、严禁在客房内吸毒、贩毒、斗殴、宿娼卖淫等违法犯罪活动。 十三、请勿在消防安全疏散通道和消防设施上堆放各种物品。 \n" +
						"十四、如发生火警及其它意外事件，请勿惊慌及时向大堂报警按安排的疏散路线迅速撤离。 \n" +
						"十五、尊敬的宾客，请您爱护酒店的财物，如由于您和您的朋友的原因造成酒店财物的损坏，需承担相应赔偿，由于客人原因导致客房设备设施受损，设备设施维修期间客房不能出租，可由司法部门追究相应的责任。 \n" +
						" \n" +
						"五千年文博园皖府国际大酒店"



		}





	}*/

	public static List<Map<String, Object>> dataSourceOfF11() {
		String[] titles={
				"Merry Christmas!",
				"It's Dinner Time!",
				"Happy Birthday To You!",
				"You Have a Message!",
				"Room Reservation Is Successful!",
				"You Need To Relax!"
		};//模拟几组标题
		
		String[] summary={
				"Christmas is coming, A hotel wish you a Merry Christmas in advance!",
				"The dinner you attend will begin in an hour, at 18:00, on the 2nd floor of A Hotel!",
				"Today is a great day, I wish you a happy birthday, We have exclusive benefits waiting for you!",
				"Your friends give you a private letter!",
				"The room you made on the 1st of October, which was booked in September, has been successfully accepted!",
				"Do you need a long trip for a holiday? We offer a caring service!"
				
		};//模拟几组摘要
		
		
		String[] imgAddress={
				"http://mpic.tiankong.com/a33/435/a3343513d489d6236635e937a88a6f1b/640.jpg",
				"http://mpic.tiankong.com/c39/651/c396516fcf95ed096d78275bdc1d0470/640.jpg",
				"http://mpic.tiankong.com/061/c72/061c72b2a866eb350d88c55a43763cd0/640.jpg",
				"http://mpic.tiankong.com/462/480/4624801dc2a144b21f8a393aabea884e/640.jpg",
				"http://mpic.tiankong.com/c29/b41/c29b41680124c51f2bbd10eafde1e11d/640.jpg",
				"http://mpic.tiankong.com/6f1/8e6/6f18e6fddcc967ecaf3fbd904b68e181/412-09161.jpg"
		};//模拟几组图片地址
		
		boolean[] hadRead={false,false,false,true,true,false};//模拟几组"是否点赞了"
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<titles.length;i++){
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("Title", titles[i]);
			data.put("Summary", summary[i]);
			data.put("ImgAddress", imgAddress[i]);
			data.put("HadRead", hadRead[i]);
			data.put("f11_item_id", i);
			list.add(data);
		}
		return list;
	}

	public static List<Map<String, Object>> dataSourceOfF3() {

		String[] number={"14537284938","059538492039","12342934839","17238493064",
				"198273849323","273283912","13344242353","10086","128392834"};

		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<number.length;i++){
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("number",number[i]);
			list.add(data);

		}
		return list;
	}
	public static List<Map<String, Object>> dataSourceOfF04() {
		String[]	image={"http://pic22.photophoto.cn/20120229/0040039378867428_b.jpg",
		"https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2365114759,382141405&fm=27&gp=0.jpg"
		};//模拟几组图片
		String[] titles={"总统套房","AA店铺"
		};//模拟几组标题
		String[] introduce={"限时特惠","国际一线品牌入驻"};//模拟几组简介

		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<titles.length;i++){
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("ImgAddress",image[i]);
			data.put("Title", titles[i]);
			data.put("Introduce",introduce[i]);
			list.add(data);

		}
		return list;
	}
	public static List<Map<String, Object>> dataSourceOfF09() {
		String[] titles={"宾客须知","今日新闻","景点交通","酒店设施","餐饮服务",
				"前台服务","客房服务","失物招领"
		};//模拟几组标题
		
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<titles.length;i++){
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("Title", titles[i]);
			list.add(data);
			data.put("f09_item_id", i);
		}
		return list;
	}

	public static List<Map<String, Object>> dataSourceOfF03() {
		String[] titles={"A酒店","502客房","CMCC","TP_LINK135","TP_LINK4628","HQU"
		};//模拟几组标题

		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<titles.length;i++){
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("Title", titles[i]);
			list.add(data);
		}
		return list;
	}


	public static List<Map<String, Object>> dataSourceOfF05() {
		String[] titles={"15512345678","15512345678","15512345678","15512345678","15512345678","15512345678","12345678765"
		};//模拟几组标题

		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(int i=0;i<titles.length;i++){
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("Title", titles[i]);
			list.add(data);
		}
		return list;
	}
	public static List<Map<String, Object>> dataSourceOfGuide3() {

		String[] text1 = {"崇武古城"};
		String[] text2 = {"4.8分     12条点评"};
		String[] text3 = {"据您17.9km"};
		String[] text4 = {"¥20"};
		String[] text5 = {"惠安县东南海滨，当时为抵御倭寇所筑"};
		String[] image1={"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1515437413&di=282e895394db6b96c0068476b3109455&imgtype=jpg&er=1&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fd6ca7bcb0a46f21f0818e869fd246b600c33aed8.jpg"};
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		for (int i = 0; i < text1.length; i++) {
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("Text1", text1[i]);
			data.put("Text2", text2[i]);
			data.put("Text4", text4[i]);
			data.put("Text5", text5[i]);
			data.put("ImgAddress",image1[i]);
			list.add(data);

		}
		return list;

	}
	public static List<Map<String, Object>> dataSourceOfGuide6() {

		String[] mamnger_name={"大堂经理","客房预订","泊车","贵重物品寄存","大堂吧"

		};
		String[] number={"13843025835","分机:00","0592—12345","分机：01","分机02"};
		String[] introuder={"为您提供24小时的帮助与投诉服务","预订房间保留至18:00","代客停车",
				"贵重物品请存入保险箱,否则丢失概不负责","提供各种酒水服务"};
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();

		for(int i=0;i<mamnger_name.length;i++){
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("Name", mamnger_name[i]);
			data.put("Tele_number",number[i]);
			data.put("Introduce",introuder[i]);
			list.add(data);

		}
		return list;
	}


}
