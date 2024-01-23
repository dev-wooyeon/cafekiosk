package sample.cafekiosk.spring.domain.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public enum ProductSellingStatus {

    SELLING("판매중"),
    HOLDING("판매 보류"),
    STOP_SELLING("판매중지");


    private final String text;

    public static List<ProductSellingStatus> forDisplay() {
        return List.of(SELLING, HOLDING);
    }
}
