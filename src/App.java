
import java.util.ArrayList;
import com.exp.*;


public class App {
    private final ArrayList<Categorie> categories;

    public App() {
        this.categories = new ArrayList<>();
    }

    
    
    // Categories methods
    public boolean addCategorie(String name ){
        if (this._existCategorie(name) == false ) 
            return this.categories.add(new Categorie(name));
        return false;
    }
    
    public String[] categoriesToStrings() {
        if ( this._categoriesIsEmpity() == false ) {
            String[] temp = new String[this.categories.size()];
            
            for ( int x=0; x<this.categories.size(); x++ ){
                temp[x] = this.categories.get(x).name;}
            
            return temp;
        }
        return new String[]{};
    }
      
    // Expense methods
    public boolean addExpense(String categorieName, Expense exp) {
        if (this._categoriesIsEmpity() ==  false ) {
            int categorieID = this._getCategorieID(categorieName);
            if (categorieID >= 0 ) {
                return this.categories.get(categorieID).addExpense(exp);
            }
        }
        return false;
    }

    public boolean delExpense(String categorieName, String uuid) {
        if (this._categoriesIsEmpity() ==  false ) {
            int categorieID = this._getCategorieID(categorieName);
            
            if (categorieID >= 0 ) {
                return this.categories.get(categorieID).delExpense(uuid);
            }
        }
        return false;
    }

    public Expense getExpense(String categorieName, String uuid) {
        if (this._categoriesIsEmpity() ==  false ) {
            int categorieID = this._getCategorieID(categorieName);
            if (categorieID >= 0 ) {
                return this.categories.get(categorieID).getExpense(uuid);
            }
        }
        return null;
    }
    
    public ArrayList<String[]> FilterExpense(String categorieName, String month) {
        ArrayList<String[]> output = new ArrayList<>();
        
        if (this.categories.isEmpty() == false ) {
            
            if (categorieName.equals("all")) {
                for ( Categorie x : this.categories ) {
                    ArrayList<String[]> tempArr = new ArrayList<>();
                    tempArr = x.getExpenseFiltered(month);
                    
                    if (tempArr != null){
                        for (String[] y : tempArr) output.add(y);}
                }
               
            } else {              
                int catId = this._getCategorieID(categorieName);
                Categorie cat = this.categories.get(catId);
                return cat.getExpenseFiltered(month);
            }
            
            return output;
        }
        return null;
    }

  

    // private methods    
    private boolean _categoriesIsEmpity() {
        return this.categories.isEmpty();
    }

    private int _getCategorieID(String name) {
        for ( int x=0; x<this.categories.size(); x++ ) {
            if ( this.categories.get(x).name.equals(name)){
                return x;
            }
        }
        return -1;
    }

    private boolean _existCategorie(String name) {
        for ( Categorie tmp : this.categories ) {
            if (tmp.name.equals(name)) return true;
        }
        return false;
    }
}
