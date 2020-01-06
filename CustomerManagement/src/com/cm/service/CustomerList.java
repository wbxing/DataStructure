package com.cm.service;

import com.cm.bean.Customer;

public class CustomerList {

    private Customer[] customers;
    private int total;

    public CustomerList() {
        this.customers = null;
        this.total = 0;
    }

    public CustomerList(int totalCustomers) {
        this();
        this.customers = new Customer[totalCustomers];
    }

    /**
     * 获取已经存储的客户数量
     * @return 客户数量
     */
    public int getTotal() {
        return total;
    }

    /**
     * 获取全部客户信息
     * @return 返回的客户信息
     */
    public Customer[] getCustomers() {
        Customer[] customer = new Customer[this.total];
        System.arraycopy(this.customers, 0, customer, 0, total);
        return customer;
    }

    /**
     * 获取指定位置的客户信息
     * @param index 指定的位置
     * @return 返回指定位置的客户信息，若不存在，返回null
     */
    public Customer getCustomers(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return this.customers[index];
    }

    /**
     * 将指定客户添加到数组之中
     *
     * @param customer 需要添加的客户
     * @return 添加成功返回 true，否则返回 false
     */
    public boolean addCustomer(Customer customer) {
        if (this.customers.length > total) {
            this.customers[total++] = customer;
            return true;
        }
        return false;
    }

    /**
     * 修改指定位置的客户信息
     *
     * @param index    需要修改的索引
     * @param customer 新的信息
     * @return 修改成功返回 true，否则返回 false
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index >= this.total) {
            return false;
        }
        this.customers[index] = customer;
        return true;
    }

    /**
     * 删除指定位置上的客户
     * @param index 需要删除的位置
     * @return 删除成功返回 true，否则返回 false
     */
    public boolean deleteCustomer(int index) {

        if (index < 0 || index >= this.total) {
            return false;
        }
        if (total - 1 - index - 1 >= 0)
            System.arraycopy(this.customers, index - 1 + 1,
                    this.customers, index - 1, total - 1 - index - 1);
        this.customers[--total] = null;
        return true;

    }


}
