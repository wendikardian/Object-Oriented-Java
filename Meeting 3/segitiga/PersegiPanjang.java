class PersegiPanjang{
    private int panjang;
    private int lebar;
    PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }

    public int getLuas(){
        return panjang*lebar;
    }
    public int getKeliling(){
        return panjang*2 + lebar*2;
    }

    public void setPanjang(int newPanjang){
        panjang = newPanjang;
    }
    public void setLebar(int newLebar){
        lebar = newLebar;
    }
}