package P3;

public class Position {
    private int x,y;
    public Position(int x,int y){
        this.x = x;
        this.y= y;
    }

    /**
     * ���λ�õĺ�����
     * @return λ�ú�����
     */
    public int getX(){
        return x;
    }

    /**
     * ��ȡλ�õ�������
     * @return λ��������
     */
    public int getY(){
        return y;
    }

    /**
     * �ı�λ�õĺ�������
     * @param x
     * @param y
     */
    public void changePosition(int x,int y){
        this.x = x;
        this.y = y;
    }

    /**
     * �ж�����λ���Ƿ����
     * @param position
     * @return ��ȷ���true�����򷵻�true
     */
    public boolean equals(Position position) {
        return this.x==position.getX() && this.y==position.getY();
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
