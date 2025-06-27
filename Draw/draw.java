package Draw.zgx;

import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import static org.opencv.core.CvType.CV_8UC3;

public class draw {

public void drawg(){
    int m=3;//扩大倍数
    Draw.zgx.variable v = new variable();
   double load1= v.getLoad1()*m;
   double unload1= v.getUnload1()*m;
   double load2= v.getLoad2()*m;
   double unload2= v.getUnload2()*m;

   double  move1=v.getMove1()*m;
   double move2=v.getMove2()*m;
   double rotate1=v.getRotate1()*m;
    double rotate2=v.getRotate2()*m;
   double process11=v.getProcess1()[0]*m;
   double process12=v.getProcess1()[1]*m;
   double process13=v.getProcess1()[2]*m;
   double process14=v.getProcess1()[3]*m;
   double process21=v.getProcess2()[0]*m;
   double process22=v.getProcess2()[1]*m;
   double process23=v.getProcess2()[2]*m;
   double process24=v.getProcess2()[3]*m;

double wait21s=2*m;
double wait20=6*m;
double wait22s=7*m;
double wait209=4*m;



    Scalar blue=new Scalar(205, 0 ,0);
    Scalar yellow=new Scalar(143,246,255);
    Scalar pink=new Scalar(200, 210 ,250);
    Scalar red=new Scalar(50,60 ,250);
    Scalar orange=new Scalar(10, 118 ,250);
    Scalar green=new Scalar(50,230 ,60);
    Scalar purple=new Scalar( 204,50,153);


    Mat sourceImage = new Mat(1000,1600, CV_8UC3, new Scalar(255,255,255));
    // 划线，设置2个点，分别为开始点，结束点，设置线条颜色
    //左边缘线
    Imgproc.line(sourceImage,new Point(210,162),new Point(210,760),new Scalar(130,130,130));

    //写字
    //   Imgproc.putText(sourceImage,"PS12",new Point(180,262), Imgproc.FONT_HERSHEY_SIMPLEX, 0.6, new Scalar(0, 0, 0), 1, Imgproc.LINE_AA, false);
   /* Imgproc.putText(sourceImage,"LLS",new Point(170,190),Imgproc.FLOODFILL_FIXED_RANGE,1,new Scalar(0,0,0),1,8);
    Imgproc.putText(sourceImage,"PS11",new Point(165,250),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),1,4);
    Imgproc.putText(sourceImage,"PS12",new Point(165,310),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
    Imgproc.putText(sourceImage,"PS13",new Point(165,370),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
    Imgproc.putText(sourceImage,"PS14",new Point(165,430),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);

    Imgproc.putText(sourceImage,"PS20",new Point(165,500),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
    Imgproc.putText(sourceImage,"PS21",new Point(165,560),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
    Imgproc.putText(sourceImage,"PS22",new Point(165,620),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
    Imgproc.putText(sourceImage,"PS23",new Point(165,680),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
    Imgproc.putText(sourceImage,"PS24",new Point(165,740),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
*/
    double initWidth=211;
    double initHigh=172;
    double initWidth1=initWidth;
    double initWidth2=initWidth+5*m;

    int height=25;
//    //LL
//    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh), new Point(600, initHigh+height), new Scalar(0, 50, 250),-1,8);
//    //11
// Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+80), new Point(600, initHigh+80+height), new Scalar(0, 50, 250),-1,8);
//    //12
//    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+160), new Point(600, initHigh+160+height), new Scalar(0, 50, 250),-1,8);
//    //13
//   Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+320), new Point(600, initHigh+320+height), new Scalar(0, 50, 250),-1,8);
//
//    //14
// Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+320), new Point(600, initHigh+320+height), new Scalar(0, 50, 250),-1,8);
//
//
//    ///20
//    Imgproc.rectangle(sourceImage,new Point(initWidth,height+480), new Point(600, height+480+height), new Scalar(0, 50, 250),-1,8);
//    //21
//    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+400), new Point(600, initHigh+400+height), new Scalar(0, 50, 250),-1,8);
//    //22
//    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+480), new Point(600, initHigh+480+height), new Scalar(0, 50, 250),-1,8);
//    //23
//     Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+560), new Point(600, initHigh+560+height), new Scalar(0, 50, 250),-1,8);
//    //24
//     Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+640), new Point(600, initHigh+640+height), new Scalar(0, 50, 250),-1,8);




    //C1
//14
    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+320), new Point(initWidth2, initHigh+height+320), yellow,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+move1, initHigh+height+320), blue,-1,8);
  //  System.out.println(initWidth2-initWidth);

    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+unload1, initHigh+height+320), green,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+rotate1, initHigh+height+320), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+load1, initHigh+height+320), orange,-1,8);
    System.out.println(initWidth2-initWidth+"ii");

  Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2+process14-m, initHigh+height+320), yellow,-1,8);
