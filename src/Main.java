//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Student[] students = {
            new Student("Ana", 18.5),
            new Student("Luis", 16.0),
            new Student("Maria", 19.2),
            new Student("Pedro", 15.7),
            new Student("Sofia", 18.5)
    };
    int passes = 0;
//Sort
    for (int i = 0; i < students.length; i++) {
        passes++;
        for (int j = i + 1; j < students.length; j++) {

            if (students[j].note > students[i].note) {
                Student aux = students[i];
                students[i] = students[j];
                students[j] = aux;
            }
        }
    }

//Print
    for (int i = 0; i < 3 && i < students.length; i++) {
        System.out.println(students[i].name + ": " + students[i].note);
        passes++;
    }
//Iterations
    System.out.println("Passes: " + passes);
}

