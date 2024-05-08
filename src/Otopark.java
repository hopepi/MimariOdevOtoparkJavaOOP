public abstract class Otopark {
        protected int kapasite;

        public Otopark(int kapasite) {
            this.kapasite = kapasite;
        }

        public abstract void girisYap(Musteri musteri);

        public abstract void cikisYap(Musteri musteri);
        public abstract int dolulukKontrol();
}
