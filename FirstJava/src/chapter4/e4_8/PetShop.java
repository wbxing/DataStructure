package chapter4.e4_8;

import chapter3.e3_13.LinkedList.Link;

/**
 * 宠物商店类
 */
public class PetShop {
    // 用链表保存宠物信息
    private Link pets = new Link();

    // 上架操作
    public void add(Pet pet) {
        this.pets.add(pet);
    }

    // 下架操作
    public void delete(Pet pet) {
        this.pets.remove(pet);
    }

    // 模糊查询
    public Link search(String keyWord) {
        Link result = new Link();
        Object [] objects = this.pets.toArray();
        for (Object o : objects) {
            Pet p = (Pet) o;
            if (p.getName().contains(keyWord)) {
                result.add(p);
            }
        }
        return result;
    }
}
