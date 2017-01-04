package ideaStreet.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ideaStreet.util.WebUtils;


@Controller 
public class NewsImgController {
    @RequestMapping(path="/smallImg/{fileType}/{fileName}.{suffix}.html")  
    public void smallImgIntercept(HttpServletRequest request, HttpServletResponse response,   
            @PathVariable String fileType,   
            @PathVariable String suffix,  
            @PathVariable String fileName) {  
          
        InputStream is = null;  
        OutputStream os = null;  
        try {  
            File file = new File("/opt/media/patent/newsImg/smallImg/" + fileType  + "/" + fileName + "." + suffix);  
            
            WebUtils.writeStreamToResponse(response, new FileInputStream(file));
        } catch (Exception e) {  
            
        } finally {  
            if (is != null) {  
                try {  
                    is.close();  
                } catch (IOException e) {  
                	e.printStackTrace();
                }  
                  
                if (os != null) {  
                    try {  
                        os.close();  
                    } catch (IOException e) { 
                    	e.printStackTrace();
                    }  
                }  
            }  
        }  
          
    } 
    
    
    @RequestMapping(path="/contentImg/{fileType}/{fileName}.{suffix}.html")  
    public void contentImgIntercept(HttpServletRequest request, HttpServletResponse response,   
            @PathVariable String fileType,   
            @PathVariable String suffix,  
            @PathVariable String fileName) {  
          
        InputStream is = null;  
        OutputStream os = null;  
        try {  
            File file = new File("/opt/media/patent/newsImg/contentImg/" + fileType  + "/" + fileName + "." + suffix);  
            
            WebUtils.writeStreamToResponse(response, new FileInputStream(file));
        } catch (Exception e) {  
            //判断suffix  
            //图片请求可以在此显示�?个默认图�?  
            //file显示文件已损坏等错误提示...  
        } finally {  
            if (is != null) {  
                try {  
                    is.close();  
                } catch (IOException e) {  
                    e.printStackTrace();
                }  
                  
                if (os != null) {  
                    try {  
                        os.close();  
                    } catch (IOException e) {  
                    	e.printStackTrace();
                    }  
                }  
            }  
        }  
          
    } 
}
