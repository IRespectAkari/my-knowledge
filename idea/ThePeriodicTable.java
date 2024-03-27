class atom {
  int atomNum;
  atom(){
    System.out.println("元素です");
  }
}
interface no1zoku {
  String NO1ZOKUNOTOKUSEI;// 第１属の特性
  void 結合(){}
}
class Li extends atom impliments no1zoku {
  String tokusei;// 特性
  Li(){
    System.out.println("Liの特性は" + tokusei);
  }
  void 結合(){
    System.out.println("電子１つと結合します");
  }
}
