package P3;

public class GoAction implements Action{
    //@Override
	/**
	 * Χ���е����Ӳ���
	 * @param player
	 * @param piece
	 * @param board
	 * @return���ӳɹ�����true�����򷵻�false
	 */
    public boolean remove(Player player,Piece piece,GoBoard board) {
        if(removeIsLegal(player,piece.getPosition(),board)){
            board.deletePiece(piece);
            player.addHistory("Remove piece in the position "+ piece.getPosition());
            return true;
        }

        return false;
    }

    /**
     * Χ���еļ��Ӳ���
     * @param player
     * @param position
     * @param board
     * @return ���ӳɹ�����true�����򷵻�false
     */
    public boolean addPiece(Player player,Position position,GoBoard board){
        if(moveIsLegal(player,position,board)){
            if(player.getId()==1)
                board.addPiece1(new Piece(position.getX(),position.getY(),"white"));
            else
                board.addPiece2(new Piece(position.getX(),position.getY(),"black"));
            player.addHistory("Add a piece in the position "+position);
            return true;
        }

        return false;
    }

    //@Override
    /**
     * �ж����Ӳ����Ƿ�Ϸ�
     * @param player
     * @param position
     * @param board
     * @return �Ϸ�����true�����򷵻�false
     */
    public boolean removeIsLegal(Player player,Position position,GoBoard board){
        if(position.getX()>18 || position.getY()>18||
        position.getX()<0 || position.getY()<0){
            System.out.println("The position is out of bound!");
            return false;
        }
        if(board.getBriefInfo(position.getX(),position.getY())==0){
            System.out.println("There is no pieces to remove!");
            return false;
        }
        if(player.getId()==board.getBriefInfo(position.getX(),position.getY())){
            System.out.println("You can't remove the pieces of yours!");
            return false;
        }
        return true;
    }

    //@Override
    /**
     * �жϼ��Ӳ����Ƿ�Ϸ�
     * @param player
     * @param position
     * @param board
     * @return �Ϸ�����true�����򷵻�false
     */
    public boolean moveIsLegal(Player player,Position position,GoBoard board){
        if(position.getX()>18 || position.getY()>18||
        position.getX()<0|| position.getY()<0){
            System.out.println("The position is out of bound!");
            return false;
        }
        if(board.getBriefInfo(position.getX(),position.getY())!=0){
            System.out.println("The position has been taken off!");
            return false;
        }
        return true;
    }
}
