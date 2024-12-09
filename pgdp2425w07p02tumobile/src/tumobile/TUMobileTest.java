package tumobile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TUMobileTest {

    private Car car;
    private Engine engine;
    private Fueltank fueltank;
    @BeforeEach
    void setup(){
        car = CarFactory.getInstance().getAssembledCar();
        engine = car.getEngine();
        fueltank = car.getFueltank();
    }

    private Wheel[] wheels(){
        return new Wheel[]{
                car.getFrontLeftWheel(),
                car.getFrontRightWheel(),
                car.getRearLeftWheel(),
                car.getRearRightWheel()

        };
    }

    //
    @Test
    void testCarNotNull(){
        assertNotNull(car);
    }
    @Test
    void testEngineNotNull(){
        assertNotNull(engine);
    }
    @Test
    void testFeultankNotNull(){
        assertNotNull(fueltank);
    }
    @Test
    void testWheelsNotNull(){
        for (Wheel wheel : wheels()){
            assertNotNull(wheel);
        }
    }

    //
    @Test
    void testEngineConsumptionValid(){
        assertTrue(engine.getConsumption()>0);
    }

    //
    @Test
    void testFueltankCapacityValid(){
        assertTrue(fueltank.getCapacity()>0);
    }

    @Test
    void FueltankFuelLevelValid(){
        assertTrue(fueltank.getFuelLevel()>0);
    }

    @Test
    void testFueltankFillCorret(){
        double capacity = fueltank.getCapacity();
        double fuelLevel = fueltank.getFuelLevel();
        double fill = (capacity - fuelLevel) / 2;

        assertEquals(0.0, fueltank.fill(fill));
        assertEquals(fuelLevel + fill, fueltank.getFuelLevel());

    }

    @Test
    void testFueltankFillFalse(){
        double capacity = fueltank.getCapacity();
        double fuelLevel = fueltank.getFuelLevel();

        assertEquals(-1.0, fueltank.fill(-1.0));

        assertEquals(fuelLevel + capacity - capacity, fueltank.fill(capacity));
    }

    @Test
    void testFueltankConsumeCorret(){
        double capacity = fueltank.getCapacity();
        double fuelLevel = fueltank.getFuelLevel();
        double consume = fuelLevel / 2;
        assertEquals(0.0, fueltank.consume(consume));
        assertEquals(fuelLevel - consume, fueltank.getFuelLevel());
    }

    @Test
    void testFueltankConsumeFalse(){
        double capacity = fueltank.getCapacity();
        double fuelLevel = fueltank.getFuelLevel();

        assertEquals(-1.0, fueltank.consume(-1.0));

        assertEquals(capacity - fuelLevel, fueltank.consume(capacity));
        assertEquals(0.0, fueltank.getFuelLevel());
    }

    @Test
    void testWheelsDifferent(){
        Wheel[] wheels = wheels();
        for (int i = 0; i < 4; i++){
            for (int j = i+1; j < 4; j++){
                assertNotEquals(wheels[i], wheels[j]);
            }
        }
    }

    @Test
    void testWheelGetDiameter(){
        Wheel[] wheels = wheels();
        for (int i = 0; i < 4; i++){
            assertEquals(wheels[0].getDiameter(), wheels[i].getDiameter());
        }
    }

    @Test
    void testWheelGetPressure(){
        Wheel[] wheels = wheels();
        for (int i = 0; i < 4; i++){
            assertEquals(wheels[0].getPressure(), wheels[i].getPressure());
        }
    }

    @Test
    void testWheelGetWidth(){
        Wheel[] wheels = wheels();
        for (int i = 0; i < 4; i++){
            assertEquals(wheels[0].getWidth(), wheels[i].getWidth());
        }
    }

    //
    @Test
    void testCarGetRange(){
        double fuelLevel = fueltank.getFuelLevel();
        double consumption = engine.getConsumption();
        assertEquals(fuelLevel / consumption * 100, car.getRange());
    }

    @Test
    void testCarGetMaxRange(){
        double capacity = fueltank.getCapacity();
        double consumption = engine.getConsumption();
        assertEquals(capacity / consumption * 100, car.getMaxRange());
    }

}
