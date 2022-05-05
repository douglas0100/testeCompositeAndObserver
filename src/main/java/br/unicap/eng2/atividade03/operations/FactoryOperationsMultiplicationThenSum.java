package br.unicap.eng2.atividade03.operations;

public class FactoryOperationsMultiplicationThenSum implements FactoryOperations {

    @Override
    public Operation createBottomOperation() {
        Operation operationMultiplication = new OperationMultiplication();
        return operationMultiplication;
    }

    @Override
    public Operation createTopOperation() {
        Operation operationSum = new OperationSum();
        return operationSum;
    }
    
}
