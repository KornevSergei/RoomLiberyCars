package Data;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import Model.Car;

//Класс для работы с базой данных, удаление, добавление и тд
//Ставим анотации
@Dao
public interface CarDAO {

    //добавление
    @Insert
    public long addCar(Car car);

    //обновление записи
    @Update
    public void updateCar(Car car);

    //Удаление записи
    @Delete
    public void deleteCar(Car car);

    //Запрос на извлечение всех записей строк
    @Query("select * from cars")
    public List<Car> getAllCars();

    //Запрос для излечения информаци об одном автомобиле по конкретной строке
    @Query("select * from cars where  car_id ==:carId ")
    public Car getCar(Long carId);
}
