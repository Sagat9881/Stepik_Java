// 2.3 - Реализуйте метод, проверяющий, является ли заданная строка палиндромом.

public static boolean isPalindrome(String text) {
 String B = "";
String C = text.replaceAll("[^a-zA-Z0-9]","");
char [] mass = C.toCharArray();
char[] mass2 = new char [mass.length];
for(int i =(mass.length-1);i>=0;){
 for(int j=0;j<=(mass2.length-1);j++){
  mass2[j]=mass[i];
  i--;
  B+=mass2[j];
 }
}
return B.equalsIgnoreCase(C);
}
