package Draw.zgx;

import org.opencv.core.Core;

public class Application {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        draw d=new draw();
        d.drawg();
    }
}
