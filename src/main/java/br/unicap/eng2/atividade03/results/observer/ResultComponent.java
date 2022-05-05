package br.unicap.eng2.atividade03.results.observer;

import br.unicap.eng2.atividade03.operations.Operation;

public abstract class ResultComponent {
    
    protected Operation operationStrategy;

    public abstract double getResult();
    public abstract void addResult(ResultComponent resultComponent);

}
