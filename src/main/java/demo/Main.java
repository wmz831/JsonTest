package demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import pojo.Face;
import pojo.Result;
import pojo.Vertice;

import java.util.Date;

/**
 * Create by Wang Mingzhen om 2018/7/24
 */
public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Result r = new Result();
        Date d = new Date();
        Vertice v1 = new Vertice(100,200);
        Vertice v2 = new Vertice(150,300);
        Vertice v3 = new Vertice(1000,8000);
        Vertice[] vs= {v1,v2,v3};
        Face f = new Face(1,64L,"test",d.getTime(),d,vs);
        r.set(1,"success",true,f);
        String text = JSON.toJSONString(r);
        System.out.println(text);
        Result<Face> r2 = JSON.parseObject(text,Result.class);
        System.out.println("--------");

        System.out.println(JSON.toJSONString(r2));

    }
}
