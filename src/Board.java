package P3;

public interface Board {
	/**
	 * ��ѯλ����Ϣ����ӡ��������
	 * @param position 
	 * @return �������ѯλ�úϷ�������true�����򣬷���false
	 */
    public boolean searchPosition(Position position);

    /**
     * ��ȡ���������Ŀ
     * @param player
     * @return ���ظ����������Ŀ
     */
    public int getNumberOfPieces(Player player);
    
    /**
     * ��ȡ����λ����Ϣ������λ�����ӹ���
     * @param x
     * @param y
     * @return ��λ�������ӷ���0���������һ����1��������Ҷ�����2
     */
    public int getBriefInfo(int x,int y);
    
    /**
     * ��ӡ������Ϣ����ʾ���ӷֲ�
     */
    public void printBoard();
}
