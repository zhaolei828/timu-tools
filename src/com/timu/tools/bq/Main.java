package com.timu.tools.bq;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zhaolei
 * Date: 16-8-9
 * Time: 下午11:42
 */
public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 题号、分类、学段、年级、一级知识点、二级知识点、三级知识点、四级知识点
         * 难度、能力结构、题型、题干、解答、解析
         *
         * 题号、分类、学段、年级、知识点、
         * 难度、题型、题干、解答、解析、小题
         *
         * 【答案】、【解析】、【题型】、【一级知识点】、【二级知识点】、【三级知识点】、【四级知识点】、【试题评价】和【能力结构】
         */
        Map<String,String> resultMap = new HashMap<String, String>();
        resultMap.put("答案","");
        resultMap.put("解析","");
        resultMap.put("题型","");
        resultMap.put("一级知识点","");
        resultMap.put("二级知识点","");
        resultMap.put("三级知识点","");
        resultMap.put("四级知识点","");
        resultMap.put("试题评价","");
        resultMap.put("能力结构","");
        InputStream is = new FileInputStream("F:\\words\\bq\\1.docx");
        XWPFDocument doc = new XWPFDocument(is);
        List<XWPFParagraph> paras = doc.getParagraphs();
        for (XWPFParagraph para : paras) {
            //当前段落的属性
            System.out.println(para.getText());
        }
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
