# OOPSeminars
**Здравствуйте!**  

**Проблемы проектирования:**  

Реализовала использование методов toGo, fly, sweem для разных животных двумя способами:
1) Переопределение метода sweem для класса Попугай. Здесь вижу недостаток в том, что при наличии большого количества классов и методов сложно переопределять в каждом классе все необходимые методы.
2) Использование if в методах toGo и sweem для разграничения поведения экземпляров разных классов. Здесь недостаток в том, что условие становится слишком громоздким при даже сравнительно небольшом количестве классов.
Можно было создавать эти методы не в родительском классе, а в каждом дочернем и только те, что нужны для конкретного дочернего класса. Но тогда нарушается принцип минимизации повторения кода, т.к. один и тот же метод, например toGo, был бы почти в каждом дочернем классе.
Хотелось бы иметь возможность отсекать/делать недоступными ненужные методы из родительских классов для дочерних классов  

**Вопросы:**  

Осталось непонятным для меня преимущество и область применимости инициализации экземляра через родтельский класс в сравнении с дочерним (какой способ когда предпочтительнее использовать и почему):
Animal barsik = new Cat() и Cat barsik = new Cat()
