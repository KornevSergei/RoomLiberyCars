package Data;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import Model.Car;

//класс для создания базы данных, позволяем создать в любом месте приложения базу данных
@Database(entities = {Car.class},version = 1)
public abstract class CarsAppDataBase extends RoomDatabase {

    //получаем обьект и даём возможность обращаться к нему
    public abstract CarDAO getCarDAO();
}
