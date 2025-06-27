package Draw.zgx;

import org.opencv.core.Core;

public class Application_PM13 {

        static {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        }

        public static void main(String[] args) {
            draw_PM13 d=new draw_PM13();
            d.drawg();
        }


}
