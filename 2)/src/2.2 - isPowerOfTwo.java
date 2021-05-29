//2.2 - Реализуйте метод, проверяющий, является ли заданное число
//по абсолютной величине степенью двойки.

/**
 * Checks if given <code>value</code> is a power of two.
 *
 * @param value any number
 * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
 */
public static boolean isPowerOfTwo(int value) {
 Integer x = value; if(Integer.bitCount(Math.abs(x)) == 1){
    return true;}
  else {
    return false;}
}
