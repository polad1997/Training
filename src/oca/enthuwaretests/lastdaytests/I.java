package oca.enthuwaretests.lastdaytests;

interface I {

  int getI(int a, int b);

}

interface J {

  int getJ(int a, int b, int c);
}

class MyIJ implements K, J, I {


  @Override
  public int getI(int a, int b) {
    return 0;
  }

  @Override
  public int getJ(int a, int b, int c) {
    return 0;
  }


}

class MyI {

  int getI(int x, int y) {
    return x + y;
  }
}

interface K extends J {

  int getJ(int a, int b, int c);
}