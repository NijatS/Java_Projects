
public class Card {
    private char value;
    private boolean prediction = false;

    public Card(char value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public char getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(char value) {
        this.value = value;
    }

    /**
     * @return the prediction
     */
    public boolean isPrediction() {
        return prediction;
    }

    /**
     * @param prediction the prediction to set
     */
    public void setPrediction(boolean prediction) {
        this.prediction = prediction;
    }
    
}
