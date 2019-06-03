// Please note : @LinkingObjects and default values are not represented in the schema and thus will not be part of the generated models
package ef.com.convertsqlitetorealm;
import io.realm.RealmObject;

public class vietanh extends RealmObject {
    private int id;
    private String word;
    private String wordSearch;

    private String mean;
    private String shortMean;

    public vietanh() {
    }

    public vietanh(int id, String word, String wordSearch, String mean, String shortMean) {
        this.id = id;
        this.word = word;
        this.wordSearch = wordSearch;
        this.mean = mean;
        this.shortMean = shortMean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordSearch() {
        return wordSearch;
    }

    public void setWordSearch(String wordSearch) {
        this.wordSearch = wordSearch;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getShortMean() {
        return shortMean;
    }

    public void setShortMean(String shortMean) {
        this.shortMean = shortMean;
    }
}