double p14=initWidth2+process14-m;
    System.out.println(p14-initWidth);
//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);


//11
    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+80), new Point(initWidth2, initHigh+80+height), yellow,-1,8);

    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+80), new Point(initWidth2=initWidth2+move1, initHigh+80+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+80), new Point(initWidth2=initWidth2+unload1, initHigh+80+height), green,-1,8);




//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);




//12

    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+160), new Point(initWidth2=initWidth2+move1, initHigh+160+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+160), new Point(initWidth2=initWidth2+unload1, initHigh+160+height), green,-1,8);




//13
    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+240), new Point(initWidth2, initHigh+240+height), yellow,-1,8);

    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+move1, initHigh+240+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+unload1, initHigh+240+height), green,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+rotate1, initHigh+240+height), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+load1, initHigh+240+height), orange,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2+process13, initHigh+240+height), yellow,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2+process13,initHigh+240), new Point(initWidth2+process13+5*m, initHigh+240+height), red,-1,8);




//12
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+160), new Point(initWidth2=initWidth2+move1, initHigh+160+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+4*m,initHigh+160), new Point(initWidth2=initWidth2+unload1, initHigh+160+height), green,-1,8);
   // System.out.println(initWidth2-initWidth);


//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);



//14

    //Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+320), new Point(initWidth2, initHigh+height+320), yellow,-1,8);
   Imgproc.rectangle(sourceImage,new Point(initWidth2=p14,initHigh+320), new Point(initWidth2=initWidth2+move1, initHigh+height+320), blue,-1,8);
   Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+unload1, initHigh+height+320), green,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+rotate1, initHigh+height+320), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+load1, initHigh+height+320), orange,-1,8);
    System.out.println(initWidth2-initWidth+"ii");
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2+process14, initHigh+height+320), yellow,-1,8);




//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);


//12
    Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2,initHigh+160), new Point(initWidth2=initWidth2+move1, initHigh+160+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+160), new Point(initWidth2=initWidth2+unload1, initHigh+160+height), green,-1,8);
    // System.out.println(initWidth2-initWidth);



//13
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+move1, initHigh+240+height), blue,-1,8);
    System.out.println(initWidth2-initWidth);

    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+unload1, initHigh+240+height), green,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+rotate1, initHigh+240+height), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+load1, initHigh+240+height), orange,-1,8);
    //System.out.println(initWidth2-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2+process13, initHigh+height+240), yellow,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2+process13,initHigh+240), new Point(initWidth2+process13+6*m, initHigh+height+240), red,-1,8);
  //  Imgproc.rectangle(sourceImage,new Point(initWidth2+process13,initHigh+240), new Point(initWidth2+process13+6*m, initHigh+height+240), red,-1,8);


//12
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+160), new Point(initWidth2=initWidth2+move1, initHigh+160+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+2*m,initHigh+160), new Point(initWidth2=initWidth2+unload1, initHigh+160+height), green,-1,8);
    // System.out.println(initWidth2-initWidth);

//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);



//12//
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+160), new Point(initWidth2=initWidth2+move1, initHigh+160+height), blue,-1,8);

    Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+76*m,initHigh+160), new Point(initWidth2=initWidth2+unload1, initHigh+160+height), green,-1,8);
  // System.out.println(initWidth2-initWidth-unload1+"p");
//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);
    System.out.println(initWidth2-initWidth-unload1);

//12
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+160), new Point(initWidth2=initWidth2+move1, initHigh+160+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2,initHigh+160), new Point(initWidth2=initWidth2+unload1, initHigh+160+height), green,-1,8);
     System.out.println(initWidth2-initWidth-unload1);
//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);
    System.out.println(initWidth2-initWidth-unload1);


    //14

   // System.out.println(initWidth2-initWidth);
   Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+move1, initHigh+height+320), blue,-1,8);
   // System.out.println(initWidth2-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+unload1, initHigh+height+320), green,-1,8);
 //   System.out.println(initWidth2-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+rotate1, initHigh+height+320), pink,-1,8);
   Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+load1, initHigh+height+320), orange,-1,8);
   //System.out.println(initWidth2-initWidth+"ii");
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2+process14, initHigh+height+320), yellow,-1,8);
p14=initWidth2+process14;
//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);




//13
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+move1, initHigh+240+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+unload1, initHigh+240+height), green,-1,8);



    //14

    // System.out.println(initWidth2-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth2=p14,initHigh+320), new Point(initWidth2=initWidth2+move1, initHigh+height+320), blue,-1,8);
    // System.out.println(initWidth2-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+unload1, initHigh+height+320), green,-1,8);
    //   System.out.println(initWidth2-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+rotate1, initHigh+height+320), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+load1, initHigh+height+320), orange,-1,8);
  //  System.out.println(initWidth2-initWidth+"ii");
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2+process14, initHigh+height+320), yellow,-1,8);
    p14=initWidth2+process14;

