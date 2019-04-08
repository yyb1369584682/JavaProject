package cn.mysql.jdbcutil;

public class Sort {
    private int sid;
    private String sname;
    private Double sprice;
    private String sdesc;

    public Sort(){}

    public Sort(int sid, String sname, Double sprice, String sdesc) {
        this.sid = sid;
        this.sname = sname;
        this.sprice = sprice;
        this.sdesc = sdesc;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public void setSdesc(String sdesc) {
        this.sdesc = sdesc;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public Double getSprice() {
        return sprice;
    }

    public String getSdesc() {
        return sdesc;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sprice=" + sprice +
                ", sdesc='" + sdesc + '\'' +
                '}';
    }
}
