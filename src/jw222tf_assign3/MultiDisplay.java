package jw222tf_assign3;

/**
 * Created by JorianWielink on 03/12/2016.
 */
public class MultiDisplay {
    private String mDMessage;
    private int mDCount;

    public MultiDisplay() {
        mDMessage = "";
        mDCount = 0;
    }

    public MultiDisplay(String msg, int count) {
        mDMessage = msg;
        mDCount = count;
    }

    public void setDisplayMessage(String str){
        mDMessage = str;
    }

    public void setDisplayCount(int i) {
        mDCount = i;
    }

    public void display() {
        for (int i = 0; i < mDCount; i++) {
            System.out.println(mDMessage);
        }
    }

    public void display(String msg, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }

    public String getDisplayMessage() {
        return mDMessage;
    }

    public int getDisplayCount(){
        return mDCount;
    }
}
