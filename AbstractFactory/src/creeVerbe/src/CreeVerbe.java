package creeVerbe.src;

import verbes.src.Verbe;

public interface CreeVerbe {
    /**
     * @param verbeInfinitif : infinitif d'un verbe. exemple: chanter
     * @return Verbe correspondant
     * @throws  IllegalArgumentEcxepetion si le verbe n'est pas reconnu
     * */
    public Verbe creeVerbe(/*type de vebe*/String verbeInfinitif);
}
