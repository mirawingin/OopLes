package Lesson2;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Actor> queue;
    private Queue<Actor> market;

    public Market() {
        this.queue = new LinkedList<>();
        this.market = new LinkedList<>();
    }

    @Override
    public void addPersonToQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " добавлен(а) в очередь.");
    }

    @Override
    public Actor removePersonFromQueue() {
        Actor actor = queue.poll();
        if (actor != null) {
            System.out.println(actor.getName() + " удален(а) из очереди.");
        }
        return actor;
    }

    @Override
    public void enterMarket(Actor actor) {
        market.add(actor);
        System.out.println(actor.getName() + " вошел(а) в магазин.");
    }

    @Override
    public void exitMarket(Actor actor) {
        System.out.println(actor.getName() + " вышел(а) из магазина с продуктом " + actor.getProduct());
        market.remove(actor);
    }

    public void update() {
        // Отдаем заказы (люди выходят из магазина)
        Actor actorExiting = market.poll();
        if (actorExiting != null) {
            exitMarket(actorExiting);
        }

        // Удаляем человека из очереди и добавляем в магазин
        Actor actorEntering = removePersonFromQueue();
        if (actorEntering != null) {
            enterMarket(actorEntering);
        }
    }
}