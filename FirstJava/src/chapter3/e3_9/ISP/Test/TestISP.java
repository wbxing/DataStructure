package chapter3.e3_9.ISP.Test;

import chapter3.e3_9.ISP.Item;
import chapter3.e3_9.ISP.Product;
import chapter3.e3_9.ISP.Subitem;

public class TestISP {
    public static void main(String[] args) {
        Item item = new Item(1, "厨房用品", "-");

        Subitem [] subitems = new Subitem[3];
        subitems[0] = new Subitem(1001, "锅具", "=");
        subitems[1] = new Subitem(1002, "刀具", "=");
        subitems[2] = new Subitem(1003, "餐具", "=");

        Product [][] products = new Product[3][2];
        products[0][0] = new Product(10011, "蒸锅", 200.0);
        products[0][1] = new Product(10012, "炒锅", 100.0);
        products[1][0] = new Product(10021, "菜刀", 80.0);
        products[1][1] = new Product(10022, "水果刀", 20.0);
        products[2][0] = new Product(10031, "碗", 20.0);
        products[2][1] = new Product(10032, "筷子", 10.0);

        item.setSubitems(subitems);
        item.setProducts(new Product[] {products[0][0], products[0][1], products[1][0],products[1][1],
                products[2][0], products[2][1]});
        for (int x = 0; x < subitems.length; ++x) {
            subitems[x].setItem(item);
            subitems[x].setProducts(products[x]);
            products[x][0].setSubitem(subitems[x]);
            products[x][1].setSubitem(subitems[x]);
            products[x][0].setItem(item);
            products[x][1].setItem(item);
        }
        // 根据栏目取出商品
        System.out.println(item.getInfo());
        for (Product p : item.getProducts()) {
            System.out.println("\t|- " + p.getInfo());
        }

        // 根据栏目取出子栏目，再取出商品
        System.out.println(item.getInfo());
        for (Subitem s : item.getSubitems()) {
            System.out.println("\t|- " + s.getInfo());
            for (Product p : s.getProducts()) {
                System.out.println("\t\t|- " + p.getInfo());
            }
        }

        //根据商品取出子栏目，再取出栏目
        for (Product [] ps : products ) {
            for (Product p : ps) {
                System.out.println(p.getInfo());
                System.out.println("\t|- " + p.getSubitem().getInfo());
                System.out.println("\t\t|- " + p.getItem().getInfo());
            }
        }
    }
}
