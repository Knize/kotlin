internal class JavaCode {
    fun toJSON(collection: Collection<Int>): String {
        return "[" + collection.stream().map { toString() }.collect(Collectors.joining(", ")) + "]";
    }
}