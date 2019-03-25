package com.geex.base64;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.io.*;

/**
 * Description:
 * Program Name:
 * author :dujianjun
 * Date:2018-01-18  16:58  星期四
 * version 1.0
 */
public class TestBase64 {


    public static byte[] fileToByte(String filePath) throws Exception {
        byte[] data = new byte[0];
        File file = new File(filePath);
        if (file.exists()) {
            FileInputStream in = new FileInputStream(file);
            ByteArrayOutputStream out = new ByteArrayOutputStream(2048);
            byte[] cache = new byte[1024];
            int nRead = 0;
            while ((nRead = in.read(cache)) != -1) {
                out.write(cache, 0, nRead);
                out.flush();
            }
            out.close();
            in.close();
            data = out.toByteArray();
        }
        return data;
    }


    public static void byteArrayToFile(byte[] bytes, String filePath) throws Exception {
        InputStream in = new ByteArrayInputStream(bytes);
        File destFile = new File(filePath);
        if (!destFile.getParentFile().exists()) {
            destFile.getParentFile().mkdirs();
        }
        destFile.createNewFile();
        OutputStream out = new FileOutputStream(destFile);
        byte[] cache = new byte[1024];
        int nRead = 0;
        while ((nRead = in.read(cache)) != -1) {
            out.write(cache, 0, nRead);
            out.flush();
        }
        out.close();
        in.close();
    }


    private  static String path = null;

    static {
      path = TestBase64.class.getResource("/").getPath()+"com/geex/file/aa.jpg";

    }

    public static  void  test1() throws Exception {
       // path = "http://test.geexfinance.com:8885/xblade/photo/2017110/20171109154254_1020_NYB01-171109-786705_20171109153447_161895.jpg";
        String str = Base64Utils.encodeFile(path)/*.replaceAll("\r|\n", "")*/;  //将图片转为base64
        byte[] bytes = fileToByte(path);
        String encode = Base64.encode(bytes);
        System.out.println(str);
       // System.out.println(encode);
        System.out.println("******************************");
        String path = "C:\\Users\\geex\\Desktop\\aa\\2.jpg";
      //  Base64Utils.decodeToFile(path,str);//将base64转为图片
      //  Base64Utils.decodeToFile(path,encode);//将base64转为图片
        byte[] decode = Base64.decode(str);
        byteArrayToFile(decode,path);

    }




    public static void main(String[] args){

        try {
            test1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
