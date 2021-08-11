package core_java_concepts;

enum Progamming_Lang{
    JAVA, PYTHON, JAVASCRIPT;
}

public class EnumExample {

    public static void main(String[] args){
        Progamming_Lang pl = Progamming_Lang.JAVA;
        System.out.println("Progamming Language is: "+ pl);
    }
}
