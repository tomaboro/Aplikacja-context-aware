package pl.kit.context_aware.lemur.HeartDROID.actions;

import heart.Action;
import heart.State;
import pl.kit.context_aware.lemur.HeartDROID.Inference;

/**
 * Created by Krzysiek on 2017-01-13.
 */

public class setDataTransmission implements Action {
    @Override
    public void execute(State state) {
        String argument = String.valueOf(state.getValueOfAttribute("datatransmission"));
        switch (argument){
            case "on":
                //TODO on Android
            case "off":
                //TODO on Android
        }

    }

}