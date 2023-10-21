
package stringBuilder;

import java.util.Stack;

public class UndoStringBuilder {
    private StringBuilder stringBuilder;
    private Stack<String> operationStack;

    public UndoStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.operationStack = new Stack<>();
        operationStack.push(stringBuilder.toString());
    }

    public UndoStringBuilder(String str) {
        this.stringBuilder = new StringBuilder(str);
        this.operationStack = new Stack<>();
        operationStack.push(stringBuilder.toString());
    }

    public StringBuilder append(String str) {
        stringBuilder.append(str);
        operationStack.push(stringBuilder.toString());
        return stringBuilder;
    }

    public StringBuilder delete(int start, int end) {
        if (start >= 0 && start <= end && end <= stringBuilder.length()) {
            stringBuilder.delete(start, end);
            operationStack.push(stringBuilder.toString());
        } else {
            throw new IllegalArgumentException("Invalid start and end indices for delete operation.");
        }
        return stringBuilder;
    }

    public StringBuilder insert(int offset, String str) {
        if (offset >= 0) {
            stringBuilder.insert(offset, str);
            operationStack.push(stringBuilder.toString());
        } else {
            throw new IllegalArgumentException("Offset must not be less than 0");
        }
        return stringBuilder;
    }

    public StringBuilder replace(int start, int end, String str) {
        if (start >= 0 && start <= end && end <= stringBuilder.length()) {
            stringBuilder.replace(start, end, str);
            operationStack.push(stringBuilder.toString());
        } else {
            throw new IllegalArgumentException("Invalid start and end indices for replace operation.");
        }
        return stringBuilder;
    }

    public StringBuilder reverse() {
        stringBuilder.reverse();
        operationStack.push(stringBuilder.toString());
        return stringBuilder;
    }

    public StringBuilder undo() {
        if (!operationStack.isEmpty() && operationStack.size() > 1) {
            operationStack.pop(); // Remove the current state
            String previousState = operationStack.peek(); // Get the previous state
            stringBuilder = new StringBuilder(previousState);
        }
        return stringBuilder;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}

