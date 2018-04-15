package javaCore.level16.task401_lev16_lec13;

import javaCore.level16.task401_lev16_lec13.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) throws IllegalArgumentException {
        if (type == ImageTypes.JPG) {
            return new JpgReader();
        }
        if (type == ImageTypes.BMP){
            return new BmpReader();
        }
        if (type == ImageTypes.PNG){
            return new PngReader();
        }
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
