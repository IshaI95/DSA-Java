package JavaNewFeatures;

public class SwitchUseCase {

//    public static void display(var d) {
//        System.out.println("display");
//    }

    public static void main(String[] args) {

        var a = 10;
        var b = "hello";

//        var c; //(cannot use 'var' on variable without initializer)


        String day = "thurs";

        String time = "";

//        time = switch (day) {
//            case "Sat", "Sun" -> "7am";
//            case "Wed" -> "8am";
//            default -> "6am";
//        };

        time = switch (day) {
            case "Sat", "Sun": yield "7am";
            case "Wed": yield "8am";
            default: yield "6am";
        };

        System.out.println(time);

    }
}
