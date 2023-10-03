public class Main {
    public static void main(String[] args) {
        Auto hybridAuto = new HybridAuto();
        Auto sedan = new Sedan();
        Auto f1Car = new F1Car();

        sedan.fill();
        hybridAuto.fill();
        f1Car.fill();

    }
}



class F1Car extends Auto {

    public F1Car() {
        this.fillStrategy = new F1PitstopStrategy();
    }
}




class HybridAuto extends Auto {

    public HybridAuto() {
        this.fillStrategy = new HybridFillStrategy();
    }
}



class Sedan extends Auto {

    public Sedan() {
        this.fillStrategy = new StandartStrategy();
    }
}



class Auto{
    FillStrategy fillStrategy;

    public void fill(){
        fillStrategy.fill();
    }
}


class HybridFillStrategy implements FillStrategy{
    @Override
    public void fill() {
        System.out.println("Заправляем бензином или электричеством на выбор!");
    }
}

class F1PitstopStrategy implements FillStrategy{
    @Override
    public void fill(){
        System.out.println("Заправляем бензин только после всех остальных процедур пит-стопа!");
    }
}

class StandartStrategy implements FillStrategy{
    @Override
    public void fill(){
        System.out.println("Просто заправляем бензин!");
    }
}



interface FillStrategy{
    public  void fill();
}

