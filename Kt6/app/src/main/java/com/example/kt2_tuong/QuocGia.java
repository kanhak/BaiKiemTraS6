package com.example.kt2_tuong;

import java.util.ArrayList;

public class QuocGia {
    int hinh;
    String ten,so;

    public QuocGia(int hinh, String ten, String so) {
        this.hinh = hinh;
        this.ten = ten;
        this.so = so;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    ArrayList<QuocGia> quocGias = new ArrayList<>();
    public  static  ArrayList<QuocGia> dulieu(){


        int co[]={R.drawable.vn,R.drawable.usa,R.drawable.rus,R.drawable.jap,R.drawable.tbn,R.drawable.bdn,R.drawable.fra,R.drawable.gre,R.drawable.anh,R.drawable.hl};
        String tenco[]={"Việt Nam","Mỹ","Nga","Nhật Bản","Tây Ban Nha","Bồ Đào Nha","Pháp","Đức","Anh","Hà Lan"};
        String danso[]={"Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000"};
        ArrayList<QuocGia> x = new ArrayList<>();
        for(int i=0; i< tenco.length;i++){
            x.add(new QuocGia(co[i], tenco[i],danso[i] ));
        }
        return  x;

    }
}
