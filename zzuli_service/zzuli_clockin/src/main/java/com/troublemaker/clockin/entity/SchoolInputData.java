package com.troublemaker.clockin.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Troublemaker
 * @date 2022- 04 28 21:11
 */
@Data
public class SchoolInputData {
    public SchoolInputData() {
        Date day = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.date = simpleDateFormat.format(day);
        this.jzSfyz = "是";
        this.temp = "正常";
        this.jrzz = "无";
        this.stzk = "健康";
        this.yqgl = "否";
        this.qzYqbl = "否";
        this.jjymqk = "已完成接种";
        this.lastResult = "阴性";
        this.jkmzt = "绿色";
        this.other = "无";
        this.yjs = 0;
        this.wjType = 1;
    }

    // 填写日期
    @JSONField(ordinal = 1)
    private String date;
    // 1、学号
    @JSONField(ordinal = 2, name = "user_code")
    private String userCode;
    // 2、姓名
    @JSONField(ordinal = 3, name = "user_name")
    private String userName;
    // 3、身份证号
    @JSONField(ordinal = 4, name = "id_card")
    private String idCard;
    // 4、性别
    @JSONField(ordinal = 5)
    private String sex;
    // 5、所属学院
    @JSONField(ordinal = 6)
    private String org;
    // 6、年级
    @JSONField(ordinal = 7)
    private Integer year;
    // 7、专业
    @JSONField(ordinal = 8)
    private String spec;
    // 8、班级
    @JSONField(ordinal = 9, name = "class")
    private String classX;
    // 9、在校居住宿舍楼是
    // 校区
    @JSONField(ordinal = 10)
    private String region;
    // 园区
    @JSONField(ordinal = 11)
    private String area;
    // 楼宇
    @JSONField(ordinal = 12)
    private String build;
    // 9-1、在校居住宿舍号
    @JSONField(ordinal = 13)
    private String dorm;
    // 10、联系电话（11位手机号
    @JSONField(ordinal = 14)
    private String mobile;
    // 11、家庭（家长）联系电话
    @JSONField(ordinal = 15, name = "jt_mobile")
    private String jtMobile;
    // 12、你目前居住的详细位置
    // 请选择省市区
    @JSONField(ordinal = 16)
    private String province;
    @JSONField(ordinal = 17)
    private String city;
    @JSONField(ordinal = 18)
    private String district;
    // 请输入目前居住的详细地址
    @JSONField(ordinal = 19)
    private String address;
    // 13、目前您的位置和居住地点
    // 定位的经度纬度
    @JSONField(ordinal = 20)
    private String lat;
    @JSONField(ordinal = 21)
    private String lon;
    @JSONField(ordinal = 22, name = "gcj_lat")
    private String gcjLat;
    @JSONField(ordinal = 23, name = "gcj_lon")
    private String gcjLon;
    // 定位的地址
    @JSONField(ordinal = 24, name = "jz_address")
    private String jzAddress;
    @JSONField(ordinal = 25, name = "jz_province")
    private String jzProvince;
    @JSONField(ordinal = 26, name = "jz_city")
    private String jzCity;
    @JSONField(ordinal = 27, name = "jz_district")
    private String jzDistrict;
    // 14、你获取的位置与本人目前所在地是否相符合
    @JSONField(ordinal = 28, name = "jz_sfyz")
    private String jzSfyz;
    // 15、您今日的体温
    @JSONField(ordinal = 29)
    private String temp;
    // 16、您今日有无以下症状
    @JSONField(ordinal = 30)
    private String jrzz;
    // 17、今日同住人员身体状况
    @JSONField(ordinal = 31)
    private String stzk;
    // 18、是否被当地要求到指定地点隔离
    @JSONField(ordinal = 32)
    private String yqgl;
    // 19、您是否曾经被诊断为确诊病例
    @JSONField(ordinal = 33, name = "qz_yqbl")
    private String qzYqbl;
    // 20、完成疫苗接种情况
    @JSONField(ordinal = 34)
    private String jjymqk;
    // 21、最近一次核酸检测日期
    @JSONField(ordinal = 35, name = "last_time")
    private String lastTime;
    // 22  最后一次核酸检测结果
    @JSONField(ordinal = 36, name = "last_result")
    private  String lastResult;
    // 23、您的防疫健康信息码状态（国家政务服务平台健康码状态）
    @JSONField(ordinal = 37)
    private String jkmzt;
    // 24、其他需要说明的情况
    @JSONField(ordinal = 38)
    private String other;
    // 晨检登记
    @JSONField(ordinal = 39, name = "wj_type")
    private Integer wjType;
    @JSONField(ordinal = 40)
    private final Integer yjs;
}
