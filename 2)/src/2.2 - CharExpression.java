//2.1 -
//Реализуйте метод, который возвращает букву,
//стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.

public static char charExpression(int a) {
    int x = '\\';
    int y = x + a;
    char z = (char) y;
    
    return z;
}
