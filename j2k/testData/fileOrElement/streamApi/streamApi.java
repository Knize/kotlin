class JavaCode {
    public String toJSON(Collection<Integer> collection) {
        return "[" + collection.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }
}