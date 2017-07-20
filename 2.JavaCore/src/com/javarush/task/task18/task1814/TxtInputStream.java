package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    private FileInputStream stream;

    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);
        String[] s = fileName.split("[.]");
        if (s[s.length - 1].equals("txt")) {
            this.stream = new FileInputStream(fileName);
        } else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    @Override
    public int read() throws IOException {
        return stream.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return stream.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return stream.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return stream.skip(n);
    }

    @Override
    public int available() throws IOException {
        return stream.available();
    }

    @Override
    public void close() throws IOException {
        stream.close();
    }

    @Override
    public FileChannel getChannel() {
        return stream.getChannel();
    }

    @Override
    public void mark(int readlimit) {
        stream.mark(readlimit);
    }

    @Override
    public void reset() throws IOException {
        stream.reset();
    }

    @Override
    public boolean markSupported() {
        return stream.markSupported();
    }

    public static void main(String[] args) throws UnsupportedFileNameException, IOException {
        TxtInputStream txt = new TxtInputStream(args[0]);
    }
}

