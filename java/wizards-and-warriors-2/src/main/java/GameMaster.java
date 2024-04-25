public class GameMaster {

    public String describe(Character personaje) {
        return "You're a level " + personaje.getLevel() + " " + personaje.getCharacterClass() + " with "
                + personaje.getHitPoints() + " hit points.";
    }

    public String describe(Destination destino) {
        return "You've arrived at " + destino.getName() + ", which has " + destino.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod travel) {
        if (travel == TravelMethod.HORSEBACK) {
            return "You're traveling to your destination on horseback.";
        } 
        else if (travel == TravelMethod.WALKING){
            return "You're traveling to your destination by walking.";
        }
        else {
            return "";
        }
    }



    public String describe(Character personaje, Destination destino, TravelMethod travel) {
        return describe(personaje) + " " + describe(travel) + " " + describe(destino);
    }

    public String describe(Character personaje, Destination destino) {
        
        return describe(personaje) + " You're traveling to your destination by walking. " + describe(destino);
    }
}
