

class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    String str = "Hi My Name is Rishav! Yo i made it";
    //String str = "Y";
    //output: "vahsiR si emaN yM iH"
    reverseString revstring = new reverseString();
    System.out.println(revstring.reverse(str));
  }
}

class reverseString{

  String reverse(String str){
    if (str==null || str.length()<1 || str.getClass()!=String.class){
      return "input not good";
    }
    //Missed to check input, breaking code.
    //Convert string to char array
    char[] arrStr = str.toCharArray();
    char[] rev = new char[str.length()];
    //iterate through string backwards and one by one store in new array
    for (int i=str.length()-1; i>=0; i--){
      rev[(str.length()-1 -i)]=arrStr[i];
    }
    //convert array to string
    String revStr = new String(rev);
    //String revStr = newString.copyValueOf(rev);
    return revStr;
  }
}
