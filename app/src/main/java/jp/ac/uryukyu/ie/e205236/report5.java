package jp.ac.uryukyu.ie.e205236;

public class report5 {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("例外発生中");
            System.out.println(e.getMessage());
        }
    }
}
