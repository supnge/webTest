package com.easygo.XML;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.util.List;

public class XMLTest {
    //遍历节点
    @Test
    public void xmltest() throws Exception{
        // 创建SAX解析器
        SAXReader saxReader = new SAXReader();

        String path = this.getClass().getResource("/test.xml").getPath();

        // 获取xml文档
        Document document = saxReader.read(path);

        // 获取根元素
        Element root = document.getRootElement();

        // 获取所有节点
        List list = root.elements();

        List list2 = document.selectNodes("//account/@id");

        for(Object object:list2){
            if(object instanceof Attribute){
                System.out.println(((Attribute) object).getValue());
                ((Attribute) object).setValue(((Attribute) object).getValue()+"hello");

            }
        }

        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(this.getClass().getResource("/test.xml").getPath()));
        xmlWriter.write(document);
        xmlWriter.close();



        for(Object object: list){
            Element product = (Element)object;

            System.out.println(product.attribute("name"));

            List list1 = product.elements();
            for(Object account: list1){
                Element acc = (Element)account;
                System.out.println(acc.element("password").getText());
            }


        }

    }
}
