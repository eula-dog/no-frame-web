package com.frxxz.mytest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Cal {
    public static void main(String[] args) {
        String url = "https://www.xkushu.com/35zwhtml/168/168417/41259564.html"; // 要爬取的网页URL

        ArrayList<String> list = List.geiList();
//        for (int i = 0; i < list.size(); i++) {
//            if(i>224){
//                System.out.println("------------------------------------------------------------");
//                System.out.println(list.get(i));
//                String newUrl = "https://www.xkushu.com/35zwhtml/168/168417/" + list.get(i).split("-")[1];
//                String content = getContent(newUrl);
//                System.out.println(content);
//            }
//        }

                System.out.println("------------------------------------------------------------");
                int i = 249;
                System.out.println(list.get(i));
                String newUrl = "https://www.xkushu.com/35zwhtml/168/168417/" + list.get(i).split("-")[1];
                String content = getContent(newUrl);
                System.out.println(content);
    }

    public static String getContent(String url){
        String result = "";

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

            // 关闭输入流
            in.close();

            Document doc = Jsoup.parse(html);

            Element content = doc.getElementById("content");
            StringBuilder text = new StringBuilder();
            for (TextNode node : content.textNodes()) {
                text.append(node.getWholeText()).append("\n");
            }
            //System.out.println(content.text().replaceAll("<br/>", "\n"));
            //content
            return text.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
