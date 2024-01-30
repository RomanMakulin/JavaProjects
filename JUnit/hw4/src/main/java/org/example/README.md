### Задание 1. Ответьте письменно на вопросы:

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

Полезно при написании модульных тестов, поскольку оно уменьшает зависимость тестов от сложных внешних зависимостей, улучшает производительность тестов, изолирует тесты друг от друга, поддерживает разработку через тестирование и обеспечивает гибкость при написании тестов.

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

Mock для проверки аргументов и управлением ими. Задаем поведение и возвращаем (return) результат нужного метода.

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

Stub для обычного определения и перелачи аргументов.

4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?

Fake для использования вместо реального объекта. Она упрощает написание и выполнение модульных тестов, позволяя имитировать работу с различными сервисами и зависимостями.

### Задание 2.

У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных.
Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.

Формат сдачи: воспользуйтесь одним из вариантов: Ссылка на репозиторий Git или Прикрепленный архив

Письменное задание 1 можно также разместить в репозитории или разместить текстом в окне сдачи практического задания.