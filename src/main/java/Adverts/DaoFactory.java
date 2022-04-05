package Adverts;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao(); //renamed until we learn how to move sql into this
        }
        return adsDao;
    }
}
