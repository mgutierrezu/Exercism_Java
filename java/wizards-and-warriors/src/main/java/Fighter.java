class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return (fighter.isVulnerable() == true) ? 10 : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

}

class Wizard extends Fighter {
    private boolean spellActive = false;

    @Override
    int getDamagePoints(Fighter fighter) {
        return (spellActive == true) ? 12 : 3;
    }

    @Override
    boolean isVulnerable() {
        return (spellActive == true) ? false : true;
    }

    void prepareSpell() {
        spellActive = true;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }


    
}
