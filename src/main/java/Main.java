public class Main {
    public static void main(String[] args) {

        Integer inBase=0;
        Integer outBase=0;
        String value="";
        for (String arg:args) {
            if ("H".equalsIgnoreCase(arg.substring(0,1))){
                System.out.println("Конвертер чисел.");
                System.out.println("iNUM - исходная система счисление");
                System.out.println("oNUM - целевая система счисление");
                System.out.println("NUM - число для конвертации в исходной система счисление ");
                return;
            }
            if("I".equalsIgnoreCase(arg.substring(0,1)))
                inBase=Integer.parseInt(arg.substring(1));
            else
            if("O".equalsIgnoreCase(arg.substring(0,1)))
                outBase=Integer.parseInt(arg.substring(1));
            else
                value=arg;
        }
        if(inBase==0||outBase==0 ||value.isEmpty()){
            System.out.println("Неверные входные параметры.");
        }

        try {
            Integer integerValue = Converter.parseNumber(value, inBase);
            if (integerValue>10000)
                throw new RuntimeException("Входное число >10000");
            System.out.println("Входное число: "+ value);
            System.out.println("Система счисления: "+ inBase);
            System.out.println("Представление в  "+ outBase +"-й системе счисления:"+Integer.toString(integerValue, outBase));

        }catch(RuntimeException ex){
            System.out.println("Ошибка при конвертации числа."+ex.getMessage());
        }

    }
}
