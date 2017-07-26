package pl.kit.context_aware.lemur.HeartDROID;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import pl.kit.context_aware.lemur.FilesOperations.FilesOperations;
import pl.kit.context_aware.lemur.Readers.ReadTime;

/**
 * Created by Tomek on 2017-07-19.
 */

public class HeartService extends IntentService {

    /**
     * Needed constructor
     */
    public HeartService() {
        super("Heart Service");
    }

    /**
     * Runs all models
     * @param intent intent sent to service
     */
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Inference inference = new Inference(this);
        Integer x = 0;
        for(String scriptName : FilesOperations.getAllModelNames(this)) {
            Log.d("Lemur", x.toString());
            x++;
            inference.runInference(getFilesDir() + "/" + scriptName + ".hmr");
        }
    }
}
