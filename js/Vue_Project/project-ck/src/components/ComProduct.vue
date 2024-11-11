<template>
    <div class="menu">
              <h2 class="menu-title">Taste Our Foods & Enjoy</h2>
              <div class="menu-carousel">
                  <div class="menu-item">
                      <img src="" alt="Pumpkin Spice Juice">
                      <div class="menu-item-info">
                          <h3>ten</h3>
                          <p>noidung</p>
                      </div>
                  </div>
                  
                  
                  
              </div>
              <div class="category-nav">
                  <ul>
                      <li>
                          <a href="#">
                              <i class="fa fa-coffee"></i>
                              <span>Breakfast</span>
                          </a>
                      </li>
                      <li>
                          <a href="#">
                              <i class="fa fa-utensils"></i>
                              <span>Lunch</span>
                          </a>
                      </li>
                      <li>
                          <a href="#">
                              <i class="fa fa-drumstick-bite"></i>
                              <span>Dinner</span>
                          </a>
                      </li>
                      <li>
                          <a href="#">
                              <i class="fa fa-birthday-cake"></i>
                              <span>Desserts</span>
                          </a>
                      </li>
                      <li>
                          <a href="#">
                              <i class="fa fa-cocktail"></i>
                              <span>Drinks</span>
                          </a>
                      </li>
                  </ul>
              </div>
          </div>
  </template>
  
  <script>
  export default {
    // props:['tenbien']
  
  }
  </script>
  
  <style>
  .menu-item {
      position: relative;
      flex: 0 0 25%;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      border-radius: 8px;
      margin: 0 10px;
      overflow: hidden;
      transition: transform 0.3s ease;
  }
  
  .menu-item img {
      width: 100%;
      transition: transform 0.3s ease;
  }
  
  .menu-item-info {
      position: absolute;
      bottom: 0;
      left: 0;
      right: 0;
      background-color: rgba(0, 0, 0, 0.7);
      color: #fff;
      text-align: left;
      padding: 20px;
      opacity: 0;
      transition: opacity 0.3s ease;
  }
  
  .menu-item:hover .menu-item-info {
      opacity: 1;
  }
  
  .menu-item:hover img {
      transform: scale(1.1);
  }
  
  .menu-item-info h3 {
      font-size: 18px;
      margin: 0 0 10px;
  }
  
  .menu-item-info p {
      margin: 0;
      color: #ccc;
  }
  
  .menu-navigation {
      position: absolute;
      top: 50%;
      width: 100%;
      display: flex;
      justify-content: space-between;
      transform: translateY(-50%);
  }
  
  .menu-navigation i {
      background-color: rgba(0, 0, 0, 0.5);
      color: #fff;
      padding: 10px;
      border-radius: 50%;
      cursor: pointer;
      transition: background-color 0.3s ease;
  }
  
  .menu-navigation i:hover {
      background-color: #fcb034;
  }
  
  .category-nav {
      margin: 20px 0;
      display: flex;
      justify-content: center;
  }
  
  .category-nav ul {
      list-style: none;
      padding: 0;
      display: flex;
      justify-content: center;
  }
  
  .category-nav ul li {
      margin: 0 20px;
  }
  
  .category-nav ul li a {
      text-decoration: none;
      color: #666;
      display: flex;
      flex-direction: column;
      align-items: center;
      font-weight: bold;
      transition: color 0.3s ease;
  }
  
  .category-nav ul li a:hover {
      color: #000;
  }
  
  .category-nav ul li a span {
      margin-top: 5px;
  }
  
  .category-nav ul li a i {
      font-size: 24px;
  }
  </style>