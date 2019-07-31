package P3;

public class Piece {
    private Position position;
    private String name;

    /**
     * �ж����������Ƿ���ͬ
     * @param piece
     * @return ��ͬ����true�����򷵻�false
     */
    public boolean equals(Piece piece) {
        return this.position.equals(piece.getPosition())&&
                this.name.equals(piece.getName());
    }

    public Piece(int x, int y, String name){
        position = new Position(x,y);
        this.name = name;
    }

    /**
     * ������ӵ�����
     * @return ��������
     */
    public String getName(){
        return name;
    }

    /**
     * ��ȡ����λ����Ϣ
     * @return ����λ��
     */
    public Position getPosition(){
        return new Position(position.getX(),position.getY());
    }

    /**
     * �ı�����λ��
     * @param x
     * @param y
     */
    public void changePosition(int x,int y){
        position.changePosition(x,y);
    }

}
