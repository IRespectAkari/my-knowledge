
public static void main(String[] args)

System.out.println();
BigDecimal bd = new BigDecimalxxxxx;
(int)Math.round(Math.random() * xx)// 1 ~ xx までのint型乱数生成(詳細下記参照)
String a = Arrays.toString(xx);// 配列名 xx を文字列で出力
int a = xx.length// 配列名 xx の配列数

// 型変換
int a = Integer.parseInt(xx);// String -> int
int a = Integer.parseInt(xx, 16);// String -> int (16進数)
String a = String.valueOf(xx);// int -> String
String a = i.toString(xx);// Integer -> String (Integer ≠ int)
Integer a = Integer.valueOf(xx);// int -> Integer
Integer a = xx;// int -> Integer (オートボクシング機能による自動変換)
boolean a = "true".equalsIgnoreCase(xx);// String -> boolean (T/t区別無し)

protected// 継承されたクラスにのみアクセスを許す場合など
abstract// 継承前提のメソッド定義

java.util.Scanner
java.util.Arrays;// 配列の文字列表示を使うとき

java.util.InputMismatchException

Scanner scanner = new Scanner(System.in);
String input = scanner.next();
int input = scanner.nextInt();// 入力はint型以外、エラー(InputMismatchException)


private int rNum(int max){// 1 ~ [max] までのint型乱数生成
  return (int)Math.round(Math.random() * max)
}

private int rNum(int min, int max){// [min] ~ [max] までのint型乱数生成
  return (int)Math.round(Math.random() * (max - min + 1)) + min -1;
}

――――――――――――――――――――――――――――――――――――――――
// 演算子
// 代入演算子
i =  5 -> 5  // "="の右辺を左辺に代入
i += 5 -> 10 // 右辺を左辺に加算( i = i + 5 と同義)
i -= 5 -> 5  // 右辺を左辺から減算( i = i - 5 と同義)
i *= 5 -> 25 // 右辺を左辺に乗算(i = i * 5 と同義)
i /= 5 -> 5  // 右辺で左辺を除算( i = i / 5 と同義)
i %= 5 -> 1  // 右辺を左辺で除算した余り( i = i % 5 と同義)

i &= 5 -> 1  // 右辺で左辺を論理積演算(  と同義)
i |= 5 -> 1  // 右辺で左辺を論理和演算(  と同義)
i ^= 5 -> 1  // 右辺で左辺を排他的論理和演算(  と同義)

byte i = -91// とする
i <<= 2  -> -364        // 右辺の値の回数左辺を"符号を維持して"左シフト
i >>= 2  -> -91         // 右辺の値の回数左辺を"符号を維持して"右シフト
i >>>= 2 -> 1073741801  // 右辺の値の回数左辺を"符号を無視して"右シフト
[シフト演算の仕組み]
（1 byte = 00000000 - 11111111 （-64 ～ 63）とする）
byte b;
b = 23;
b <<= 1 // 46
 23 をビットで表すと 00010111
 ビットを値分左にずらして空欄に 0 を入れる
 つまり 1 だけ左にシフトすると  00101110 = 46
b = -3;
b >>= 1 // -2
 -3 をビットで表すと 11111101
 ビットを値分右にずらす
 符号を保持する為に最上位ビットと同じ値で空欄を埋める
 最上位ビットが 1 なら 1 で、0 なら 0 で埋める
 つまり 1 だけ右にシフトすると  11111110 = -2
b = -3;
b >>>= 1 // 62
 -3 をビットで表すと 11111101
 ビットを値分右にずらす
 最上位ビットにかかわらず 0 で埋める
 つまり 1 だけ右にシフトすると  01111110 = 62



