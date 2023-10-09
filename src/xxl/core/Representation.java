package xxl.core;

public abstract class Representation {
    private final int _width;
    private final int _height;

    public Representation(int width, int height){
        _width = width;
        _height = height;
    }
    public int getWidth(){
        return _width;
    }
    public int getHeight(){
        return _height;
    }


}
