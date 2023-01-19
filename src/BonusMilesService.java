public class BonusMilesService {
    public int calculate(int cost) { // входной параметр: cost типа int (подтягивает цену билета)
        int myMiles;//объявление переменной для количества миль.
        int percentInKopecks = 20;//стоимость одной бонусной мили в руб.
        myMiles = cost / percentInKopecks;//расчет количества миль за покупку билета.
        return myMiles;// возвращает рассчитанное количество миль
    }
}
