package com.easygo.utils;

import com.easygo.domain.FileObject;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * 遍历读取文件夹内容,并存入json文件中，同时
 */
public class FileUtils {

    public static void main(String[] args) throws IOException {
        String sourcePath = "/Users/supeng/IdeaProjects/webTest/java-web/target/java-web-1.0-SNAPSHOT/WEB-INF/upload";
        String targetPath = "/Users/supeng/IdeaProjects/webTest/java-web/target/java-web-1.0-SNAPSHOT/data";


        creatJsonFile(sourcePath, targetPath);
    }

    /**
     * 遍历文件：生成字符串
     */
    public static String getFileMessage(String spath) throws IOException {

        File rootFile = new File(spath);
        File[] fs = rootFile.listFiles();
        Arrays.sort(fs);
        // 生成的json字符串
        String fileString = formatString(rootFile);
        return fileString;
    }


    /**
     * 创建json文件
     */

    public static void creatJsonFile(String sourcePath, String targetPath) throws IOException {
        //获取tomcat所在目录
        String fileString = getFileMessage(sourcePath);
        // 将字符串写入到指定文件内
        try {
            // 存放json字符串的文件夹

            File parFile = new File(targetPath);
            // 如果没有文件夹 则创建
            if (!parFile.exists()) {
                parFile.mkdir();
            }
            String dataPath = targetPath + File.separator + "treegrid_data"+".json";
            File file = new File(dataPath);
            // 如果没有该文件 则创建
            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println("file.getAbsoluteFile():---"+file.getAbsoluteFile());
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(fileString);
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }

    /**
     * 转为json
     */
    public static String formatString(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FileObject fo = new FileObject();
        fo.setId("");
        System.out.println("file.getName():--"+file.getName());
        fo = getSubFile(file, fo);
        return objectMapper.writeValueAsString(fo.getChildren());
    }

    //递归查找文件夹
    public static FileObject getSubFile(File file, FileObject fo) {
        String size = "";
        long fileS = file.length();
        // DecimalFormat df = new DecimalFormat("#.00");
        if (fileS < 1024) {
            size = fileS + "BT";
            // size = df.format((double) fileS) + "BT";
        } else if (fileS < 1048576) {
            size = fileS / 1024 + "KB";
            // size = df.format((double) fileS / 1024) + "KB";
        } else if (fileS < 1073741824) {
            size = fileS / 1048576 + "MB";
            // size = df.format((double) fileS / 1048576) + "MB";
        } else {
            size = fileS / 1073741824 + "GB";
            // size = df.format((double) fileS / 1073741824) +"GB";
        }
        fo.setSize(size);
        fo.setName(file.getName());
        Date date = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        fo.setDate(sdf.format(date));
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            Arrays.sort(files, new CompratorByLastModified());
            if (files.length >= 0) {
                for (int i = 0; i < files.length; i++) {
                    FileObject subfo = new FileObject();

                    subfo.setId(fo.getId() + String.valueOf(i + 1));

                    fo.getChildren().add(getSubFile(files[i], subfo));
                }
            }
        }
        return fo;
    }

    //根据最后一次修改时间排序
    static class CompratorByLastModified implements Comparator<File> {
        public int compare(File f1, File f2) {
            long diff = f1.lastModified() - f2.lastModified();
            if (diff > 0)
                return -1;
            else if (diff == 0)
                return 0;
            else
                return 1;
        }

        public boolean equals(Object obj) {
            return true;
        }
    }
}
