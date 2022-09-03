package model;

import java.io.Serializable;

public class Bill implements Serializable,Calculated {
    private long oldIndex;
    private long newIndex;

    public Bill() {
    }
    public Bill(long oldIndex, long newIndex) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;

    }
    public long getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(long oldIndex) {
        this.oldIndex = oldIndex;
    }

    public long getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(long newIndex) {
        this.newIndex = newIndex;
    }


    public long payMoney() {
        long index = newIndex - oldIndex;
        long money = index * index;
        return money;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                '}';
    }
}
