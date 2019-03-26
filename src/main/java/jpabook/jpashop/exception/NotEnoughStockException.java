package jpabook.jpashop.exception;

public class NotEnoughStockException extends Throwable {
    public NotEnoughStockException(String need_more_stock) {
        System.out.println(need_more_stock + "is short.");
    }
}
