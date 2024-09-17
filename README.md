# лабораторная работа №1

- Выполнила: Плотникова 
- Язык программирования Java

# Основной функционал:
## 1. Первый экран (Activity 1):
- Отображает кнопку с текстом "Перейти к Activity 2".
<div align="center">
<img src="https://github.com/user-attachments/assets/0185988d-9131-4083-94d1-b16792ec19cf" width="300"/>
</div>

- При нажатии на кнопку выполняется переход на второй экран (Activity 2) с передачей параметра (Плотникова Вероника) через Intent.

## 2. Второй экран (Activity 2):
- Принимает параметр от первого экрана и отображает его в TextView с сообщением: Переданный параметр: Плотникова Вероника.
<div align="center">
- <img src="https://github.com/user-attachments/assets/22656f41-bca0-48a7-8c10-60f97dadcfce" width="300"/>
</div>

# Структура проекта

- В разметку первой Activity (activity_main.xml) я добавила кнопку для перехода на Activity 2.
```java
    <Button
        android:id="@+id/btn1"
        android:layout_width="150dp"
        android:layout_height="79dp"
        android:text="Перейти к Activity 2"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.641" />
```
- Затем я внедрила логику в Activity 1 (MainActivity) для обработки нажатия на кнопку и перехода на Activity 2 с передачей параметра.
```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);

        // Обработчик нажатия на кнопку
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на второе активити и передача параметра
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("parameter", "Плотникова Вероника");
                startActivity(intent);
            }
        });
    }
}
```
- Далее я создала Activity 2 и соответствующую разметку activity_second.xml. 
- В разметку для Activity2 (activity_second.xml) я добавил TextView для отображения переданного параметра
```java
    <TextView
        android:id="@+id/textView"
        android:layout_width="251dp"
        android:layout_height="233dp"
        android:text="Переданный параметр:"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.343" />
```
- В завершение я настроила логику в Activity 2 (SecondActivity) для получения переданного параметра и его отображения в TextView.
```java
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получение переданного параметра
        Intent intent = getIntent();
        String parameter = intent.getStringExtra("parameter");

        // Обновляем текстовое поле с переданным параметром
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + parameter);
    }
}
```
