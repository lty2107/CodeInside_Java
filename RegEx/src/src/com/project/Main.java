package src.com.project;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[]){
        checkRegExFloatingPointNumber();
        System.out.println("");
        checkRegExPrefix();
        System.out.println("");
        checkRegExIP();
        System.out.println("");
        checkMathematicalParentheses();
    }

    private static void checkMathematicalParentheses(){
        String math_reg_ex = "^\\(([^()]*|\\([^()]*\\))*\\)";
        List <String> math_list = List.of("(3+2*(10+3))", "(3+7*(10+14)))", "(3+5)");
        Pattern pattern = Pattern.compile(math_reg_ex);
        Matcher matcher = pattern.matcher("");
        for (String math : math_list){
            matcher.reset(math);
            if (matcher.matches()){
                System.out.println(math);
            }
        }
    }

    private static void checkRegExIP(){
        String ip_reg_ex = "^(((\\d|\\d[1-9]|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|\\d[1-9]|1\\d\\d|2[0-4]\\d|25[0-5]))";
        List <String> ip_list = List.of("0.0.0.0", "127.0.0.1", "256.0.0.1", "255.0.0.1", "127.0.0.256");
        Pattern pattern = Pattern.compile(ip_reg_ex);
        Matcher matcher = pattern.matcher("");
        for (String ip : ip_list){
            matcher.reset(ip);
            if (matcher.matches()){
                System.out.println(ip);
            }
        }
    }

    private static void checkRegExPrefix(){
        String prefix_reg_ex = "^[Пп][Рр]([Ии]|[Ее]).*";
        List <String> prefix_list = List.of("Привет", "Преступление", "пРишёл", "прогулка", "ПРИЗРАК");
        Pattern pattern = Pattern.compile(prefix_reg_ex);
        Matcher matcher = pattern.matcher("");
        for (String prefix_word : prefix_list){
            matcher.reset(prefix_word);
            if (matcher.matches()){
                System.out.println(prefix_word);
            }
        }
    }

    private static void checkRegExFloatingPointNumber(){
        String float_reg_ex = "^[-+]?\\d*[.,]?\\d+([Ee][-+]?\\d+)?$";
        List <String> float_list = List.of("10e2", "11,35", "11.42e10", "11,e2e4", "10.0f");
        Pattern pattern = Pattern.compile(float_reg_ex);
        Matcher matcher = pattern.matcher("");
        for (String float_number : float_list){
            matcher.reset(float_number);
            if (matcher.matches()){
                System.out.println(float_number);
            }
        }
    }


}
