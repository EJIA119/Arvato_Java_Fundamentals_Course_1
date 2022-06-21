import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.naming.ldap.BasicControl;
import java.lang.reflect.*;
import java.util.SortedMap;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        StringJoiner sj = new StringJoiner(" ) , ( ","( "," )");
//        sj.add("1").add("2").add("3");
//        System.out.println(sj);




//        Regular Expression
//        String s = "apple, apple and orange please";
//        Pattern pattern = Pattern.compile("\\w+");
//        Matcher matcher = pattern.matcher(s);
//
//        while(matcher.find()){
//            System.out.println(matcher.group());
//        }

//        Sorted Map
//        SortedMap<String,String> map = new TreeMap<>();
//        map.put("444","JGII");
//        map.put("222","ASDF");
//        map.put("333","TGR");
//        map.put("555","QWE");
//
//        map.forEach((k,v) -> System.out.println(k + " | " + v));

//        System.out.println(System.getProperty("user.name"));

//        System.out.println(String.format("%5s","Hello Word"));

//        Object obj = new BankAccount("1234",0);
//
//        Field[] arr = obj.getClass().getDeclaredFields();
//
//        System.out.println(obj.getClass().getDeclaredMethods());
//
//
//
//        for (Field fields: arr)
//            System.out.println(fields);
//
//        System.out.println(obj.getClass());


//        BankAccount acct1 = new BankAccount();
//        startWork("AccountWorker",acct1);

//        Object obj = new BankAccount();
//
//        int modifiers = obj.getClass().getModifiers();
//        boolean test1 = (modifiers& Modifier.PUBLIC) > 0;
//        boolean test2 = Modifier.isPublic(modifiers);
//
//        if(test1 == test2)
//            System.out.println("SAME");

//        System.out.println(String.format("%f",25.75));



    }

    static void startWork(String workerTypeName, Object workerTarget){

        try{
            Class<?> workerType = Class.forName(workerTypeName);
            System.out.println(workerType);
            Class<?> targetType = workerTarget.getClass();
            System.out.println(targetType);

            Constructor c = workerType.getConstructor(targetType);
            Object worker = c.newInstance(workerTarget);
            Method doWork = workerType.getMethod("doWork");
            System.out.println(doWork);

        }catch(Exception e){

        }

    }
}