public record product(String code, String name, int quantity) {
    @Override
    public String toString() {
        return "Код: " + code + "; Назва: " + name + "; Кількість на складі: " + quantity;
    }
}