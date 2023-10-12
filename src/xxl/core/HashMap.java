package xxl.core;

import java.util.List;

public class HashMap extends Representation {


    private java.util.HashMap<List<Integer>,Cell> _map;
    public HashMap(int width, int height) {
        super(width, height);
        _map = new java.util.HashMap<List<Integer>,Cell>();
    }
    public void setCell(int row, int column, Content content){
        List<Integer> key = List.of(row,column);
        Cell cell = new Cell(row,column,content);
        _map.put(key,cell);
    }
    private void changeContentCell(Cell cell, Content content){
        cell.setContent(content);
    }
    public Cell getCell(int row, int column){
        if (row > getWidth() || column > getHeight()) {
            throw new IllegalArgumentException("Out of bounds");
        }
            _map.put(List.of(row, column), new Cell(row, column, new NULL()));
        if (_map.get(List.of(row, column)) == null) {
            _map.put(List.of(row, column), new Cell(row, column, new NULL()));
        try {
			System.out.println("si2222s");
            return _map.get(List.of(row,column));
        } catch (Exception e) {
			System.out.println("cheguei ");
            _map.put(List.of(row,column),new Cell(row,column,new NULL()));
            return _map.get(List.of(row,column));
        }
        return _map.get(List.of(row, column));
    }
    @Override
    public void insertContent(int row, int column, Content content){
        if (getCell(row,column) != null) {
            changeContentCell(getCell(row,column),content);
        }else{
            setCell(row,column,content);
        }
    }
    @Override
    public void removeContent(int row, int column){
        if (getCell(row,column) != null) {
            changeContentCell(getCell(row,column),new NULL());
        }else{
            //TODO: throw exception
        }
    }

}
