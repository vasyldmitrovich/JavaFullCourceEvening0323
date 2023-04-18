package com.softserve.edu8.pt1;

class Epartment implements  Cloneable{
    class  Adres{
        private String Street;
        private String Sity;


        public Adres( String Sity,String Street) {
            this.Sity=Sity;
            this.Street=Street;
        }
        public Adres() {
            this.Sity="";
            this.Street="";
        }

        @Override
        public String toString() {
            return  ( Sity+"\n"+Street);
        }
    }
    private String name;
    private  Adres adres;
    public Epartment(){
        adres=new Adres();//created adres-поле адреси типу Address.
    }
    public Epartment( String Sity,String Street, String name) {
        this();
        adres.Sity=Sity;
        adres.Street=Street;
        this.name=name;
    }
    public void seSity(String Sity) {
        adres.Sity=Sity;
    }
    public String getSity() {
        return adres.Sity;
    }
    @Override
    public String toString() {
        return adres+"\n"+ name;  //fullName.toString();
    }
    public void seName(String name) {
        this.name = name;
    }


    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
}