//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);


    //14

    // System.out.println(initWidth2-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth2=p14,initHigh+320), new Point(initWidth2=initWidth2+move1, initHigh+height+320), blue,-1,8);
    // System.out.println(initWidth2-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+unload1, initHigh+height+320), green,-1,8);
    //   System.out.println(initWidth2-initWidth);
//    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+rotate1, initHigh+height+320), pink,-1,8);
//    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+320), new Point(initWidth2=initWidth2+load1, initHigh+height+320), orange,-1,8);
    System.out.println(initWidth2-initWidth+"ii");

//10
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);







    System.out.println("********************************************");









//C2
//PS24
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+640), new Point(initWidth1=initWidth1+unload2, initHigh+640+height), green,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+640), new Point(initWidth1=initWidth1+rotate2, initHigh+640+height), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+640), new Point(initWidth1=initWidth1+load2, initHigh+640+height), orange,-1,8);
  //  System.out.println(initWidth1-initWidth);
double p24=initWidth1+process24;
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+640), new Point(p24, initHigh+640+height), yellow,-1,8);

//PS20
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+move2, height+480+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+unload2, height+480+height), green,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+rotate2, height+480+height), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+load2, height+480+height), orange,-1,8);
   // System.out.println(initWidth1-initWidth);

//21
    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+400), new Point(initWidth1, initHigh+400+height), yellow,-1,8);

    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+400), new Point(initWidth1=initWidth1+move2, initHigh+400+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+400), new Point(initWidth1=initWidth1+unload2, initHigh+400+height), green,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+400), new Point(initWidth1=initWidth1+rotate2, initHigh+400+height), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait21s,initHigh+400), new Point(initWidth1=initWidth1+load2, initHigh+400+height), orange,-1,8);
  //  System.out.println(initWidth1-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+400), new Point(initWidth1+process21, initHigh+400+height), yellow,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1+process21,initHigh+400), new Point(initWidth1+process21+4*m, initHigh+400+height), red,-1,8);

//22
    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+480), new Point(initWidth1, initHigh+480+height), yellow,-1,8);


    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+480), new Point(initWidth1=initWidth1+move2, initHigh+480+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+480), new Point(initWidth1=initWidth1+unload2, initHigh+480+height), green,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+480), new Point(initWidth1=initWidth1+rotate2, initHigh+480+height), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+480), new Point(initWidth1=initWidth1+load2, initHigh+480+height), orange,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+480), new Point(initWidth1+process22, initHigh+480+height), yellow,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1+process22,initHigh+480), new Point(initWidth1+process22+4*m, initHigh+480+height), red,-1,8);

//PS20
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+move2, height+480+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+load2, height+480+height), orange,-1,8);


//ps24

    Imgproc.rectangle(sourceImage,new Point(initWidth1=p24,initHigh+640), new Point(initWidth1=initWidth1+move2, initHigh+640+height), blue,-1,8);
    System.out.println(initWidth1-initWidth-load2);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+640), new Point(initWidth1=initWidth1+unload2, initHigh+640+height), green,-1,8);



//PS20
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+move2, height+480+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait20,height+480), new Point(initWidth1=initWidth1+load2, height+480+height), orange,-1,8);





//21
    System.out.println(initWidth1-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+400), new Point(initWidth1=initWidth1+move2, initHigh+400+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+400), new Point(initWidth1=initWidth1+unload2, initHigh+400+height), green,-1,8);



//22
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+480), new Point(initWidth1=initWidth1+move2, initHigh+480+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait22s,initHigh+480), new Point(initWidth1=initWidth1+unload2, initHigh+480+height), green,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+480), new Point(initWidth1=initWidth1+rotate2, initHigh+480+height), pink,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+480), new Point(initWidth1=initWidth1+load2, initHigh+480+height), orange,-1,8);
    System.out.println(initWidth1-initWidth);
    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+480), new Point(initWidth1+process22-1*m, initHigh+480+height), yellow,-1,8);
double p229=initWidth1+process22-1*m;



//PS20
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+move2, height+480+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait209,height+480), new Point(initWidth1=initWidth1+load2, height+480+height), orange,-1,8);



//22
    Imgproc.rectangle(sourceImage,new Point(initWidth1=p229,initHigh+480), new Point(initWidth1=initWidth1+move2, initHigh+480+height), blue,-1,8);
    System.out.println(initWidth1-initWidth+"==");
    Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,initHigh+480), new Point(initWidth1=initWidth1+unload2, initHigh+480+height), green,-1,8);



//PS20
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+move2, height+480+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,height+480), new Point(initWidth1=initWidth1+load2, height+480+height), orange,-1,8);
    System.out.println(initWidth1-initWidth-load2);



