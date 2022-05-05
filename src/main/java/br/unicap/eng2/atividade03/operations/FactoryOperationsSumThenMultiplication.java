package br.unicap.eng2.atividade03.operations;

public class FactoryOperationsSumThenMultiplication implements FactoryOperations {

    @Override
    public Operation createBottomOperation() {
        Operation operationSum = new OperationSum();
        return operationSum;
    }

    @Override
    public Operation createTopOperation() {
        Operation operationMultiplication = new OperationMultiplication();
        return operationMultiplication;
    }
    
}
