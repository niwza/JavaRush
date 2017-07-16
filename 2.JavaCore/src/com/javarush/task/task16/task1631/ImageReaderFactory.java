package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by niwza on 14.07.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        if (type == ImageTypes.BMP)
            return new BmpReader();
        else if (type == ImageTypes.JPG)
            return new JpgReader();
        else if (type == ImageTypes.PNG)
            return new PngReader();
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
