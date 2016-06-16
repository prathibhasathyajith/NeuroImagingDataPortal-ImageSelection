/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject2_imgs;

import java.io.File;
import java.util.Vector;
import java.util.ArrayList;

/**
 *
 * @author prathibha
 */
public class setTable {

    public Vector<Vector> setTableSelect(ArrayList<File> files) {
        //System.out.println("file array" + files);
        Vector<Vector> table = new Vector<Vector>();
        if (files != null) {
            for (int i = 0; i < files.size(); i++) {
                if (!(files.isEmpty())) {
                    Vector<Object> row = new Vector<Object>();
                    //System.out.println("files "+files[i].getName());
                    row.addElement(files.get(i).getName());

                    table.add(row);
                }
            }
            //System.out.println(table);
        }
        return table;
    }
    
    
}
