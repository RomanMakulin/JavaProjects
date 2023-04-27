package org.example.Controller.CheckWinner;

import org.example.Controller.FilesWork.Config.PathRead;
import org.example.Controller.FilesWork.Config.PathWrite;
import org.example.Controller.FilesWork.WriterFile;
import org.example.Model.Toy;
import org.example.View.CongratsWinner.AllItems;
import java.util.ArrayList;
import java.util.List;

public class Logic {
    public void main(List<Toy> toyList, List<Toy> myList){

        List<Toy> low = new ArrayList<>(); // rare rate < 30 %
        List<Toy> high= new ArrayList<>(); // rare rate > 30 %

        new Distribution().service(toyList, low, high, myList); // Distribution to rare classes

        new WriterFile().file(myList, new PathWrite().cfg()); // save prises in file
        new WriterFile().file(toyList, new PathRead().cfg()); // update read file with all prises

        new AllItems().classic(myList); // print win prises in console
//        new RareItems().classic(low); // another print rare toys
//        new ClassicItems().classic(high); // another print classic rare toys

    }
}
