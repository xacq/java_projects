package modelos;

/**
 * La clase Person implementa la interfaz Observer y representa a una persona
 * que observa los cambios en los datos meteorológicos. La persona se puede
 * suscribir y cancelar la suscripción a las actualizaciones de WeatherData.
 */
public class Person implements Observer {
    private String name;
    private float temperature;
    private WeatherData weatherData;
    private boolean isSubscribed;

    /**
     * Constructor para crear una nueva instancia de Person.
     *
     * @param name el nombre de la persona.
     * @param weatherData la instancia de WeatherData a la cual esta persona se suscribirá.
     */
    public Person(String name, WeatherData weatherData) {
        this.name = name;
        this.weatherData = weatherData;
        this.isSubscribed = false;
    }

    /**
     * Método que se llama cuando hay una actualización de temperatura.
     * Actualiza la temperatura de la persona y llama al método display.
     * @param temperature la nueva temperatura que se ha notificado.
     */
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
            // Muestra un mensaje si la temperatura supera los 50 grados
        if (temperature > 50) {
            System.out.println("Alerta para " + name + ": La temperatura ha superado los 50 grados.");
        }
        // Muestra un mensaje si la temperatura supera los 80 grados
        if (temperature > 80) {
            System.out.println("Alerta para " + name + ": La temperatura ha superado los 80 grados.");
        }
        display();
    }

    /**
     * Muestra la información de la persona, incluyendo el nombre,
     * la temperatura actual y un color asociado a la temperatura.
     */
    public void display() {
        String color;
        if (temperature <= 50) {
            color = "Verde";
        } else if (temperature <= 80) {
            color = "Naranja";
        } else {
            color = "Rojo";
        }
        System.out.println("Persona: " + name + " - Temperatura: " + temperature + " - Color: " + color);
    }

    public void subscribe() {
        if (!isSubscribed) {
            weatherData.registerObserver(this);
            isSubscribed = true;
        }
    }

    public void unsubscribe() {
        if (isSubscribed) {
            weatherData.removeObserver(this);
            isSubscribed = false;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isIsSubscribed() {
        return isSubscribed;
    }
    
    
    
}
