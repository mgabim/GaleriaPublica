package machado.maria.gabriela.galeriapublica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {
    int navigationOpSelected = R.id.gridViewOp; //jguarda a escolha do usuario no menu btNav

    public MainViewModel(@NonNull Application application){
        super(application);
    }

    public int getNavigationOpSelected(){
        return navigationOpSelected;
    }

    public void setNavigationOpSelected(int navigationOpSelected){
        this.navigationOpSelected = navigationOpSelected;
    }
}