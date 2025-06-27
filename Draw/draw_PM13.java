package Draw.zgx;



import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import static org.opencv.core.CvType.CV_8UC3;

public class draw_PM13 {

    public void drawg(){
        int m=2;//扩大倍数
        variable_PM13 v = new variable_PM13();
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

        double wait24q=2*m;
        double wait20=2*m;
        double wait20_1=3*m;

        double wait22u=1*m;
        double wait14=3*m;
        double wait21u=4*m;



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
/*
    Imgproc.putText(sourceImage,"LLS",new Point(170,190),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
    Imgproc.putText(sourceImage,"PS11",new Point(165,250),Imgproc.FLOODFILL_FIXED_RANGE,0.5,new Scalar(0,0,0),2,8);
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
        double initWidth2=initWidth+6*m;

        int height=25;
//    //LL
//    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh), new Point(600, initHigh+height), new Scalar(0, 50, 250),-1,8);
//    //11
// Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+60), new Point(600, initHigh+60+height), new Scalar(0, 50, 250),-1,8);
//    //12
//    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+120), new Point(600, initHigh+120+height), new Scalar(0, 50, 250),-1,8);
//    //13
//   Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+180), new Point(600, initHigh+180+height), new Scalar(0, 50, 250),-1,8);
//
//    //14
// Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+240), new Point(600, initHigh+240+height), new Scalar(0, 50, 250),-1,8);
//
//
//    ///20
//    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+310), new Point(600, initHigh+310+height), new Scalar(0, 50, 250),-1,8);
//    //21
//    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+370), new Point(600, initHigh+370+height), new Scalar(0, 50, 250),-1,8);
//    //22
//    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+430), new Point(600, initHigh+430+height), new Scalar(0, 50, 250),-1,8);
//    //23
//     Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+490), new Point(600, initHigh+490+height), new Scalar(0, 50, 250),-1,8);
//    //24
//     Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+550), new Point(600, initHigh+550+height), new Scalar(0, 50, 250),-1,8);




        //C1

//14
        Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+240), new Point(initWidth2, initHigh+height+240), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+move1, initHigh+height+240), blue,-1,8);
        //  System.out.println(initWidth2-initWidth);

        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+unload1, initHigh+height+240), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+rotate1, initHigh+height+240), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+wait14,initHigh+240), new Point(initWidth2=initWidth2+load1, initHigh+height+240), orange,-1,8);
       //System.out.println(initWidth2-initWidth+"ii");

        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2+process14-m, initHigh+height+240), yellow,-1,8);
        double p14=initWidth2+process14-m;
      //  System.out.println(p14-initWidth);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);


//11
        Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+60), new Point(initWidth2, initHigh+60+height), yellow,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+60), new Point(initWidth2=initWidth2+move1, initHigh+60+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+60), new Point(initWidth2=initWidth2+unload1, initHigh+60+height), green,-1,8);

//12
      //  Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+120), new Point(initWidth2, initHigh+120+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+move1, initHigh+120+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+unload1, initHigh+120+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+rotate1, initHigh+120+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+load1, initHigh+120+height), orange,-1,8);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);


//13
//        Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+180), new Point(initWidth2+4*m, initHigh+180+height), yellow,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+180), new Point(initWidth2=initWidth2+move1, initHigh+180+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+3*m,initHigh+180), new Point(initWidth2=initWidth2+unload1, initHigh+180+height), green,-1,8);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);


//14
        Imgproc.rectangle(sourceImage,new Point(initWidth2=p14,initHigh+240), new Point(initWidth2=initWidth2+move1, initHigh+height+240), blue,-1,8);
        //  System.out.println(initWidth2-initWidth);

        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+240), new Point(initWidth2=initWidth2+unload1, initHigh+height+240), green,-1,8);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+20*m,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);

///////////////
//12
    //    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+120), new Point(initWidth2, initHigh+120+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+move1, initHigh+120+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+unload1, initHigh+120+height), green,-1,8);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);



//12
        //    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+120), new Point(initWidth2, initHigh+120+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+89*m,initHigh+120), new Point(initWidth2=initWidth2+move1, initHigh+120+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+unload1, initHigh+120+height), green,-1,8);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);



//12
        //    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+120), new Point(initWidth2, initHigh+120+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+57*m,initHigh+120), new Point(initWidth2=initWidth2+move1, initHigh+120+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+unload1, initHigh+120+height), green,-1,8);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);


//12
        //    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+120), new Point(initWidth2, initHigh+120+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+90*m,initHigh+120), new Point(initWidth2=initWidth2+move1, initHigh+120+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+unload1, initHigh+120+height), green,-1,8);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+45*m,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);



//12
        //    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+120), new Point(initWidth2, initHigh+120+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth2+44*m,initHigh+120), new Point(initWidth2=initWidth2+move1, initHigh+120+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+unload1, initHigh+120+height), green,-1,8);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);






//12
        //    Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+120), new Point(initWidth2, initHigh+120+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2=initWidth+567*m,initHigh+120), new Point(initWidth2=initWidth2+move1, initHigh+120+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh+120), new Point(initWidth2=initWidth2+unload1, initHigh+120+height), green,-1,8);

//10
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+move1, initHigh+height),blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth2,initHigh), new Point(initWidth2=initWidth2+load1, initHigh+height),orange,-1,8);







        //System.out.println("********************************************");

        //C2

//PS24
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+unload2, initHigh+550+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+rotate2, initHigh+550+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+load2, initHigh+550+height), orange,-1,8);
        //  System.out.println(initWidth1-initWidth);
        double p24=initWidth1+process24;
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(p24, initHigh+550+height), yellow,-1,8);

//PS20
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+move2, initHigh+310+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+unload2, initHigh+310+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+rotate2, initHigh+310+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+load2, initHigh+310+height), orange,-1,8);
        // System.out.println(initWidth1-initWidth);
//21
        Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+370), new Point(initWidth1, initHigh+370+height), yellow,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+370), new Point(initWidth1=initWidth1+move2, initHigh+370+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+370), new Point(initWidth1=initWidth1+unload2, initHigh+370+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+370), new Point(initWidth1=initWidth1+rotate2, initHigh+370+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,initHigh+370), new Point(initWidth1=initWidth1+load2, initHigh+370+height), orange,-1,8);
        //  System.out.println(initWidth1-initWidth);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+370), new Point(initWidth1+process21, initHigh+370+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1+process21,initHigh+370), new Point(initWidth1+process21+10*m, initHigh+370+height), red,-1,8);
   //22
        Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+430), new Point(initWidth1, initHigh+430+height), yellow,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+move2, initHigh+430+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+unload2, initHigh+430+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+rotate2, initHigh+430+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+load2, initHigh+430+height), orange,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1+process22, initHigh+430+height), yellow,-1,8);
       Imgproc.rectangle(sourceImage,new Point(initWidth1+process22,initHigh+430), new Point(initWidth1+process22+5*m, initHigh+430+height), red,-1,8);



//PS23
        Imgproc.rectangle(sourceImage,new Point(initWidth,initHigh+490), new Point(initWidth1, initHigh+490+height), yellow,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+move2, initHigh+490+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,initHigh+490), new Point(initWidth1=initWidth1+unload2, initHigh+490+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+rotate2, initHigh+490+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+load2, initHigh+490+height), orange,-1,8);
        //  System.out.println(initWidth1-initWidth);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1+process23, initHigh+490+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1+process23,initHigh+490), new Point(initWidth1+process23+5*m, initHigh+490+height), red,-1,8);


//PS24
        Imgproc.rectangle(sourceImage,new Point(initWidth1=p24,initHigh+550), new Point(initWidth1=initWidth1+move2, initHigh+550+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+unload2, initHigh+550+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+rotate2, initHigh+550+height), pink,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait24q,initHigh+550), new Point(initWidth1=initWidth1+load2, initHigh+550+height), orange,-1,8);
        p24=initWidth1+process24;
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(p24, initHigh+550+height), yellow,-1,8);

        //  System.out.println(initWidth1-initWidth);


//PS20
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+move2, initHigh+310+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+unload2, initHigh+310+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+rotate2, initHigh+310+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait20,initHigh+310), new Point(initWidth1=initWidth1+load2, initHigh+310+height), orange,-1,8);
        // System.out.println(initWidth1-initWidth);
//PS21
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+370), new Point(initWidth1=initWidth1+move2, initHigh+370+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,initHigh+370), new Point(initWidth1=initWidth1+unload2, initHigh+370+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+370), new Point(initWidth1=initWidth1+rotate2, initHigh+370+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,initHigh+370), new Point(initWidth1=initWidth1+load2, initHigh+370+height), orange,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+370), new Point(initWidth1+process21, initHigh+370+height), yellow,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1+process21,initHigh+370), new Point(initWidth1+process21+6*m, initHigh+370+height), red,-1,8);

        //  System.out.println(initWidth1-initWidth);


     //22
     Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+move2, initHigh+430+height), blue,-1,8);
     Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+unload2, initHigh+430+height), green,-1,8);
     Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+rotate2, initHigh+430+height), pink,-1,8);
     Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+load2, initHigh+430+height), orange,-1,8);
   //  System.out.println(initWidth1-initWidth);
     Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1+process22+m, initHigh+430+height), yellow,-1,8);


//PS23
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+move2, initHigh+490+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,initHigh+490), new Point(initWidth1=initWidth1+unload2, initHigh+490+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+rotate2, initHigh+490+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+load2, initHigh+490+height), orange,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1+process23, initHigh+490+height), yellow,-1,8);
   //     Imgproc.rectangle(sourceImage,new Point(initWidth1+process23,initHigh+490), new Point(initWidth1+process23+5*m, initHigh+490+height), red,-1,8);

//24
        Imgproc.rectangle(sourceImage,new Point(initWidth1=p24,initHigh+550), new Point(initWidth1=initWidth1+move2, initHigh+550+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+unload2, initHigh+550+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+rotate2, initHigh+550+height), pink,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait24q,initHigh+550), new Point(initWidth1=initWidth1+load2, initHigh+550+height), orange,-1,8);
        p24=initWidth1+process24;
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(p24, initHigh+550+height), yellow,-1,8);




//PS20
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+move2, initHigh+310+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait20_1,initHigh+310), new Point(initWidth1=initWidth1+load2, initHigh+310+height), orange,-1,8);
        //System.out.println(initWidth1-initWidth-load2);



//PS21
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+370), new Point(initWidth1=initWidth1+move2, initHigh+370+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,initHigh+370), new Point(initWidth1=initWidth1+unload2, initHigh+370+height), green,-1,8);

     //22
     Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+move2, initHigh+430+height), blue,-1,8);
     Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+2*m,initHigh+430), new Point(initWidth1=initWidth1+unload2, initHigh+430+height), green,-1,8);
     Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+rotate2, initHigh+430+height), pink,-1,8);
     Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+load2, initHigh+430+height), orange,-1,8);
     //  System.out.println(initWidth1-initWidth);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1+process22+m, initHigh+430+height), yellow,-1,8);




//PS23
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+move2, initHigh+490+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1,initHigh+490), new Point(initWidth1=initWidth1+unload2, initHigh+490+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+rotate2, initHigh+490+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+load2, initHigh+490+height), orange,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1+process23+m, initHigh+490+height), yellow,-1,8);



//24
        Imgproc.rectangle(sourceImage,new Point(initWidth1=p24,initHigh+550), new Point(initWidth1=initWidth1+move2, initHigh+550+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+unload2, initHigh+550+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+rotate2, initHigh+550+height), pink,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait24q,initHigh+550), new Point(initWidth1=initWidth1+load2, initHigh+550+height), orange,-1,8);
        p24=initWidth1+process24;
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(p24, initHigh+550+height), yellow,-1,8);

//PS20
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+move2, initHigh+310+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait20_1,initHigh+310), new Point(initWidth1=initWidth1+load2, initHigh+310+height), orange,-1,8);
        //System.out.println(initWidth1-initWidth-load2);

        //22
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+430), new Point(initWidth1=initWidth1+move2, initHigh+430+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait22u,initHigh+430), new Point(initWidth1=initWidth1+unload2, initHigh+430+height), green,-1,8);

        System.out.println(initWidth1-initWidth);

//PS23
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+move2, initHigh+490+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+3*m,initHigh+490), new Point(initWidth1=initWidth1+unload2, initHigh+490+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+rotate2, initHigh+490+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+load2, initHigh+490+height), orange,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1+process23, initHigh+490+height), yellow,-1,8);


//24
        Imgproc.rectangle(sourceImage,new Point(initWidth1=p24,initHigh+550), new Point(initWidth1=initWidth1+move2, initHigh+550+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+unload2, initHigh+550+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+rotate2, initHigh+550+height), pink,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait24q,initHigh+550), new Point(initWidth1=initWidth1+load2, initHigh+550+height), orange,-1,8);
        p24=initWidth1+process24;
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(p24, initHigh+550+height), yellow,-1,8);


//PS20
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+move2, initHigh+310+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait20_1,initHigh+310), new Point(initWidth1=initWidth1+load2, initHigh+310+height), orange,-1,8);
        //System.out.println(initWidth1-initWidth-load2);





//PS23
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+move2, initHigh+490+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+3*m,initHigh+490), new Point(initWidth1=initWidth1+unload2, initHigh+490+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+rotate2, initHigh+490+height), pink,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1=initWidth1+load2, initHigh+490+height), orange,-1,8);
     //   Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+490), new Point(initWidth1+process23, initHigh+490+height), yellow,-1,8);




//24
        Imgproc.rectangle(sourceImage,new Point(initWidth1=p24,initHigh+550), new Point(initWidth1=initWidth1+move2, initHigh+550+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+unload2, initHigh+550+height), green,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+rotate2, initHigh+550+height), pink,-1,8);

        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait24q,initHigh+550), new Point(initWidth1=initWidth1+load2, initHigh+550+height), orange,-1,8);
        p24=initWidth1+process24;
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(p24, initHigh+550+height), yellow,-1,8);





//PS20
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+move2, initHigh+310+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait20_1,initHigh+310), new Point(initWidth1=initWidth1+load2, initHigh+310+height), orange,-1,8);





//24
        Imgproc.rectangle(sourceImage,new Point(initWidth1=p24,initHigh+550), new Point(initWidth1=initWidth1+move2, initHigh+550+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+550), new Point(initWidth1=initWidth1+unload2, initHigh+550+height), green,-1,8);

        System.out.println(initWidth1-initWidth);


//PS20
        Imgproc.rectangle(sourceImage,new Point(initWidth1,initHigh+310), new Point(initWidth1=initWidth1+move2, initHigh+310+height), blue,-1,8);
        Imgproc.rectangle(sourceImage,new Point(initWidth1=initWidth1+wait20_1,initHigh+310), new Point(initWidth1=initWidth1+load2, initHigh+310+height), orange,-1,8);


//        System.out.println(initWidth1-initWidth);



















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





      /*  Imgproc.putText(sourceImage,"0.00",new Point(initWidth-4*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.3,new Scalar(139,139,139),1,8);
        Imgproc.putText(sourceImage,"100.00",new Point(initWidth+96*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.3,new Scalar(139,139,139),1,8);
        Imgproc.putText(sourceImage,"200.00",new Point(initWidth+196*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.3,new Scalar(139,139,139),1,8);
        Imgproc.putText(sourceImage,"300.00",new Point(initWidth+296*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.3,new Scalar(139,139,139),1,8);
        Imgproc.putText(sourceImage,"400.00",new Point(initWidth+396*m,154),Imgproc.FLOODFILL_FIXED_RANGE,0.3,new Scalar(139,139,139),1,8);
       */
        Imgproc.line(sourceImage,new Point(initWidth+100*m,162),new Point(initWidth+100*m,760),new Scalar(181, 181, 181));
        Imgproc.line(sourceImage,new Point(initWidth+200*m,162),new Point(initWidth+200*m,760),new Scalar(181, 181, 181));
        Imgproc.line(sourceImage,new Point(initWidth+300*m,162),new Point(initWidth+300*m,760),new Scalar(181, 181, 181));
        Imgproc.line(sourceImage,new Point(initWidth+400*m,162),new Point(initWidth+400*m,760),new Scalar(181, 181, 181));
        Imgproc.line(sourceImage,new Point(initWidth+500*m,162),new Point(initWidth+500*m,760),new Scalar(181, 181, 181));
        Imgproc.line(sourceImage,new Point(initWidth+600*m,162),new Point(initWidth+600*m,760),new Scalar(181, 181, 181));

        HighGui.imshow("Ganttzgx",sourceImage);
        HighGui.waitKey(0);
        Imgcodecs.imwrite("PM13.jpg", sourceImage);
    }



}
