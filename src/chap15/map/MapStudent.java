package chap15.map;

import java.util.Objects;

public class MapStudent {
    public int sno;
    public String name;

    public MapStudent(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MapStudent) {
            MapStudent mstu = (MapStudent) obj;
            return sno == mstu.sno && name.equals(mstu.name);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name);
    }

}
