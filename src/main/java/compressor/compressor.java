/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author sanje
 */
public class compressor {
    public static void method(File file) throws IOException{
        String filedirectory=file.getParent();
        
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(filedirectory+"/Compressed1.gz");
        
        GZIPOutputStream gzip=new GZIPOutputStream(fos);
        
        byte[] buffer = new byte[4096];
        int len;
        
        while((len=fis.read(buffer))!=-1){
            gzip.write(buffer, 0,len);
        }
        gzip.close();
        fos.close();
        fis.close();
        
    }
    public static void main(String[] args) throws IOException{
    
        File path=new File("C:\\Users\\sanje\\OneDrive\\Documents\\NetBeansProjects\\CompressorDecompressor\testfile");
        method(path);
    }
    
}
