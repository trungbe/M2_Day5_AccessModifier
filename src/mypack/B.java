package mypack;

import pack.*;
//class B{
//
//    public static void main(String args[]){
//
//        A obj = new A();//Compile Time Error
//
//       //obj.msg();//Compile Time Error
//
//    }
//
//}


class B extends A1 {

    public static void main(String args[]) {

        B obj = new B();

        obj.msg();

    }

}
