package br.unicap.eng2.atividade03.results.observer;

import java.util.LinkedList;
import br.unicap.eng2.atividade03.operations.Operation;

public class ResultComposite extends ResultComponent {

    private LinkedList<ResultComponent> children;

    public ResultComposite(Operation operationStrategy) {
        this.children = new LinkedList<>();
        this.operationStrategy = operationStrategy;
    }
   
    @Override
    public double getResult() {
        double result;
        result = children.get(0).getResult();
        for(int i = 1; i < children.size(); i ++) {
            result = operationStrategy.calculate(result, children.get(i).getResult());
        }
        return result;
    }

    @Override
    public void addResult(ResultComponent resultComponent) {
        this.children.add(resultComponent);
    }


}
