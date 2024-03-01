package Exercise10.Task2;

public class InvalidInputException extends Exception {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFullMessage(boolean appendStackTrace) {
        StringBuilder finalMessage = new StringBuilder("Invalid input detected. Reason: [" + message + "]");
        if (appendStackTrace) {
            var stackTrace = getStackTrace();
            for (var stackChunk : stackTrace) {
                finalMessage.append("\n\t—— at ").append(stackChunk.toString());
            }
        }

        return finalMessage.toString();
    }

    InvalidInputException(String message) {
        setMessage(message);
    }
}
