package com.softserve.edu8.pt1;

//Maybe name of class must be Department ??? Where is class like App.class and main method there
class Epartment implements  Cloneable{
    //Make class Adres public or private, and name of class must be Address not Adres
    class  Adres{
        //Name of variable must start from lower case
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

    //Where is spaces between fields and methods???
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