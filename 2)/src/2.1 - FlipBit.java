// 2.1 - 
//Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное. 

/**
 * Flips one bit of the given <code>value</code>.
 *
 * @param value     any number
 * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
 * @return new value with one bit flipped
 */
public static int flipBit(int value, int bitIndex) {
        return (value^((int)Math.pow(2,(bitIndex-1))));
    }    
