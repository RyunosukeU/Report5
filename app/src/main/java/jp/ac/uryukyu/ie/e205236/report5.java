package jp.ac.uryukyu.ie.e205236;

public class report5 {
    public static void main(String[] args){
        String str = "百二十三";
        try {
            int value = Integer.parseInt(str);  
        }catch(NumberFormatException e){
            System.out.println("例外発生中");
        }finally{
            System.out.println("処理終了");
        }
    }
}
