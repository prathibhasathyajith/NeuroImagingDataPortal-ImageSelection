/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject2_imgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JFileChooser;

/**
 *
 * @author prathibha
 */
public class CreateZip {

    public void ZipCreateExample(ArrayList<File> files, String path,String Zipname) throws Exception {
        String savepath = path+"/"+Zipname+".zip";
        FileOutputStream fos = new FileOutputStream(savepath);
        ZipOutputStream zos = new ZipOutputStream(fos);
        int byteread = 0;
        byte[] b = new byte[2048];

        for (File names : files) {
            FileInputStream in = new FileInputStream(names);

            ZipEntry zi = new ZipEntry(names.getName());
            zos.putNextEntry(zi);

            while ((byteread = in.read(b)) > 0) {
                System.out.println(names);
                zos.write(b, 0, byteread);
            }
            zos.closeEntry();
            in.close();

        }


    }
}

