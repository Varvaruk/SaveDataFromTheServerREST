Save Data From The Server REST

Программа:
 -Используя OkHttp принимает на вход URL от API который отдает JSON и забирает его;
 -С помощью  Jackson  полученный  JSON  десериализует в объекты;  
 -CrudRepository сохраняет объекты  в БД  MYSQL.

Созданы несколько junit тестов для проверки работоспособности.
 