//PS23

    Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+560), new Point(initWidth1=initWidth1+move2, initHigh+560+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,initHigh+560), new Point(initWidth1=initWidth1+unload2, initHigh+560+height), green,-1,8);


//PS20
    Imgproc.rectangle(sourceImage,new Point(initWidth1,height+480), new Point(initWidth1=initWidth1+move2, height+480+height), blue,-1,8);
    Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,height+480), new Point(initWidth1=initWidth1+load2, height+480+height), orange,-1,8);





    Imgproc.rectangle(sourceImage, new Point(initWidth+25, initHigh +615), new Point(initWidth+33, initHigh+12+615), yellow, -1, 8);
    //Imgproc.putText(sourceImage,"processing",new Point(initWidth+40,initHigh +615+12),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
  //  Imgproc.rectangle(sourceImage, new Point(initWidth+175, initHigh +615), new Point(initWidth+175+12, initHigh+12+615), pink, -1, 8);
    Imgproc.rectangle(sourceImage, new Point(initWidth+210, initHigh +615), new Point(initWidth+210+12, initHigh+12+615), red, -1, 8);
   // Imgproc.putText(sourceImage,"post-processing residency",new Point(initWidth+210+20,initHigh +615+12),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
    Imgproc.rectangle(sourceImage, new Point(initWidth+550, initHigh +615), new Point(initWidth+550+12, initHigh+12+615),orange, -1, 8);
  //  Imgproc.putText(sourceImage,"loading",new Point(initWidth+570,initHigh +615+12),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
    Imgproc.rectangle(sourceImage, new Point(initWidth+710, initHigh +615), new Point(initWidth+710+12, initHigh+12+615),green, -1, 8);
   // Imgproc.putText(sourceImage,"unloading",new Point(initWidth+730,initHigh +615+12),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
     Imgproc.rectangle(sourceImage, new Point(initWidth+870, initHigh +615), new Point(initWidth+870+12, initHigh+12+615), pink, -1, 8);
   // Imgproc.putText(sourceImage,"rotating",new Point(initWidth+890,initHigh +615+12),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);

    Imgproc.rectangle(sourceImage, new Point(initWidth+1030, initHigh +615), new Point(initWidth+1030+12, initHigh+12+615),blue, -1, 8);
  ///**/  Imgproc.putText(sourceImage,"moving",new Point(initWidth+1050,initHigh +615+12),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);



/*
    Imgproc.putText(sourceImage,"0.00",new Point(initWidth-4*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.7,new Scalar(139,139,139),1,8);
    Imgproc.putText(sourceImage,"100.00",new Point(initWidth+96*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.3,new Scalar(139,139,139),1,8);
    Imgproc.putText(sourceImage,"200.00",new Point(initWidth+196*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.3,new Scalar(139,139,139),1,8);
    Imgproc.putText(sourceImage,"300.00",new Point(initWidth+296*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.3,new Scalar(139,139,139),1,8);
    Imgproc.putText(sourceImage,"400.00",new Point(initWidth+396*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.3,new Scalar(139,139,139),1,8);
    Imgproc.line(sourceImage,new Point(initWidth+100*m,162),new Point(initWidth+100*m,760),new Scalar(181, 181, 181));
    Imgproc.line(sourceImage,new Point(initWidth+200*m,162),new Point(initWidth+200*m,760),new Scalar(181, 181, 181));
    Imgproc.line(sourceImage,new Point(initWidth+300*m,162),new Point(initWidth+300*m,760),new Scalar(181, 181, 181));
    Imgproc.line(sourceImage,new Point(initWidth+400*m,162),new Point(initWidth+400*m,760),new Scalar(181, 181, 181));*/

    Imgproc.line(sourceImage,new Point(initWidth+100*m,162),new Point(initWidth+100*m,760),new Scalar(181, 181, 181));
    Imgproc.line(sourceImage,new Point(initWidth+200*m,162),new Point(initWidth+200*m,760),new Scalar(181, 181, 181));
    Imgproc.line(sourceImage,new Point(initWidth+300*m,162),new Point(initWidth+300*m,760),new Scalar(181, 181, 181));
    Imgproc.line(sourceImage,new Point(initWidth+400*m,162),new Point(initWidth+400*m,760),new Scalar(181, 181, 181));
    Imgproc.line(sourceImage,new Point(initWidth+500*m,162),new Point(initWidth+500*m,760),new Scalar(181, 181, 181));
    Imgproc.line(sourceImage,new Point(initWidth+600*m,162),new Point(initWidth+600*m,760),new Scalar(181, 181, 181));

    HighGui.imshow("Ganttzgx",sourceImage);
    HighGui.waitKey(0);
    Imgcodecs.imwrite("PM23.jpg", sourceImage);
}



}
