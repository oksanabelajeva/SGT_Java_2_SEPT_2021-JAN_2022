import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { EcommerceServiceService } from '../ecommerce-service.service';
import { Product } from '../models/Product';
import { ProductOrder } from '../models/ProductOrder';
import { ProductOrders } from '../models/ProductOrders';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  productOrders: ProductOrder[] = [];
  products: Product[] = [];
  selectedProductOrder!: ProductOrder;
  private shoppingCartOrders!: ProductOrders;
  sub!: Subscription;
  productSelected: boolean = false;

  constructor(private ecommerceService: EcommerceServiceService) {}

  ngOnInit() {
      this.productOrders = [];
      this.loadProducts();
      this.loadOrders();
  }

  loadProducts() {
      this.ecommerceService.getAllProducts()
          .subscribe(
              (products: any[]) => {
                  this.products = products;
                  this.products.forEach(product => {
                      this.productOrders.push(new ProductOrder(product, 0));
                  })
              },
              (error: any) => console.log(error)
          );
  }

  loadOrders() {
      this.sub = this.ecommerceService.OrdersChanged.subscribe(() => {
          this.shoppingCartOrders = this.ecommerceService.orders;
      });
  }
}
