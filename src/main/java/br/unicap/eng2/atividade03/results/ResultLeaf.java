package br.unicap.eng2.atividade03.results;

public class ResultLeaf extends ResultComponent {

    private double result;

    public ResultLeaf(double result) {
        this.result = result;
    }

    @Override
    public double getResult() {
        return this.result;
    }

    @Override
    public void addResult(ResultComponent resultComponent) {
        // TODO Auto-generated method stub
        
    }

    public void setResult(double result) {
        this.result = result;
    }
    
}
