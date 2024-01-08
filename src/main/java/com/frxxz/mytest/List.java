package com.frxxz.mytest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        String url = "https://www.xkushu.com/35zwhtml/168/168417/"; // 要爬取的网页URL

        try {
            // 创建URL对象
            URL website = new URL(url);

            // 打开连接并创建输入流
            BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream()));

            String html="";
            // 读取网页内容
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                html += inputLine;
            }

            if("".equals(html)){
                System.out.println("获取失败");
                return;
            }
            // 关闭输入流
            in.close();
            Document doc = Jsoup.parse(html);

            Element content = doc.getElementById("list");
            Elements dlList = content.select("dd");

            System.out.println(dlList.size());
            for (Element dl : dlList) {
                Element dd = dl.selectFirst("dd");
                Element link = dd.selectFirst("a");
                String href = link.attr("href");
                System.out.println(dl.text() + "--" + href);
                //System.out.println(dl.text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static ArrayList<String> geiList(){
        ArrayList<String> resutl = new ArrayList<>();
        String url = "https://www.xkushu.com/35zwhtml/168/168417/"; // 要爬取的网页URL

        try {
            // 创建URL对象
            URL website = new URL(url);

            // 打开连接并创建输入流
            BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream()));

            String html="";
            // 读取网页内容
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                html += inputLine;
            }

            if("".equals(html)){
                System.out.println("获取失败");
                return null;
            }
            // 关闭输入流
            in.close();
            Document doc = Jsoup.parse(html);

            Element content = doc.getElementById("list");
            Elements dlList = content.select("dd");

            System.out.println(dlList.size());
            for (Element dl : dlList) {
                Element dd = dl.selectFirst("dd");
                Element link = dd.selectFirst("a");
                String href = link.attr("href");
                //System.out.println(dl.text() + "-" + href);
                resutl.add(dl.text() + "-" + href);
                //System.out.println(dl.text());
            }
            return resutl;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}

