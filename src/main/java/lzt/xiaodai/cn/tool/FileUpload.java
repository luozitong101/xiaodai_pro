package lzt.xiaodai.cn.tool;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.regex.Matcher;

/**
 * @author luoyong
 * @Date: 2019/3/24 23:20
 * @Description:
 */
public class FileUpload {


    public static String writeFileUpload(MultipartFile file,String path){
        String filename = file.getOriginalFilename();
        String extname = filename.substring(filename.lastIndexOf(".")+1);
        File dir = new File(path);
        if (!dir.exists()){
            dir.mkdirs();
        }

        filename = Math.abs(Long.parseLong(filename.hashCode()+""))+System.currentTimeMillis()+"."+extname;
        InputStream input = null;
        FileOutputStream fos = null;
        try {
            input = file.getInputStream();
            fos = new FileOutputStream(path + filename);
            IOUtils.copy(input, fos);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            IOUtils.closeQuietly(input);
            IOUtils.closeQuietly(fos);
        }
        return "http://localhost/"+filename;
    }


}
