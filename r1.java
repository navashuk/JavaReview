package review3;

public class r1 {
    public static void main(String[] args) {

    boolean loginButtonDisplayed=true;

    boolean loginButtonClicable=true;

    if(loginButtonDisplayed && loginButtonClicable){
        System.out.println("The case is passed");

    }else{
            System.out.println("Failed");

        }

        System.out.println("****************************");

boolean dashboard=false;// || if one condition is true ecerythung is true
String message ="Welcome Navruz";// string comes with .equals()
if (dashboard || message.equals("Welcome Navruz")){
    System.out.println("It is working perfectly");

}else{
    System.out.println("Its failing");
}

System.out.println("------Logical NOT_-----");// for 2 or more conditions

boolean b =true;

        System.out.println(!true);

        boolean agreeCheckBox=true;
if(!agreeCheckBox){
    System.out.println("click on checkbox");

}
        System.out.println("click on submit button ");



boolean boo =!false;
System.out.println(boo);
    }
}
