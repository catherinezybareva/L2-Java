import java.util.HashMap;
import java.util.Map;

// Класс для представления города
class City {
    private String name;
    private Map<City, Integer> routes;

    // Конструктор
    public City(String name) {
        this.name = name;
        this.routes = new HashMap<>();
    }

    // Метод для добавления пути в другой город
    public void addRoute(City destination, int cost) {
        routes.put(destination, cost);
    }

    // Метод для получения названия города
    public String getName() {
        return name;
    }

    // Метод для текстового представления города и путей к другим городам
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        for (Map.Entry<City, Integer> entry : routes.entrySet()) {
            sb.append("  -> ").append(entry.getKey().getName())
                    .append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}