class Abonelik {
    private String abonelikTuru;
    private int ucret;

    public Abonelik(String abonelikTuru, int ucret) {
        this.abonelikTuru = abonelikTuru;
        this.ucret = ucret;
    }

    // Getter ve setter metodları
    public String getAbonelikTuru() {
        return abonelikTuru;
    }

    public void setAbonelikTuru(String abonelikTuru) {
        this.abonelikTuru = abonelikTuru;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }
}