public class Leet {
    public static String toLeet(String normal) {
        String myString = normal;
    myString = myString.replaceAll("elite", "1337");
    myString = myString.replaceAll("cool", "k3wl");
    myString = myString.replaceAll("ers", "0rz");
    myString = myString.replaceAll("er", "0rz");
    myString = myString.replaceAll("en", "n");
    myString = myString.replaceAll("e", "3");
    myString = myString.replaceAll("t", "7");
    myString = myString.replaceAll("o", "0");
    myString = myString.replaceAll("a", "@");
    myString = myString.replaceAll("!", "!!!11");
    myString = myString.replaceAll("ck", "xx");

    return myString;
    }
    public static String[] allToLeet(String[] normals) {
        Leet leet = new Leet();
        String[] myStringArray = new String[normals.length];
        for(int i = 0; i < myStringArray.length; i++) {
            myStringArray[i] = leet.toLeet(normals[i]);
            //System.out.println(myStringArray[i]);
        }
        return myStringArray;
    }

}
