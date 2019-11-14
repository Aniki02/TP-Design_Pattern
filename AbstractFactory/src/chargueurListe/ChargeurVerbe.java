package chargueurListe;

import creeVerbe.src.CreeVerbe;
import verbes.src.Verbe;
import verbes.src.VerbePremierGroupe;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Vector;

public abstract class ChargeurVerbe {

    public static Vector<Verbe> chargeur(BufferedReader f, CreeVerbe v){
        String line;
        Vector<Verbe> listeVerbe = new Vector<Verbe>();
        try
        {
            while ((line=f.readLine())!=null)
            {
                try
                {
                    listeVerbe.add(v.creeVerbe(line));
                }catch (IllegalArgumentException e)
                {
                    //ingnore la ligne qui respecte pas la terminaison "er"
                }

            }
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listeVerbe;
    }
}
