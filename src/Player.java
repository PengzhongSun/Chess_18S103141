package P3;

import java.util.*;

public class Player {
    private String name;
    private int id;
    private List<String> history = new ArrayList<>();

    public Player(String name,int id){
        this.name = name;
        this.id = id;
    }

    /**
     * ��ȡ���ID
     * @return ���ID
     */
    public int getId(){
        return id;
    }
    
    /**
     * ��ȡ�������
     * @return �������
     */
    public String getName(){
        return name;
    }

    /**
     * ��ȡ�����ʷ�㼣
     * @return �����ʷ�㼣
     */
    public List<String> getHistory(){
        return history;
    }

    /**
     * �����ʷ�㼣
     * @param s
     */
    public void addHistory(String s){
        history.add(s);
    }
}
