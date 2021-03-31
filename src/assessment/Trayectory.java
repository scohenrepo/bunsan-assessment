package assessment;

import assessment.utilerias.Utils;

import java.util.List;

public class Trayectory {


    /**
     *
     * @param roadToTravel  texto leido del archivo
     * @param goRight         avanzo 3 sobre el eje x
     * @param goDown          avanzo 1 sobre el eje y
     * @return treesFound     numero de arboles encontrados
     */
    public int countTrees(List<String> roadToTravel, int goRight, int goDown) {
        System.out.println("lines size:  " + roadToTravel.size());
        //contador de arboles
        int treesFound = 0;
        //x, y se inician en 0 pues es el primer punto en el plano
        //y avanza de uno en uno hasta terminar el archivo
        //x avanza de tres en tres hasta que termine el archivo
        int x = 0;
        for(int y = 0; y < roadToTravel.size(); y+=goDown) {
            if(isATree(roadToTravel.get(y), x))
                treesFound++;
            x += goRight;
        }
        return treesFound;
    }

    /**
     *
     * @param line     la linea en la que punto se evalua
     * @param index    el pundo del eje que se esta evaluando
     * @return
     */
    private boolean isATree(String line, int index) {
        System.out.println("index:  " + index);
        //en cada fila hay 31 caracteres, el arreglo va del 0 al 30
        //pero como la fila sigue un patron infinito, cuando se llega al indice 31
        //que no "existe" en la linea, se toma que el caracter que estaria en el indice
        //31 es el mismo que esta en el indice 0, el caracter que estaria en el indice 32
        //es el mismo que esta en el indice 2.
        //entonces: indice fantasma 31 sobre 31 caracteres deja un residuo de cero (mode)
        //que es el indice del caracter que se va a comparar
        return line.charAt(index%31) == '#';
    }

}
