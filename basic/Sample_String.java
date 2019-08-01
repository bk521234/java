public class Sample_String{
    public static void main(String[] args){
        //String Concatenation
        String str1 = "Rock";
        String str2 = "Star";
        //Method 1 : Using concat
        String str3 = str1.concat(str2);
        System.out.println(str3);
        //Method 2 : Using "+" operator
        String str4 = str1 + str2;
        System.out.println(str4);

        System.out.println("Length of String: " + str4.length());
        System.out.println("Character at position 5: " + str4.charAt(5));
        //Index of a given character
        System.out.println("Index of character 'S': " + str4.indexOf('S'));

        String str_Sample = "RockStar";
        System.out.println("Compare To 'rockstar': " + str_Sample.compareTo("rockstar"));
        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("ROCKSTAR"));
        //Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));

        System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

        System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));

        //Convert to LowerCase
        System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
        //Convert to UpperCase
        System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());



        String newString = "This is Index of Example";
        //Character at position
        System.out.println("Index of character 'x': " + newString.indexOf('x'));
        //Character at position after given index value
        System.out.println("Index of character 's' after 3 index: " + newString.indexOf('s', 3));
        //Give index position for the given substring
        System.out.println("Index of substring 'is': " + newString.indexOf("is"));
        //Give index position for the given substring and start index
        System.out.println("Index of substring 'is' form index:" + newString.indexOf("is", 5));

        //returns the char value at the 0 index
        System.out.println("Character at 0 position is: " + str1.charAt(0));
        //returns the char value at the 5th index
        //System.out.println("Character at 5th position is: " + str1.charAt(5));

        char result = str1.charAt(-1);
        System.out.println("Character at 23th position is: " + result);

        String str = "Guru99 is a site providing free tutorials";
        //remove white spaces
        String new_str2 = str.replaceAll("\\s", "");
        System.out.println(new_str2);


    }
  }