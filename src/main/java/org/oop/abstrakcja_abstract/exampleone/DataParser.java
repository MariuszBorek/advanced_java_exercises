package org.oop.abstrakcja_abstract.exampleone;

public abstract class DataParser { // klasa abstrakcyjna

    protected String data; // modyfikator protected umożliwia korzystanie z pola w klasach pochodnych

    public abstract Data parse();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void validateData() {
        if(data == null || data.isEmpty()) {
            throw new IllegalArgumentException("data are not valid!");
        }
    }
}
