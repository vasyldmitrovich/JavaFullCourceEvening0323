package edu04.hw04.hw3;

public enum HTTPError {
    ERROR400("Bad_Request"), ERROR401("Unauthorized"), ERROR402("Forbidden");
    private String name;

    @Override
    public String toString() {
        return "HTTPError{" +
                "name='" + name + '\'' +
                '}';
    }

    HTTPError(String name) {
        this.name = name;
    }
}
