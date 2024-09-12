package GeoPolitical;

public enum EnumGeoPolitical {

     NORTH_EAST ("BORNO,GONBE , ADAMAWA , YOBE, BAUCHI"),
     NORTH_CENTRAL ("Benue , Kogi , Kwara , Nasarawa , Niger , Plateau , FCT"),
     NORTH_WEST ("Jigawa , Kaduna , Kano , Katsina , Kebbi , Sokoto , Zamfara "),
     SOUTH_EAST ("Ebonyi , Abia , Anambra , Imo , Enugu"),
     SOUTH_SOUTH ("Delta , Edo , AkwaIbom , Bayelsa , CrossRiver , Rivers"),
     SOUTH_WEST ("Lagos , Osun , Oyo , Ekiti , Ogun , Ondo");

    private String EnumGeoPolitical(String Nigeria_zone) {
        return Nigeria_zone;
    }
    private String nigeria_zone;

    private EnumGeoPolitical (String Nigeria_zone) {
        this.nigeria_zone = Nigeria_zone;
    }
    public String getNigeria_zone() {
        return nigeria_zone;
    }
    }
