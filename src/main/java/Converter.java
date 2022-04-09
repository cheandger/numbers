public class Converter {

    private static final String digits = "0123456789ABCDEF";

    public static Integer parseNumber(String num, Integer base){
        if (base>16)
            throw new RuntimeException("Incorrect base");
        num = num.toUpperCase();
        Integer val = 0;
        Integer i = 0;
        while(i < num.length()) // пока не кончилась строка
        {
            Character c = num.charAt(i);
            Integer d = digits.indexOf(c);
            if(d == -1 || d >= base)
               throw new RuntimeException("Incorrect number");
            val = base * val + d;
            i++;
        }
        return val;
    }

}
