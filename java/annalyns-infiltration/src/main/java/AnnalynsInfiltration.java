class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake == true) {
            return false;
        } else
            return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true) {
            return true;
        } else
            return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake == false) {
            if (prisonerIsAwake == true) {
                return true;
            } else
                return false;
        } else
            return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

        if (petDogIsPresent == true) {
            if (archerIsAwake == false) {
                return true;
            }
            else return false;
        }

        else {
            if (archerIsAwake == false && knightIsAwake == false && prisonerIsAwake == true) {
                return true;
            }
            else return false;
        }

    }
}
