public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("##teamcity[compilationStarted compiler='compilejava']");
        System.out.println("##teamcity[message text='compiler error' status='ERROR']");
        System.out.println("##teamcity[compilationFinished compiler='compilejava']");

        System.err.println("##teamcity[compilationStarted compiler='compilejava']");
        System.err.println("##teamcity[message text='compiler error' status='ERROR']");
        System.err.println("##teamcity[compilationFinished compiler='compilejava']");


        System.err.print("This is error message print to System.err");
        System.out1.println("this is error");
    }
}
