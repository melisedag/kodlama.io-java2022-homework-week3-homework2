public abstract class GameCalculator {
    public abstract void hesapla(); //kim imp ediyorsa hesaplayı içermek zorunda
    // ve override etmek zorunda


    public final void gameOver(){ //gameover methodu degıstırılemez
        System.out.println("Oyun bitti");
    }
}
