/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject2_imgs;

/**
 *
 * @author prathibha
 */
public class GetDetails {

    public String[] getDtalisFromZipName(String s) {
        String[] deatilsList = s.split("#");

        //RG00001#2016-05-21@17|48|25#4#3#M#4#546
        //0-userID
        //1-date&time
        //2-age
        //3-area
        //4-sex
        //5-weight
        //6-noofimages
        return deatilsList;
    }
    
   

    public String getZipnameH(String s1,String s2) {
        String FullZipName = null;
        String[] deatilsList = s1.split("#");
        String halfName = deatilsList[2] + "#" + deatilsList[3] + "#" + deatilsList[4] + "#" + deatilsList[5]+"#";
        FullZipName = halfName+s2;
        return FullZipName;
        //return halfName;

    }

    public String ageC(String s) {

        String agenumber;
        switch (s) {

            case "1":
                agenumber = "18-20";
                break;
            case "2":
                agenumber = "20-30";
                break;
            case "3":
                agenumber = "30-40";
                break;
            case "4":
                agenumber = "40-50";
                break;
            case "5":
                agenumber = "50-60";
                break;
            case "6":
                agenumber = "60-70";
                break;
            case "7":
                agenumber = "70-80";
                break;
            default:
                agenumber = "";
                break;
        }
        return agenumber;
    }

    public String area(String s) {

        String area;
        switch (s) {
            case "1":
                area = "Ampara";
                break;
            case "2":
                area = "Anuradhapura";
                break;
            case "3":
                area = "Badulla";
                break;
            case "4":
                area = "Batticaloa";
                break;
            case "5":
                area = "Colombo";
                break;
            case "6":
                area = "Galle";
                break;
            case "7":
                area = "Gampaha";
                break;
            case "8":
                area = "Hambantota";
                break;
            case "9":
                area = "Jaffna";
                break;
            case "10":
                area = "Kalutara";
                break;
            case "11":
                area = "Kandy";
                break;
            case "12":
                area = "Kegalle";
                break;
            case "13":
                area = "Kilinochchi";
                break;
            case "14":
                area = "Kurunegala";
                break;
            case "15":
                area = "Mannar";
                break;
            case "16":
                area = "Matale";
                break;
            case "17":
                area = "Matara";
                break;
            case "18":
                area = "Monaragala";
                break;
            case "19":
                area = "Mullaitivu";
                break;
            case "20":
                area = "Nuwara Eliya";
                break;
            case "21":
                area = "Polonnaruwa";
                break;
            case "22":
                area = "Puttalam";
                break;
            case "23":
                area = "Ratnapura";
                break;
            case "24":
                area = "Trincomalee";
                break;
            case "25":
                area = "Vavuniya";
                break;
            default:
                area = "";
                break;
        }
        return area;
    }

    public String sex(String s) {
        String sex;
        if (s == "F") {
            sex = "Female";
        } else {
            sex = "Male";
        }
        return sex;
    }

    public String weightC(String s) {

        String weightnumber;
        switch (s) {

            case "1":
                weightnumber = "30-40";
                break;
            case "2":
                weightnumber = "40-50";
                break;
            case "3":
                weightnumber = "50-60";
                break;
            case "4":
                weightnumber = "60-70";
                break;
            case "5":
                weightnumber = "70-80";
                break;
            case "6":
                weightnumber = "80-90";
                break;
            case "7":
                weightnumber = "90-100";
                break;
            case "8":
                weightnumber = "100-110";
                break;
            case "9":
                weightnumber = "110-120";
                break;
            default:
                weightnumber = "";
                break;
        }
        return weightnumber;

    }

    public String[] AllDeatis(String s) {
        String[] details = getDtalisFromZipName(s);
        String[] Fdetails = new String[10];

        Fdetails[0] = details[0];
        Fdetails[1] = details[1];
        Fdetails[2] = ageC(details[2]);
        Fdetails[3] = area(details[3]);
        Fdetails[4] = sex(details[4]);
        Fdetails[5] = weightC(details[5]);
        Fdetails[6] = details[6];

        return Fdetails;
    }

    public static void main(String args[]) {
       

    }

}
