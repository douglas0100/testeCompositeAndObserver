package br.unicap.eng2.atividade03.results;

import br.unicap.eng2.atividade03.operations.FactoryOperations;

public class ResultBuilder {
    private FactoryOperations factoryOperations;

    public ResultBuilder(FactoryOperations factoryOperations) {
        this.factoryOperations = factoryOperations;
    }

    public ResultComponent buildOperations(double[] leftValues, double[] rightValues) {
        ResultComponent operationsTree;
        
        ResultComposite resultCompositeBottomLeft = createBottomComposite(leftValues, factoryOperations);
        ResultComposite resultCompositeBottomRight = createBottomComposite(rightValues, factoryOperations);

        ResultComposite resultCompositeTop = new ResultComposite(factoryOperations.createTopOperation());
        resultCompositeTop.addResult(resultCompositeBottomLeft);
        resultCompositeTop.addResult(resultCompositeBottomRight);

        operationsTree = resultCompositeTop;

        return operationsTree;
    }

    public static ResultComposite createBottomComposite(double[] values, FactoryOperations operations) {
        ResultComposite composite = new ResultComposite(operations.createBottomOperation());
        for (double value : values) {
            ResultLeaf leaf = new ResultLeaf(value);
            composite.addResult(leaf);            
        }
        return composite;
    }

}
